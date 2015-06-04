/**
 * 
 */
package test.tbtf.demo.manager.common.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import test.tbtf.demo.manager.common.domain.DOMCode;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.common.dao
 * @file DOMCodeDAO.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Repository
public interface DOMCodeDAO {

	public DOMCode selectCode(DOMCode code) throws SQLException;

	public int insertCode(DOMCode code) throws SQLException;

	public int updateCode(DOMCode code) throws SQLException;

	public int deleteCode(DOMCode code) throws SQLException;

}
