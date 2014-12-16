/**
 * 
 */
package test.tbtf.demo.manager.listener;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.listener
 * @file DOMAuthenticationLogoutFilter.java
 * @date 2014. 12. 16.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationLogoutFilter extends LogoutFilter {

	private final Logger logger = Logger.getLogger(DOMAuthenticationLogoutFilter.class);

	/**
	 * @param logoutSuccessUrl
	 * @param handlers
	 */
	public DOMAuthenticationLogoutFilter(String logoutSuccessUrl, LogoutHandler... handlers) {
		super(logoutSuccessUrl, handlers);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		logger.debug("doFilter");
		super.doFilter(req, res, chain);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected boolean requiresLogout(HttpServletRequest request, HttpServletResponse response) {
		boolean result = super.requiresLogout(request, response);
		if (result) {
			return true;
		}

		if (request.getSession() != null) {
			logger.debug(String.format("[requiresLogout]%s", "request.getSession() != null"));
			// HttpSession httpSession = request.getSession();
			// httpSession.invalidate();
		} else {
			logger.debug(String.format("[requiresLogout]%s", "request.getSession() == null"));
		}
		logger.debug(String.format("[requiresLogout]%b", result));
		return false;
	}

}
