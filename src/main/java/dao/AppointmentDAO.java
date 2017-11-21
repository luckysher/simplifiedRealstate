package dao;

import java.util.List;
import models.Appointment;

public interface AppointmentDAO 
{	
	public void saveAppointment(Appointment a);  
	public void updateAppointment(Appointment a);  
	public void deleteAppointment(Appointment a);    
	public Appointment getById(int id);  
	public List<Appointment> getAppointments();
}
