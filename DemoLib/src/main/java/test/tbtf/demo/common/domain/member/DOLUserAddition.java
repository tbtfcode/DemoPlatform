/**
 * 
 */
package test.tbtf.demo.common.domain.member;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.member
 * @file DOLUserAddition.java
 * @date 2014. 12. 5.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLUserAddition extends DOLBaseDomain {

	private static final long serialVersionUID = 3864246815653859234L;

	private String userId;

	private String userAttributeKey;

	private String userAttributeValue;

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
	 * @return the userAttributeKey
	 */
	public String getUserAttributeKey() {
		return userAttributeKey;
	}

	/**
	 * @param userAttributeKey the userAttributeKey to set
	 */
	public void setUserAttributeKey(String userAttributeKey) {
		this.userAttributeKey = userAttributeKey;
	}

	/**
	 * @return the userAttributeValue
	 */
	public String getUserAttributeValue() {
		return userAttributeValue;
	}

	/**
	 * @param userAttributeValue the userAttributeValue to set
	 */
	public void setUserAttributeValue(String userAttributeValue) {
		this.userAttributeValue = userAttributeValue;
	}

}
