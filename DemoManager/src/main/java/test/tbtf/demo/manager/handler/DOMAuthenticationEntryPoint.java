/**
 * 
 */
package test.tbtf.demo.manager.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationEntryPoint.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationEntryPoint implements AuthenticationEntryPoint {

	private final Logger logger = Logger.getLogger(DOMAuthenticationEntryPoint.class);

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
		logger.debug("commence");
		/*
		logger.debug("┌--- Request Header ---------------------------------------------------");
		Enumeration<?> enumeration = request.getHeaderNames();
		String headerKey = null;
		while (enumeration.hasMoreElements()) {
			headerKey = String.valueOf(enumeration.nextElement());
			logger.debug(String.format("%s | %s", headerKey, request.getHeader(headerKey)));
		}
		logger.debug("│--- Request Parameter ------------------------------------------------");
		enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			headerKey = String.valueOf(enumeration.nextElement());
			logger.debug(String.format("%s | %s", headerKey, request.getParameter(headerKey)));
		}
		logger.debug("│--- Reqeust Attribute ------------------------------------------------");
		enumeration = request.getAttributeNames();
		while (enumeration.hasMoreElements()) {
			headerKey = String.valueOf(enumeration.nextElement());
			logger.debug(String.format("%s | %s", headerKey, request.getAttribute(headerKey)));
		}
		logger.debug("│--- HttpServletResponse &  AuthenticationException -------------------");
		logger.debug(response);
		logger.debug(authException);
		logger.debug("└----------------------------------------------------------------------");
		*/
	}

}
