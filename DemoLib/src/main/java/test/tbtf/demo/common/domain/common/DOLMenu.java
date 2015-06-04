/**
 * 
 */
package test.tbtf.demo.common.domain.common;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.common
 * @file DOLMenu.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLMenu extends DOLBaseDomain {

	private static final long serialVersionUID = -1680766091439962666L;

	private String menuGroupId;

	private String menuId;

	private String menuName;

	private String menuDescription;

	private int menuSequence;

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
	 * @return the menuId
	 */
	public String getMenuId() {
		return menuId;
	}

	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * @return the menuDescription
	 */
	public String getMenuDescription() {
		return menuDescription;
	}

	/**
	 * @param menuDescription the menuDescription to set
	 */
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

	/**
	 * @return the menuSequence
	 */
	public int getMenuSequence() {
		return menuSequence;
	}

	/**
	 * @param menuSequence the menuSequence to set
	 */
	public void setMenuSequence(int menuSequence) {
		this.menuSequence = menuSequence;
	}

}
