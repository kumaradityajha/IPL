package IPL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import IPL.DTO.Management;
import IPL.DTO.Player;

//@org.springframework.stereotype.Controller
@RestController
public class Controller {

	@Autowired // it will act like vechile and it will bring the the object from the respective
	Management management;
	
	@Autowired
	Player player;

	@RequestMapping("signup")
	@ResponseBody
	public ModelAndView signup(@RequestParam String role) {

		ModelAndView modelAndView = new ModelAndView(); // here Model means Object & view means frontend(jsp) here the work of model and
														// view is nothing but carrying the object to the frontend(menas JSP)

		if (role.equals("Management")) {

			modelAndView.addObject("management", management);
			modelAndView.setViewName("managementsignup.jsp");

		} else if (role.equals("Player"))
		{
			modelAndView.addObject("player", player);
			modelAndView.setViewName("playersignup.jsp");

		} else {

		}
		return modelAndView; // if i want to return or carry anything to the front end finally i should
								// return the reference variable of the ModelAndView Class.

	}

}
 