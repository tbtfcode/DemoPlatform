/**
 * 
 */
package test.tbtf.demo.manager.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationSuccessHandler.java
 * @date 2014. 12. 16.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private final Logger logger = Logger.getLogger(DOMAuthenticationSuccessHandler.class);

	/* (non-Javadoc)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		logger.debug(request);
		super.onAuthenticationSuccess(request, response, authentication);
	}

}
