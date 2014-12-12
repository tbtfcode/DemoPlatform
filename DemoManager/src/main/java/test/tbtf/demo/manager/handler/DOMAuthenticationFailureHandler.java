/**
 * 
 */
package test.tbtf.demo.manager.handler;

import org.apache.log4j.Logger;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 * @project DemoManager
 * @package test.tbtf.demo.manager.handler
 * @file DOMAuthenticationFailureHandler.java
 * @date 2014. 12. 12.
 * @author tbtf.base.code@gmail.com
 * @description 
 */
public class DOMAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	private Logger logger = Logger.getLogger(DOMAuthenticationFailureHandler.class);

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler#setDefaultFailureUrl(java.lang.String)
	 */
	@Override
	public void setDefaultFailureUrl(String defaultFailureUrl) {
		logger.debug(defaultFailureUrl);
		super.setDefaultFailureUrl(defaultFailureUrl);
	}

}
