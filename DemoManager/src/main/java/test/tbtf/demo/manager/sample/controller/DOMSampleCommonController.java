/**
 * 
 */
package test.tbtf.demo.manager.sample.controller;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.tbtf.demo.manager.member.dao.DOMUserDAO;
import test.tbtf.demo.manager.member.domain.DOMUser;
import test.tbtf.demo.manager.member.service.DOMMemberService;

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

	@Autowired
	private DOMUserDAO userDAO;

	@Autowired
	private DOMMemberService memberService;

	@RequestMapping(value = "/sample/viewSample")
	public ModelAndView viewSample(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		DOMUser user = new DOMUser();
		user.setUserId("test");

		memberService.getUser(user);

		mav.addObject("now", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
		mav.addObject("result", "HelloWorld~!");

		mav.setViewName("sample/viewSample");

		return mav;
	}

	@RequestMapping(value = "/sample/viewSamplePopup")
	public ModelAndView viewSamplePopup(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.setViewName("sample/viewSamplePopup");

		return mav;
	}

	@RequestMapping(value = "/member/common")
	public ModelAndView requestMemberCommon(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("");

		mav.addObject("now", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
		mav.addObject("result", "HelloWorld~!");

		mav.setViewName("member/common");

		return mav;
	}

	public static String byteToHexString(byte[] byteArray) {

		StringBuilder stringBuilder = new StringBuilder();

		String hexNumber = null;
		for (byte b : byteArray) {
			hexNumber = "0".concat(Integer.toHexString(0xff & b)).toUpperCase();
			stringBuilder.append(hexNumber.substring(hexNumber.length() - 2));
			// stringBuilder.append(":");
		}

		return stringBuilder.toString();
	}

	// http://www.openeg.co.kr/294
	public static void main(String[] args) {

		String userid = "tbtf.base.code@gmail.com";
		String passwd = "S3minho!@";
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");

			messageDigest.update(userid.getBytes());
			System.out.println(String.format("[MD5   ]USER ID:=%s", byteToHexString(messageDigest.digest())));

			SecretKeySpec key = new SecretKeySpec(messageDigest.digest(), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			// cipher.init(Cipher.ENCRYPT_MODE, key);
			cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec("asdfqwerzxcvtyui".getBytes("UTF-8")));

			messageDigest.update(passwd.getBytes());
			System.out.println(String.format("[MD5   ]USER PW:=%s", byteToHexString(messageDigest.digest())));

			byte[] encrypted = cipher.doFinal(messageDigest.digest());
			System.out.println(String.format("[AES   ]USER PW:=%s", byteToHexString(encrypted)));

			messageDigest.update(encrypted);
			System.out.println(String.format("[AESMD5]USER PW:=%s", byteToHexString(messageDigest.digest())));
			/*
			 * [MD5 ]USER ID:=D23AD20597EDC2FE295757DC1F44E080 [MD5 ]USER
			 * PW:=4568B36394C829285F6D773E0950E5A0 [AES ]USER
			 * PW:=31C8E7FD504F8EAFCBF9479D56373F4BE50C38F6375C6657FD7976353ED62049
			 * [AESMD5]USER PW:=4A54DE39C7B6D1DD98287F0228384256
			 * 
			 * [MD5 ]USER ID:=D23AD20597EDC2FE295757DC1F44E080 [MD5 ]USER
			 * PW:=4568B36394C829285F6D773E0950E5A0 [AES ]USER
			 * PW:=640E4A080FB75D3C36EBF1839968BD47C9ED7D016E84BCC21B93DB654EDC98D8
			 * [AESMD5]USER PW:=B5AACF9B39CFA0F934928E7D63780C59
			 */
			args = null;
			args = new String[] { "member", "career", "sample", "sampol", "SAmple" };

			for (String str : args) {
				System.out.print(String.format("%s:=", str));
				System.out.println(Pattern.compile("^(sample)").matcher(str).matches());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
