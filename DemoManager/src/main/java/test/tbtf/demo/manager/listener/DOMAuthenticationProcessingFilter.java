/**
 * 
 */
package test.tbtf.demo.manager.listener;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.listener
 * @file DOMAuthenticationProcessingFilter.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationProcessingFilter extends UsernamePasswordAuthenticationFilter /* AbstractAuthenticationProcessingFilter */{

	/*
	private final Logger logger = Logger.getLogger(DOMAuthenticationProcessingFilter.class);

	protected DOMAuthenticationProcessingFilter() {
		super("/j_spring_security_check");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

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

		String principal = request.getParameter("j_username");
		String credentials = request.getParameter("j_password");

		if (principal == null || principal.trim().compareTo("") == 0) {
			principal = "";
		}
		if (credentials == null || credentials.trim().compareTo("") == 0) {
			credentials = "";
		}
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(principal, credentials);
		// authenticationToken.setDetails(new
		// WebAuthenticationDetails(request));

		return this.getAuthenticationManager().authenticate(authenticationToken);
	}
	 */
}
