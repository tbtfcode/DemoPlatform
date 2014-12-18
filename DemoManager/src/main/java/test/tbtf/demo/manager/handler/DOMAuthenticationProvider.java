/**
 * 
 */
package test.tbtf.demo.manager.handler;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationProvider.java
 * @date 2014. 12. 9.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMAuthenticationProvider implements AuthenticationProvider {

	private final Logger logger = Logger.getLogger(DOMAuthenticationProvider.class);

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String principal = (String) authentication.getPrincipal();
		String credentials = (String) authentication.getCredentials();

		logger.debug(String.format("[%s]userId:%s userPw:%s", authentication.getName(), principal, credentials));
		if (credentials.compareTo("test123!@#") != 0) {
			// authentication.setAuthenticated(false);
			throw new BadCredentialsException("Bad Credentials");
		}

		java.util.List<GrantedAuthority> grantedAuthorities = new java.util.ArrayList<GrantedAuthority>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(principal, credentials, grantedAuthorities);

		authenticationToken.setDetails(new User(principal, credentials, grantedAuthorities));

		return authenticationToken;

	}

}
