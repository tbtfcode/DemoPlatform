/**
 * 
 */
package test.tbtf.demo.manager.handler;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMLoggingAspect.java
 * @date 2014. 11. 27.
 * @author tbtf.base.code@gmail.com
 * @description
 */
public class DOMLoggingAspect {

	private long startTime;

	public void beforeLogging(JoinPoint joinPoint) {

		Logger logger = Logger.getLogger(joinPoint.getTarget().getClass());

		if (logger.isDebugEnabled()) {
			this.setStartTime(System.currentTimeMillis());

			StringBuilder stringBuilder = new StringBuilder("");
			stringBuilder.append(String.format("\nTarget    Method: %s", joinPoint.getSignature().getName()));
			stringBuilder.append(String.format("\nTarget Arguments:", ""));

			int objectCount = 0;
			for (Object object : joinPoint.getArgs()) {
				stringBuilder.append(String.format("\narg%d > %s { %s }", objectCount++, object.getClass().getSimpleName(), object.toString()));
			}
			stringBuilder.append(String.format("\n--------------------------------------------------------------------------------", ""));

			logger.debug(stringBuilder);

			stringBuilder.delete(0, stringBuilder.length());
			stringBuilder = null;
		}

	}

	public void afterLogging(JoinPoint joinPoint) {

		Logger logger = Logger.getLogger(joinPoint.getTarget().getClass());

		if (logger.isDebugEnabled()) {
			StringBuilder stringBuilder = new StringBuilder("");
			stringBuilder.append(String.format("\nTarget    Method: %s", joinPoint.getSignature().getName()));
			stringBuilder.append(String.format("\nTarget  Duration: %d msec", System.currentTimeMillis() - this.getStartTime()));
			stringBuilder.append(String.format("\n--------------------------------------------------------------------------------", ""));

			logger.debug(stringBuilder);

			stringBuilder.delete(0, stringBuilder.length());
			stringBuilder = null;
		}

	}

	/**
	 * @deprecated
	 */
	public Object aroundLogging(ProceedingJoinPoint joinPoint) {

		Logger logger = Logger.getLogger(joinPoint.getTarget().getClass());

		Object proceed = null;
		try {
			proceed = joinPoint.proceed();
		} catch (Throwable e) {
			logger.error(e);
		}

		if (logger.isDebugEnabled()) {
			logger.debug(String.format("aroundLogging::%s", joinPoint.getSignature().getName()));
		}

		return proceed;
	}

	/**
	 * @return the startTime
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

}
