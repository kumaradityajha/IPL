package IPL.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import IPL.DAO.PlayerDAO;
import IPL.DTO.Management;
import IPL.DTO.Player;

@RestController
public class Player_Controller 
{
	
	@Autowired
	Player player;
	
	@Autowired
	PlayerDAO playerDAO;
	
	
	@RequestMapping("playersignup")
	public ModelAndView playerSignup(@ModelAttribute Player player) 
	{
		player.setStatus("pending");
		
		playerDAO.playerSignup(player);
		
       ModelAndView modelAndView = new ModelAndView();
       
       modelAndView.addObject("msg","Players Account got Created Succesfully");
       
       modelAndView.setViewName("index.jsp");
       
       return modelAndView;
		
	}

	 @RequestMapping("playerlogin")
	  //@ResponseBody
	  public ModelAndView playerlogin(@RequestParam String username,@RequestParam String password , HttpSession httpSession)
	  {
		 Player player = playerDAO.playerLogin(username, password);
		
		 
		 ModelAndView modelAndView =new ModelAndView();
		 if(player==null)
		 {
			 modelAndView.addObject("msg","Invalid Username");
			 modelAndView.setViewName("playerlogin.jsp");
			 
			 
		 }
		 else
		 {
			 httpSession.setAttribute("player",player); // here it is used to take the current user info --- to edit purpose or to update purpose 
			 if(player.getPassword().equals(password))
			 {
				 modelAndView.addObject("msg","Player Login Succesfully");
				 modelAndView.setViewName("playerhome.jsp"); 
			 }
			 else
			 {
				 modelAndView.addObject("msg","Entered Invalid Password");
				 modelAndView.setViewName("playerlogin.jsp");  
			 }
		 }
		 
		 return modelAndView;
}
	 @RequestMapping("editplayer")
	 public ModelAndView editPlayer(HttpSession httpSession)
	 {
		 Player player = (Player) httpSession.getAttribute("player");
		 
		 ModelAndView modelAndView = new ModelAndView();
		 
		 modelAndView.addObject("player",player);
		 
		 modelAndView.setViewName("editplayer.jsp");
		 
		 return modelAndView;
		 
		 
	}
	 
	 @RequestMapping("playerupdate")
	 public ModelAndView updatePlayer(@ModelAttribute Player player)
	 {
		 
		playerDAO.playerUpdate(player);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg","Player Data Has Been Updated Succesfully");
		
		modelAndView.setViewName("playerhome.jsp");
		
		return modelAndView;
	}
	 
}
