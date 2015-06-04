/**
 * 
 */
package test.tbtf.demo.manager.member.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import test.tbtf.demo.manager.member.domain.DOMUserGroup;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.dao
 * @file DOMUserGroupDAO.java
 * @date 2015. 6. 2.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Repository
public interface DOMUserGroupDAO {

	public DOMUserGroup selectUserGroup(DOMUserGroup userGroup) throws SQLException;

	public int insertUserGroup(DOMUserGroup userGroup) throws SQLException;

	public int updateUserGroup(DOMUserGroup userGroup) throws SQLException;

	public int deleteUserGroup(DOMUserGroup UserGroup) throws SQLException;

}
