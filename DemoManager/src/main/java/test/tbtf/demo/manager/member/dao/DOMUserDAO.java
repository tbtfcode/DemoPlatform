/**
 * 
 */
package test.tbtf.demo.manager.member.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import test.tbtf.demo.manager.member.domain.DOMUser;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.dao
 * @file DOMUserDAO.java
 * @date 2014. 12. 4.
 * @author tbtf.base.code@gmail.com
 * @description 
 */
@Repository
public interface DOMUserDAO {

	public DOMUser selectUser(DOMUser user) throws SQLException;

	public int insertUser(DOMUser user) throws SQLException;

	public int updateUser(DOMUser user) throws SQLException;

	public int deleteUser(DOMUser user) throws SQLException;

}
