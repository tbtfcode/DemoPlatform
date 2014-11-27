/**
 * 
 */
package test.tbtf.demo.common.domain;

import java.io.Serializable;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain
 * @file DOLBaseDomain.java
 * @date 2014. 11. 17.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLBaseDomain implements Serializable {

	private static final long serialVersionUID = -752310868634636619L;

	private String insertUserId;

	private java.util.Date insertDate;

	private String updateUserId;

	private java.util.Date updateDate;

	private char deleteYn;

	/**
	 * @return the insertUserId
	 */
	public String getInsertUserId() {
		return insertUserId;
	}

	/**
	 * @param insertUserId the insertUserId to set
	 */
	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}

	/**
	 * @return the insertDate
	 */
	public java.util.Date getInsertDate() {
		return insertDate;
	}

	/**
	 * @param insertDate the insertDate to set
	 */
	public void setInsertDate(java.util.Date insertDate) {
		this.insertDate = insertDate;
	}

	/**
	 * @return the updateUserId
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * @param updateUserId the updateUserId to set
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	/**
	 * @return the updateDate
	 */
	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the deleteYn
	 */
	public char getDeleteYn() {
		return deleteYn;
	}

	/**
	 * @param deleteYn the deleteYn to set
	 */
	public void setDeleteYn(char deleteYn) {
		this.deleteYn = deleteYn;
	}

}
