package realstate.appointment;


import java.util.List;

import models.Appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import realstate.appointment.AppointmentHelper;
import dao.AppointmentDAOImpl;
import service.AppointmentManager;
import form.validator.AppointmentFormValidator;


@Controller

public class AppointmentController{
	protected final Log logger = LogFactory.getLog(getClass());
	
	private AppointmentDAOImpl appointmentDao;
			
	@Autowired
	AppointmentManager manager;
	
	@Autowired
	AppointmentFormValidator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
	        webDataBinder.setValidator(validator);
	}    
	
	public AppointmentController(){
		BasicConfigurator.configure();
		AppointmentHelper helper = new AppointmentHelper();
		this.appointmentDao = helper.getRealstateDao("d");		
	}
	

	// appointment status done page mapping
	@RequestMapping(value="/update/status/{id}", method=RequestMethod.POST)
	public String updateStatus(int id) throws Exception {
		
		logger.info("Updating apointment status for id : " + id );
		return "redirect:/";
		}
		
	// appointment home page mapping
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView appointmentList() throws Exception {
			ModelAndView view = new ModelAndView();
			view.setViewName("home");			
			List<Appointment> appointments = appointmentDao.getAppointments();		
			view.addObject("appointments", appointments);
		return view;
	}
	
	@RequestMapping(value="appointment/new", method=RequestMethod.GET)
	public ModelAndView appointmentForm() throws Exception {
			ModelAndView view = new ModelAndView();
			view.setViewName("appointmentview");			
			List<Appointment> appointments = appointmentDao.getAppointments();
			view.addObject("appointment", new Appointment());
		
		return view;
	}
		
	@RequestMapping(value="appointment/save", method=RequestMethod.POST)
	public ModelAndView appointmentSave(@ModelAttribute("appointment")@Valid Appointment appointment, BindingResult bindingResult, ModelMap model) {
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
