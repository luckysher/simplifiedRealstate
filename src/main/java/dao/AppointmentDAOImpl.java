package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import realstate.appointment.Appointment;

@Repository
public class AppointmentDAOImpl implements AppointmentDAO {

	public List<Appointment> getAllAppointments() 
	{
		List<Appointment> appointments = new ArrayList<Appointment>();
		
		Appointment appt = new Appointment();
		appt.setName("sher");
		appt.setAddress("Rasulpur khurd");
		appt.setArea("kernal");
		appt.setMobileNum((long)989677880);
		appt.setDetails("Phoosgrarh");

		appointments.add(appt);
		
		return appointments;
	}
}