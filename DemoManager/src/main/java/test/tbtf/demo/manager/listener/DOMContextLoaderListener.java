/**
 * 
 */
package test.tbtf.demo.manager.listener;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.util.Log4jWebConfigurer;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.listener
 * @file DOMContextLoaderListener.java
 * @date 2014. 11. 27.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMContextLoaderListener extends ContextLoaderListener {

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {

		Log4jWebConfigurer.initLogging(event.getServletContext());

		super.contextInitialized(event);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent event) {

		Log4jWebConfigurer.shutdownLogging(event.getServletContext());

		super.contextDestroyed(event);
	}

}
