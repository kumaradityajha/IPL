package IPL.Helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcher_Servlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] arr = { MyConfig.class };

		return arr;

	}

	@Override
	protected String[] getServletMappings() {

		String[] arr = { "/" };
		return arr; // We have successfully Mapped Multiple URLs.
	}

}