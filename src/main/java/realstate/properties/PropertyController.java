package realstate.properties;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;

@Controller
public class PropertyController {
		
	protected final Log logger = LogFactory.getLog(getClass());
    @RequestMapping("property")
    public ModelAndView getPropertyView(){       
    	BasicConfigurator.configure();
    	
		logger.info("Property View controller calling..");
        return new ModelAndView("propertyview", "house", "list of house from controller");
    }
}
