package form.validator;


import models.Appointment;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.apache.commons.logging.Log;

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

	@Override
	public void validate(Object target, Errors errors) {
		Appointment appointment = (Appointment) target;
		String name = appointment.getName();
		if(name.length() >= 5){	
			logger.debug("[AppointmentFormValidator] >> ");
			errors.rejectValue("name", "error.length");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,  "name", "error.name");
		
	}
}
