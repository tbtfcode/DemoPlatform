/**
 * 
 */
package test.tbtf.demo.manager.member.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import test.tbtf.demo.common.domain.member.DOLUser;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.domain
 * @file DOMUser.java
 * @date 2014. 12. 4.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMUser extends DOLUser implements UserDetails {

	private static final long serialVersionUID = 3327941545935741635L;

	private Collection<? extends GrantedAuthority> authorities;

	private String principal;

	private String credentials;

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	/**
	 */
	@Override
	public String getUsername() {
		return this.principal;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public String getPassword() {
		return this.credentials;
	}

	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

}
