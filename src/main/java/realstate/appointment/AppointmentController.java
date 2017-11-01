package realstate.appointment;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;


@Controller
public class AppointmentController{
	protected final Log logger = LogFactory.getLog(getClass());
	public AppointmentController(){
		BasicConfigurator.configure();
	}
	
	@RequestMapping(value="appointment/new", method=RequestMethod.GET)
	public ModelAndView appointmentForm() throws Exception {
			ModelAndView view = new ModelAndView();
			view.setViewName("appointmentview");
			view.addObject("command", new Appointment());
		return view;
	}
	@RequestMapping(value="appointment/save", method=RequestMethod.POST)
	public ModelAndView appointmentSave(@ModelAttribute("")Appointment appointment, ModelMap model) {
			
			model.addAttribute("name", appointment.getName());
			model.addAttribute("address", appointment.getAddress());
			ModelAndView view = new ModelAndView();
			view.setViewName("appointment_success");			
			view.addAllObjects(model);
			
		return view;
	}
}
