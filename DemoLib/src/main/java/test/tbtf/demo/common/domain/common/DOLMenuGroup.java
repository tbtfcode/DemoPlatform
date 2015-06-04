/**
 * 
 */
package test.tbtf.demo.common.domain.common;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.common
 * @file DOLMenuGroup.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLMenuGroup extends DOLBaseDomain {

	private static final long serialVersionUID = -1292618172591804332L;

	private String menuGroupId;

	private String menuGroupName;

	private String menuGroupDescription;

	private int menuGroupSequence;

	/**
	 * @return the menuGroupId
	 */
	public String getMenuGroupId() {
		return menuGroupId;
	}

	/**
	 * @param menuGroupId the menuGroupId to set
	 */
	public void setMenuGroupId(String menuGroupId) {
		this.menuGroupId = menuGroupId;
	}

	/**
	 * @return the menuGroupName
	 */
	public String getMenuGroupName() {
		return menuGroupName;
	}

	/**
	 * @param menuGroupName the menuGroupName to set
	 */
	public void setMenuGroupName(String menuGroupName) {
		this.menuGroupName = menuGroupName;
	}

	/**
	 * @return the menuGroupDescription
	 */
	public String getMenuGroupDescription() {
		return menuGroupDescription;
	}

	/**
	 * @param menuGroupDescription the menuGroupDescription to set
	 */
	public void setMenuGroupDescription(String menuGroupDescription) {
		this.menuGroupDescription = menuGroupDescription;
	}

	/**
	 * @return the menuGroupSequence
	 */
	public int getMenuGroupSequence() {
		return menuGroupSequence;
	}

	/**
	 * @param menuGroupSequence the menuGroupSequence to set
	 */
	public void setMenuGroupSequence(int menuGroupSequence) {
		this.menuGroupSequence = menuGroupSequence;
	}

}
