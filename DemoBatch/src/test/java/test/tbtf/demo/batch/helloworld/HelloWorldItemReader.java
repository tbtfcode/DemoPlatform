/*
 * Copyright © 2017 TIBCO Software Inc. All rights reserved.
 */
package test.tbtf.demo.batch.helloworld;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * @project DemoBatch
 * @package test.tbtf.demo.batch.helloworld
 * @file HelloWorldItemReader.java
 * @date Jan 18, 2017
 * @author minlee@tibco.com
 * @description
 */
public class HelloWorldItemReader<T> implements ItemStreamReader<String> {

	private JobParameters jobParameters = null;

	private String requestGroupName;
	private int requestStxIdx;
	private int requestEtxIdx;
	private int requestNowIdx;

	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
//		System.out.println("HelloWorldItemReader.beforeStep()");
		jobParameters = stepExecution.getJobExecution().getJobParameters();
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemStream#open(org.springframework.batch.item.ExecutionContext)
	 */
	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		requestGroupName = executionContext.getString("request_group_name");
		requestStxIdx = executionContext.getInt("request_stx_idx");
		requestEtxIdx = executionContext.getInt("request_etx_idx");
		requestNowIdx = requestStxIdx;
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemReader#read()
	 */
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("[" + requestGroupName + "]:" + jobParameters.getString(String.format("request%d", requestNowIdx)));
		if (requestNowIdx < requestEtxIdx) {
			return jobParameters.getString(String.format("request%d", requestNowIdx++));
		} else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemStream#update(org.springframework.batch.item.ExecutionContext)
	 */
	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
//		System.out.println("HelloWorldItemReader.update()");
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemStream#close()
	 */
	@Override
	public void close() throws ItemStreamException {
//		System.out.println("HelloWorldItemReader.close()");
	}

}
