/**
 * 
 */
package test.tbtf.demo.manager.listener;

import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationEntryPoint.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint /*implements AuthenticationEntryPoint*/ {

	// private final Logger logger = Logger.getLogger(DOMAuthenticationEntryPoint.class);

	public DOMAuthenticationEntryPoint(String loginFormUrl) {
		super(loginFormUrl);
	}

	/*
	public DOMAuthenticationEntryPoint() {
		super("/login.do");
	}
	 */

	/*
	 * (non-Javadoc)
	 */
	/*
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
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
		logger.debug(authException);
		if (authException instanceof InsufficientAuthenticationException) {
			// logger.debug("sendRedirect::/j_spring_security_logout ???");
			// response.sendRedirect("/j_spring_security_logout");
		}
		// logger.debug(request.getCookies());
		logger.debug("└----------------------------------------------------------------------");
		super.commence(request, response, authException);
	}
	 */

}
