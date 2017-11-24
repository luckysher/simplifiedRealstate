package realstate.appointment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import dao.AppointmentDAOImpl;

public class AppointmentHelper {
	public AppointmentHelper(){
		System.out.println("initializing appointment helper");
	}
	
	public AppointmentDAOImpl getRealstateDao(String daoBeanName){
		AppointmentDAOImpl dao = null;	
		String contextFilePath = "/applicationContext.xml";		
		Resource r = new ClassPathResource(contextFilePath);
		BeanFactory beanfactory = new XmlBeanFactory(r);
		dao = (AppointmentDAOImpl) beanfactory.getBean("d");
		return dao;
	}

}
