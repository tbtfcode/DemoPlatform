/**
 * 
 */
package test.tbtf.demo.manager.listener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.listener
 * @file DOMAuthenticationProcessingFilter.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationProcessingFilter extends AbstractAuthenticationProcessingFilter {

	private final Logger logger = Logger.getLogger(DOMAuthenticationProcessingFilter.class);

	protected DOMAuthenticationProcessingFilter() {
		super("/j_spring_security_check");
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

		AuthenticationUserInfo userInfo = (new ObjectMapper()).readValue(request.getInputStream(), AuthenticationUserInfo.class);

		logger.debug(String.format("userId:%s userPw:%s", userInfo.getPrincipal(), userInfo.getCredentials()));

		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userInfo.getPrincipal(), userInfo.getCredentials());
		authenticationToken.setDetails(new WebAuthenticationDetails(request));

		return this.getAuthenticationManager().authenticate(authenticationToken);
	}

}

@JsonIgnoreProperties(ignoreUnknown = true)
class AuthenticationUserInfo {

	@JsonProperty(value = "j_username")
	private String principal;

	@JsonProperty(value = "j_password")
	private String credentials;

	/**
	 * @return the principal
	 */
	public String getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/**
	 * @return the credentials
	 */
	public String getCredentials() {
		return credentials;
	}

	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

}
