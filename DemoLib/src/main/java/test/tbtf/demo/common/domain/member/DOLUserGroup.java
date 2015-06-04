/**
 * 
 */
package test.tbtf.demo.common.domain.member;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.member
 * @file DOLUserGroup.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLUserGroup extends DOLBaseDomain {

	private static final long serialVersionUID = 8570370987747652473L;

	private String userGroupParentId;

	private String userGroupId;

	private String userGroupName;

	private String userGroupDescription;

	private int userGroupSequence;

	private String userGroupType;

	/**
	 * @return the userGroupParentId
	 */
	public String getUserGroupParentId() {
		return userGroupParentId;
	}

	/**
	 * @param userGroupParentId the userGroupParentId to set
	 */
	public void setUserGroupParentId(String userGroupParentId) {
		this.userGroupParentId = userGroupParentId;
	}

	/**
	 * @return the userGroupId
	 */
	public String getUserGroupId() {
		return userGroupId;
	}

	/**
	 * @param userGroupId the userGroupId to set
	 */
	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}

	/**
	 * @return the userGroupName
	 */
	public String getUserGroupName() {
		return userGroupName;
	}

	/**
	 * @param userGroupName the userGroupName to set
	 */
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}

	/**
	 * @return the userGroupDescription
	 */
	public String getUserGroupDescription() {
		return userGroupDescription;
	}

	/**
	 * @param userGroupDescription the userGroupDescription to set
	 */
	public void setUserGroupDescription(String userGroupDescription) {
		this.userGroupDescription = userGroupDescription;
	}

	/**
	 * @return the userGroupSequence
	 */
	public int getUserGroupSequence() {
		return userGroupSequence;
	}

	/**
	 * @param userGroupSequence the userGroupSequence to set
	 */
	public void setUserGroupSequence(int userGroupSequence) {
		this.userGroupSequence = userGroupSequence;
	}

	/**
	 * @return the userGroupType
	 */
	public String getUserGroupType() {
		return userGroupType;
	}

	/**
	 * @param userGroupType the userGroupType to set
	 */
	public void setUserGroupType(String userGroupType) {
		this.userGroupType = userGroupType;
	}

}
