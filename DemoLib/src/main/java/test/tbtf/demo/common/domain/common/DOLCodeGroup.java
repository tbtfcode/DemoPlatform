/**
 * 
 */
package test.tbtf.demo.common.domain.common;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.common
 * @file DOLCodeGroup.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLCodeGroup extends DOLBaseDomain {

	private static final long serialVersionUID = -8017754704363279261L;

	private String codeGroupId;

	private String codeGroupName;

	private String codeGroupDescription;

	private String codeGroupColumn;

	/**
	 * @return the codeGroupId
	 */
	public String getCodeGroupId() {
		return codeGroupId;
	}

	/**
	 * @param codeGroupId the codeGroupId to set
	 */
	public void setCodeGroupId(String codeGroupId) {
		this.codeGroupId = codeGroupId;
	}

	/**
	 * @return the codeGroupName
	 */
	public String getCodeGroupName() {
		return codeGroupName;
	}

	/**
	 * @param codeGroupName the codeGroupName to set
	 */
	public void setCodeGroupName(String codeGroupName) {
		this.codeGroupName = codeGroupName;
	}

	/**
	 * @return the codeGroupDescription
	 */
	public String getCodeGroupDescription() {
		return codeGroupDescription;
	}

	/**
	 * @param codeGroupDescription the codeGroupDescription to set
	 */
	public void setCodeGroupDescription(String codeGroupDescription) {
		this.codeGroupDescription = codeGroupDescription;
	}

	/**
	 * @return the codeGroupColumn
	 */
	public String getCodeGroupColumn() {
		return codeGroupColumn;
	}

	/**
	 * @param codeGroupColumn the codeGroupColumn to set
	 */
	public void setCodeGroupColumn(String codeGroupColumn) {
		this.codeGroupColumn = codeGroupColumn;
	}

}
