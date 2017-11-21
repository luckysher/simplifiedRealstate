
package realstate.appointment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import javax.annotation.Resource;
import dao.AppointmentDAOImpl;
import models.Appointment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class AppointmentSaveTests{
		
	protected final Log logger = LogFactory.getLog(getClass());
	private AppointmentDAOImpl dao;
    
	@Autowired
    @Resource
    public void setDao(AppointmentDAOImpl dao) {
        this.dao = dao ;
    }
   
}
}
