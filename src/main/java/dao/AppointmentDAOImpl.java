package dao;

import java.util.ArrayList;
import java.util.List;
import models.Appointment;
import org.springframework.orm.hibernate3.HibernateTemplate;  
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentDAOImpl implements AppointmentDAO {
	
	private HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save appointment
	public void saveAppointment(Appointment a){  
	    template.save(a);  
	}  
	//method to update Appointment
	public void updateAppointment(Appointment a){  
	    template.update(a);  
	}  
	//method to delete appointment
	public void deleteAppointment(Appointment a){  
	    template.delete(a);  
	}  
	//method to return one appointment of given id  
	public Appointment getById(int id){  
	    Appointment a=(Appointment)template.get(Appointment.class,id);  
	    return a;  
	}  
	//method to return all appointments
	public List<Appointment> getAppointments(){  
	    List<Appointment> list=new ArrayList<Appointment>();  
	    list=template.loadAll(Appointment.class);  
	    return list;  
	}
}  