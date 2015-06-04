/**
 * 
 */
package test.tbtf.demo.manager.common.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import test.tbtf.demo.manager.common.domain.DOMCodeGroup;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.common.dao
 * @file DOMCodeGroupDAO.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Repository
public interface DOMCodeGroupDAO {

	public DOMCodeGroup selectCodeGroup(DOMCodeGroup codeGroup) throws SQLException;

	public int insertCodeGroup(DOMCodeGroup codeGroup) throws SQLException;

	public int updateCodeGroup(DOMCodeGroup codeGroup) throws SQLException;

	public int deleteCodeGroup(DOMCodeGroup codeGroup) throws SQLException;

}
