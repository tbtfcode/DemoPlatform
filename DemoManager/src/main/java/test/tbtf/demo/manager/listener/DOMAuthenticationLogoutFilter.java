/**
 * 
 */
package test.tbtf.demo.manager.listener;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

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
	 * @param logoutSuccessHandler
	 * @param handlers
	 * @deprecated
	 */
	public DOMAuthenticationLogoutFilter(LogoutSuccessHandler logoutSuccessHandler, LogoutHandler... handlers) {
		super(logoutSuccessHandler, handlers);
	}

	/**
	 * @param logoutSuccessUrl
	 * @param handlers
	 */
	public DOMAuthenticationLogoutFilter(String logoutSuccessUrl, LogoutHandler... handlers) {
		super(logoutSuccessUrl, handlers);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected boolean requiresLogout(HttpServletRequest request, HttpServletResponse response) {

		java.util.Enumeration<?> enumeration = null;
		String headerKey = null;
		/*
		logger.debug("┌--- Request Header ---------------------------------------------------");
		enumeration = request.getHeaderNames();
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
		 */
		logger.debug("│--- Session Attribute ------------------------------------------------");
		// TODO Session defined by user(Custom)
		HttpSession httpSession = request.getSession(false);
		if (httpSession != null) {
			enumeration = httpSession.getAttributeNames();
			while (enumeration.hasMoreElements()) {
				headerKey = String.valueOf(enumeration.nextElement());
				logger.debug(String.format("%s | %s", headerKey, httpSession.getAttribute(headerKey)));
			}
		}

		return super.requiresLogout(request, response);
	}

}
