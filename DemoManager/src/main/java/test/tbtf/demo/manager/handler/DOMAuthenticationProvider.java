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
import org.springframework.stereotype.Component;

import test.tbtf.demo.manager.member.domain.DOMUser;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationProvider.java
 * @date 2014. 12. 9.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Component
public class DOMAuthenticationProvider implements AuthenticationProvider {

	private final Logger logger = Logger.getLogger(DOMAuthenticationProvider.class);

	/*
	 * (non-Javadoc)
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String principal = (String) authentication.getPrincipal();
		String credentials = (String) authentication.getCredentials();
		// check whether user's credentials are valid.
		// if false, throw new
		// BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials",
		// "Bad credentials"));
		logger.debug(String.format("userId:%s userPw:%s", principal, credentials));

		if (credentials.compareTo("test123!@#") != 0) {
			throw new BadCredentialsException("Bad Credentials");
		}

		java.util.List<GrantedAuthority> grantedAuthorities = new java.util.ArrayList<GrantedAuthority>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(principal, credentials, grantedAuthorities);

		DOMUser user = new DOMUser();
		user.setPrincipal(principal);
		user.setCredentials(credentials);
		user.setAuthorities(grantedAuthorities);

		authenticationToken.setDetails(new DOMUser());

		return authenticationToken;

	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean supports(Class<?> authentication) {
		// System.out.println(authentication.equals(UsernamePasswordAuthenticationToken.class));
		// System.out.println(UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));

		return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
	}

}
