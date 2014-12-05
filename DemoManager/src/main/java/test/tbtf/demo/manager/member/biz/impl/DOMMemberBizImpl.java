/**
 * 
 */
package test.tbtf.demo.manager.member.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import test.tbtf.demo.manager.member.biz.DOMMemberBiz;
import test.tbtf.demo.manager.member.dao.DOMUserDAO;
import test.tbtf.demo.manager.member.domain.DOMUser;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.biz.impl
 * @file DOMMemberBizImpl.java
 * @date 2014. 12. 4.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Component
public class DOMMemberBizImpl implements DOMMemberBiz {

	@Autowired
	private DOMUserDAO userDAO;

	/*
	 * (non-Javadoc)
	 */
	@Override
	public DOMUser getUser(DOMUser user) throws Exception {

		return userDAO.selectUser(user);
	}

}
