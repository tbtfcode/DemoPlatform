/**
 * 
 */
package test.tbtf.demo.manager.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMHandlerInterceptor.java
 * @date 2014. 11. 27.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMHandlerInterceptor implements HandlerInterceptor {

	final Logger logger = Logger.getLogger(DOMHandlerInterceptor.class);

	/*
	 * (non-Javadoc)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.debug("preHandle");
		return true;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		logger.debug("postHandle");
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {
		logger.debug("afterCompletion");
	}

}
