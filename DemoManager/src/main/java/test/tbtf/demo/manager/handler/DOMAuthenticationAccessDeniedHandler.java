/**
 * 
 */
package test.tbtf.demo.manager.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationAccessDeniedHandler.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationAccessDeniedHandler implements AccessDeniedHandler {

	private final Logger logger = Logger.getLogger(DOMAuthenticationAccessDeniedHandler.class);

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {

		logger.error(accessDeniedException);

		request.setAttribute("reqError", accessDeniedException);
		response.setHeader("resError", accessDeniedException.getMessage());

		response.sendError(403, accessDeniedException.getMessage());
	}

}
