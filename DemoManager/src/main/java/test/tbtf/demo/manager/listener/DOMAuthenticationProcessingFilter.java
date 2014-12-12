/**
 * 
 */
package test.tbtf.demo.manager.listener;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.listener
 * @file DOMAuthenticationProcessingFilter.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationProcessingFilter extends UsernamePasswordAuthenticationFilter {

	private final Logger logger = Logger.getLogger(DOMAuthenticationProcessingFilter.class);

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected String obtainPassword(HttpServletRequest request) {
		logger.debug("----- obtainPassword");
		logger.debug(request);
		return super.obtainPassword(request);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected String obtainUsername(HttpServletRequest request) {
		logger.debug("----- obtainUsername");
		logger.debug(request);
		return super.obtainUsername(request);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void setPasswordParameter(String passwordParameter) {
		logger.debug("----- setPasswordParameter");
		logger.debug(passwordParameter);
		super.setPasswordParameter(passwordParameter);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void setUsernameParameter(String usernameParameter) {
		logger.debug("----- setUsernameParameter");
		logger.debug(usernameParameter);
		super.setUsernameParameter(usernameParameter);
	}

}
