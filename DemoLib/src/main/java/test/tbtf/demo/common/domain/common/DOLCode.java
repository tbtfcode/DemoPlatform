/**
 * 
 */
package test.tbtf.demo.common.domain.common;

import test.tbtf.demo.common.domain.DOLBaseDomain;

/**
 * @project DemoLib
 * @package test.tbtf.demo.common.domain.common
 * @file DOLCode.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOLCode extends DOLBaseDomain {

	private static final long serialVersionUID = 3351569386812633982L;

	private String codeGroupId;

	private String codeId;

	private String codeName;

	private String codeDescription;

	private int codeSequence;

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
	 * @return the codeId
	 */
	public String getCodeId() {
		return codeId;
	}

	/**
	 * @param codeId the codeId to set
	 */
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	/**
	 * @return the codeName
	 */
	public String getCodeName() {
		return codeName;
	}

	/**
	 * @param codeName the codeName to set
	 */
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	/**
	 * @return the codeDescription
	 */
	public String getCodeDescription() {
		return codeDescription;
	}

	/**
	 * @param codeDescription the codeDescription to set
	 */
	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}

	/**
	 * @return the codeSequence
	 */
	public int getCodeSequence() {
		return codeSequence;
	}

	/**
	 * @param codeSequence the codeSequence to set
	 */
	public void setCodeSequence(int codeSequence) {
		this.codeSequence = codeSequence;
	}

}
