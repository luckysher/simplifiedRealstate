package realstate.appointment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.net.URLClassLoader;
import java.net.URL;

public class AppointmentHelper {
	public AppointmentHelper(){
		System.out.println("initializing appointment helper");
	}
	
	public Object getRealstateDao(String daoBeanName){
		Object dao = null;
		 ClassLoader cl = ClassLoader.getSystemClassLoader();

	     URL[] urls = ((URLClassLoader)cl).getURLs();

	     for(URL url: urls){
	        	System.out.println(url.getFile());
	        }
		
		String contextFilePath = "/applicationContext.xml";		
		Resource r = new ClassPathResource(contextFilePath);
		BeanFactory beanfactory = new XmlBeanFactory(r);
		dao = beanfactory.getBean("d");
		return dao;
	}

}
