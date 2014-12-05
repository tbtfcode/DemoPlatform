/**
 * 
 */
package test.tbtf.demo.manager.member.biz;

import test.tbtf.demo.manager.member.domain.DOMUser;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.biz
 * @file DOMMemberBiz.java
 * @date 2014. 12. 4.
 * @author tbtf.base.code@gmail.com
 * @description 
 */
public interface DOMMemberBiz {

	public DOMUser getUser(DOMUser user) throws Exception;

}
