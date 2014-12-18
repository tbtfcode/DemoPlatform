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

	@RequestMapping(value = "/signup")
	public ModelAndView viewSignup(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		/*
		 * 1] ...
		 * 2] user token generation....
		 */
		mav.setViewName("sample/viewSample");

		return mav;
	}

	@RequestMapping(value = "/signin")
	public ModelAndView viewSignin(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.setViewName("member/viewSignin");

		return mav;
	}
/*

	@RequestMapping(value = "/signout")
	public ModelAndView viewSignout(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.setViewName("member/viewSignout");

		return mav;
	}
*/
}
