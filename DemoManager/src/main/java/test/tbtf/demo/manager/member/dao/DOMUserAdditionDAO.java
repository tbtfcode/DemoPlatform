/**
 * 
 */
package test.tbtf.demo.manager.member.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import test.tbtf.demo.manager.member.domain.DOMUserAddition;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.dao
 * @file DOMUserAdditionDAO.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Repository
public interface DOMUserAdditionDAO {

	public DOMUserAddition selectUserAddition(DOMUserAddition userAddition) throws SQLException;

	public int insertUserAddition(DOMUserAddition userAddition) throws SQLException;

	public int updateUserAddition(DOMUserAddition userAddition) throws SQLException;

	public int deleteUserAddition(DOMUserAddition userAddition) throws SQLException;

}
