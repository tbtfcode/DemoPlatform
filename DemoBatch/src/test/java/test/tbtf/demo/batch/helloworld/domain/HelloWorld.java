/*
 * Copyright © 2017 TIBCO Software Inc. All rights reserved.
 */
package test.tbtf.demo.batch.helloworld.domain;

/**
 * @project DemoBatch
 * @package test.tbtf.demo.batch.helloworld.domain
 * @file HelloWorld.java
 * @date Jan 18, 2017
 * @author minlee@tibco.com
 * @description
 */
public class HelloWorld {

	private java.util.List<HelloWorldDaemon> daemonList;

	public HelloWorld() {
		this.daemonList = new java.util.ArrayList<HelloWorldDaemon>();
	}

	public void add(HelloWorldDaemon daemon) {
		daemonList.add(daemon);
	}

	/**
	 * @return the daemonList
	 */
	public java.util.List<HelloWorldDaemon> getDaemonList() {
		return daemonList;
	}

}
