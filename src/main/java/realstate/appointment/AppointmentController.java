package realstate.appointment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import service.AppointmentManager;
import form.validator.AppointmentFormValidator;



@Controller
//@SessionAttributes("appointment")
public class AppointmentController{
	protected final Log logger = LogFactory.getLog(getClass());
	

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
	        webDataBinder.setValidator(validator);
	}    
	
	public AppointmentController(){
		BasicConfigurator.configure();
	}
	
	@RequestMapping(value="appointment/new", method=RequestMethod.GET)
	public ModelAndView appointmentForm() throws Exception {
			ModelAndView view = new ModelAndView();
			view.setViewName("appointmentview");
			view.addObject("appointment", new Appointment());
		return view;
	}
	@RequestMapping(value="appointment/save", method=RequestMethod.POST)
	public ModelAndView appointmentSave(@ModelAttribute("appointment")@Valid Appointment appointment, BindingResult bindingResult, ModelMap model) {
		
		
	validator.validate(appointment, bindingResult);
	if (bindingResult.hasErrors()) {
		logger.info("[appointment save] >>>>>>> Returning appSave.jsp page <<<<<<");
		ModelAndView view = new ModelAndView();
		view.setViewName("appointmentview");
		view.addObject("command", appointment);
		return view;
	}
			model.addAttribute("name", appointment.getName());
			model.addAttribute("address", appointment.getAddress());
			ModelAndView view = new ModelAndView();
			view.setViewName("appointment_success");			
			view.addAllObjects(model);
			
		return view;
	}
}
