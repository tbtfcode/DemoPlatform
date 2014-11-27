/**
 * 
 */
package test.tbtf.demo.manager.sample.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.sample.controller
 * @file DOMSampleCommonController.java
 * @date 2014. 11. 27.
 * @author tbtf.base.code@gmail.com
 * @description
 */
@Controller
public class DOMSampleCommonController {

	@RequestMapping(value = "/sample/common")
	public ModelAndView requestSampleCommon(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.addObject("now", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
		mav.addObject("result", "HelloWorld~!");

		return mav;
	}

}
