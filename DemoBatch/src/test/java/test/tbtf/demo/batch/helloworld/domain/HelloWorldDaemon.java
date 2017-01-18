/*
 * Copyright © 2017 TIBCO Software Inc. All rights reserved.
 */
package test.tbtf.demo.batch.helloworld.domain;

/**
 * @project DemoBatch
 * @package test.tbtf.demo.batch.helloworld
 * @file HelloWorldDeamon.java
 * @date Jan 18, 2017
 * @author minlee@tibco.com
 * @description
 */
public class HelloWorldDaemon {

	private String schema;

	private String host;

	private int port;

	private String path;

	public HelloWorldDaemon(String schema, String host, int port, String path) {
		this.schema = schema;
		this.host = host;
		this.port = port;
		this.path = path;
	}

	public String makeURL() {
		return String.format("%s://%s:%d/%s", schema, host, port, path);
	}
}
