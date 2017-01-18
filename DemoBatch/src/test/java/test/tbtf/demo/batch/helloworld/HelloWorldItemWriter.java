/*
 * Copyright © 2017 TIBCO Software Inc. All rights reserved.
 */
package test.tbtf.demo.batch.helloworld;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemWriter;

/**
 * @project DemoBatch
 * @package test.tbtf.demo.batch.helloworld
 * @file HelloWorldItemWriter.java
 * @date Jan 18, 2017
 * @author minlee@tibco.com
 * @description
 */
public class HelloWorldItemWriter<T> implements ItemWriter<T> {

//	@BeforeStep
//	public void beforeStep(StepExecution stepExecution) {
//		System.out.println("HelloWorldItemWriter.beforeStep()");
//	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	@Override
	public void write(java.util.List<? extends T> item) throws Exception {
		System.out.println("HelloWorldItemWriter.write()");
	}

}
