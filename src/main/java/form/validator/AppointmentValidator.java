package form.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class AppointmentValidator implements ConstraintValidator<Size, String> {

	@Override
	public void initialize(Size arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		if (name.length() < 3){
			System.out.println("[appointment validator] validating name: ");
			return false;	
		}
	return true;	
	}

}
