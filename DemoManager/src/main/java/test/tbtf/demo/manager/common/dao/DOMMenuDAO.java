/**
 * 
 */
package test.tbtf.demo.manager.common.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import test.tbtf.demo.manager.common.domain.DOMMenu;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.common.dao
 * @file DOMMenuDAO.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Repository
public interface DOMMenuDAO {

	public DOMMenu selectMenu(DOMMenu menu) throws SQLException;

	public int insertMenu(DOMMenu menu) throws SQLException;

	public int updateMenu(DOMMenu menu) throws SQLException;

	public int deleteMenu(DOMMenu menu) throws SQLException;

}
