package IPL.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IPL.DTO.Player;
import IPL.DTO.Team;

@Component
public class TeamDAO
{
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public void teamSignup(Team team) 
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(team);
		et.commit();
		
		
	
	
	}
	
	public Team teamLogin(String username)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Query query = entityManager.createQuery("select x from Management x where username=?1").setParameter(1,username);
		
		//List<Management> list = query.getResultList();
		
		List<Team> list = entityManager.createQuery("select x from Team x where username=?1").setParameter(1,username).getResultList();
		
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}


	

}
