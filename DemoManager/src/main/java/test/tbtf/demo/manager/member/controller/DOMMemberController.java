/**
 * 
 */
package test.tbtf.demo.manager.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.member.controller
 * @file DOMMemberController.java
 * @date 2014. 12. 5.
 * @author tbtf.base.code@gmail.com
 * @description 
 */
@Controller
public class DOMMemberController {

	@RequestMapping(value = "/login")
	public ModelAndView viewLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.setViewName("member/viewLogin");

		return mav;
	}

	@RequestMapping(value = "/logout")
	public ModelAndView viewLogout(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.setViewName("member/viewLogout");

		return mav;
	}

}
