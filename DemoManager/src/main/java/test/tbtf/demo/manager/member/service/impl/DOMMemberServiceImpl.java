/**
 * 
 */
package test.tbtf.demo.manager.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.tbtf.demo.manager.member.biz.DOMMemberBiz;
import test.tbtf.demo.manager.member.domain.DOMUser;
import test.tbtf.demo.manager.member.service.DOMMemberService;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.service.impl
 * @file DOMMemberServiceImpl.java
 * @date 2014. 12. 4.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Service
public class DOMMemberServiceImpl implements DOMMemberService {

	@Autowired
	private DOMMemberBiz memberBiz;

	/*
	 * (non-Javadoc)
	 */
	@Override
	public DOMUser getUser(DOMUser user) throws Exception {
		return memberBiz.getUser(user);
	}

}
