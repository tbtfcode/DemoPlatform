/*
 * Copyright © 2017 TIBCO Software Inc. All rights reserved.
 */
package test.tbtf.demo.batch.helloworld;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import test.tbtf.demo.batch.helloworld.domain.HelloWorld;
import test.tbtf.demo.batch.helloworld.domain.HelloWorldDaemon;

/**
 * @project DemoBatch
 * @package test.tbtf.demo.batch.helloworld
 * @file HelloWorldRunner.java
 * @date Jan 18, 2017
 * @author minlee@tibco.com
 * @description
 */
public class HelloWorldRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HelloWorldRunner helloWorld = new HelloWorldRunner();
//		helloWorld.makeXmlData("./test.xml");
//		System.exit(1);

		String[] configLocations = {
				"test/tbtf/demo/batch/configuration/application-batch-context.xml",
				"test/tbtf/demo/batch/jobs/application-helloworld-job.xml" };

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);

		JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
		Job job = (Job) applicationContext.getBean("helloWorldJob");

		JobParametersBuilder jobParametersBuilder = helloWorld.parseXmlToObject("./test.xml");
		jobParametersBuilder.addLong("request_thread_group", 10L);
		try {
			JobExecution jobExecution = jobLauncher.run(job, jobParametersBuilder.toJobParameters());
			System.out.println(String.format("Exit Status: %s", jobExecution.getStatus()));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void makeXmlData(String filePath) {

		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(filePath));

			bufferedWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			bufferedWriter.write("<rendezvous>\n");
			bufferedWriter.flush();

			for(int i = 1; i < 100; i++) {
				bufferedWriter.write("\t<daemon>\n");
				bufferedWriter.write(String.format("\t\t<schema>http</schema>\n", ""));
				bufferedWriter.write(String.format("\t\t<host>localhost</host>\n", ""));
				bufferedWriter.write(String.format("\t\t<port>%d</port>\n", 7580 + i));
				bufferedWriter.write(String.format("\t\t<path>sample/test.html</path>\n", ""));
				bufferedWriter.write("\t</daemon>\n");
				bufferedWriter.flush();
			}

			bufferedWriter.write("</rendezvous>\n");
			bufferedWriter.flush();
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
					bufferedWriter = null;
				}
			} catch (Throwable e) {
				// skip...
			}
		}
	}

	public JobParametersBuilder parseXmlToObject(String filePath) {
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("rendezvous", HelloWorld.class);
		xstream.alias("daemon", HelloWorldDaemon.class);
		xstream.addImplicitCollection(HelloWorld.class, "daemonList");

		HelloWorld helloWorld = (HelloWorld) xstream.fromXML(new File(filePath));

		long count = 0;
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		for (HelloWorldDaemon daemon : helloWorld.getDaemonList()) {
			// System.out.println(String.format("%d\t%s", ++count, daemon.makeURL()));
			jobParametersBuilder.addString(String.format("request%d", ++count), daemon.makeURL());
		}
		jobParametersBuilder.addLong("request_total_value", count);

		return jobParametersBuilder;
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setSchema("http");
//		helloWorld.setHost("localhost");
//		helloWorld.setPort(7581);
//		helloWorld.setPath("sample/test.html");
//
//		XStream xstream = new XStream();
//		xstream.alias("daemon", HelloWorld.class);
//		System.out.println(xstream.toXML(helloWorld));
	}
}
