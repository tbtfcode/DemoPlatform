/**
 * 
 */
package test.tbtf.demo.common.domain.member;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.member
 * @file DOLUsers.java
 * @date 2014. 11. 13.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLUsers extends DOLBaseDomain {

	private static final long serialVersionUID = -3553843079369040628L;

	private String userId;

	private String userName;

	private String userCurrentEmail;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userCurrentEmail
	 */
	public String getUserCurrentEmail() {
		return userCurrentEmail;
	}

	/**
	 * @param userCurrentEmail the userCurrentEmail to set
	 */
	public void setUserCurrentEmail(String userCurrentEmail) {
		this.userCurrentEmail = userCurrentEmail;
	}

}
