package form.validator;


import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.apache.commons.logging.Log;

import realstate.appointment.*;

@Component
public class AppointmentFormValidator implements Validator{
	
	private Log logger = LogFactory.getLog(getClass());
	public AppointmentFormValidator(){
		BasicConfigurator.configure();
	}
		
	@Override
	public boolean supports(Class<?> pClass) {
		return Appointment.class.equals(pClass);
	}

}
