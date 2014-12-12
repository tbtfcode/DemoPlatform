/**
 * 
 */
package test.tbtf.demo.manager.handler;

import java.util.Enumeration;

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

		logger.debug("┌----------------------------------------------------------------------");
		Enumeration<?> enumeration = request.getHeaderNames();
		String headerKey = null;
		while (enumeration.hasMoreElements()) {
			headerKey = String.valueOf(enumeration.nextElement());
			logger.debug(String.format("%s | %s", headerKey, request.getHeader(headerKey)));
		}
		logger.debug("│----------------------------------------------------------------------");
		enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			headerKey = String.valueOf(enumeration.nextElement());
			logger.debug(String.format("%s | %s", headerKey, request.getParameter(headerKey)));
		}
		logger.debug("│----------------------------------------------------------------------");
		enumeration = request.getAttributeNames();
		while (enumeration.hasMoreElements()) {
			headerKey = String.valueOf(enumeration.nextElement());
			logger.debug(String.format("%s | %s", headerKey, request.getAttribute(headerKey)));
		}
		logger.debug("└----------------------------------------------------------------------");
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
