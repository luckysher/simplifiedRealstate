package realstate.properties;

import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import junit.framework.TestCase;

import realstate.properties.PropertyController;


public class PropertyControllerTests extends TestCase {
	protected final Log logger = LogFactory.getLog(getClass());
	
	public void testHandleRequestView() throws Exception{
		BasicConfigurator.configure();
		logger.info("Property view controller started");
		PropertyController controller = new PropertyController();
        ModelAndView modelAndView = controller.getPropertyView();		
        assertEquals("propertyview", modelAndView.getViewName());
    }
}