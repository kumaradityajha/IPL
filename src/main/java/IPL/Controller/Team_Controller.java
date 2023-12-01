package IPL.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import IPL.DAO.PlayerDAO;
import IPL.DAO.TeamDAO;
import IPL.DTO.Player;
import IPL.DTO.Team;

@RestController
public class Team_Controller
{

	@Autowired
	Team team;
	
	@Autowired
	TeamDAO teamDAO;
	
	@RequestMapping("teamsignup")
	public ModelAndView teamSignup(@ModelAttribute Team team)
	{
        
		
		teamDAO.teamSignup(team);
		
       ModelAndView modelAndView = new ModelAndView();
       
       modelAndView.addObject("msg","Team Account got Created Succesfully");
       
       modelAndView.setViewName("index.jsp");
       
       return modelAndView;
		
	}
	
	@RequestMapping("teamlogin")
	  public ModelAndView teamlogin(@RequestParam String username,@RequestParam String password , HttpSession httpSession)
	  {
		 Team team = teamDAO.teamLogin(username);
		
		 
		 ModelAndView modelAndView =new ModelAndView();
		 if(team==null)
		 {
			 modelAndView.addObject("msg","Invalid Username");
			 modelAndView.setViewName("teamlogin.jsp");
			 
			 
		 }else{
			// httpSession.setAttribute("team",team); // here it is used to take the current user info --- to edit purpose or to update purpose 
			 if(team.getPassword().equals(password))
			 {
				 
				 if (team.isStatus()) {
				 httpSession.setAttribute("team", team); // here i am setting the data by using session tracking for future use
				 modelAndView.addObject("msg","Team Login Succesfully");
				 modelAndView.setViewName("teamhome.jsp");
					 
					
				} else {
					 modelAndView.addObject("msg","Wait For Management Approval");
					 modelAndView.setViewName("Managementhome.jsp");
					 
				}
			 }else{
				 modelAndView.addObject("msg","Entered Invalid Password");
				 modelAndView.setViewName("teamlogin.jsp");  
			 }
		 }
		 
		 return modelAndView;
	  }
	
	@RequestMapping("viewallteams")
	public ModelAndView viewAllTeam()
	{
		
	List<Team> teams  =	teamDAO.viewAllTeam();
	
	 ModelAndView modelAndView = new ModelAndView();
	
	if(teams.isEmpty())
	{
		modelAndView.addObject("msg","No Teams Are Avaliable");
		modelAndView.setViewName("Managementhome.jsp");
	}
	else 
	{
		modelAndView.addObject("teams",teams);
		modelAndView.setViewName("viewallteams.jsp");
		
	}
	
	return modelAndView;
		
		
	}
	
	@RequestMapping("changestatus")
	public ModelAndView changeStatus(@RequestParam ("id") int tid)
	{
		Team team = teamDAO.changeStatus(tid);
		
		if (team.isStatus()) 
		{
			team.setStatus(false);
			
			
		}
		else
			team.setStatus(true);
			
		
		
		teamDAO.update(team);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg",team.getTeamname() + "Team Status Got Updated");
		//modelAndView.setViewName("Managementhome.jsp");
		
		return viewAllTeam();
		
	}
	
	@RequestMapping("addamount")
	public ModelAndView addAmountForTeams(@RequestParam double amount , int id)
	{
		Team team = teamDAO.addAmountForTeam(id);
		
	    team.setWallet(team.getWallet()+amount);	
	    
	    teamDAO.update(team);
		
	    ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","Amount has been Added By Management Succesfully");
		modelAndView.setViewName("Managementhome.jsp");
		
		return viewAllTeam();
		
		
	}
}
