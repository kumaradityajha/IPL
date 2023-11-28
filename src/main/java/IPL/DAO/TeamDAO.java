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
	
	//EntityManager em = entityManagerFactory.createEntityManager();
	
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
		//EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Query query = entityManager.createQuery("select x from Management x where username=?1").setParameter(1,username);
		
		//List<Management> list = query.getResultList();
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		List<Team> list = em.createQuery("select x from Team x where username=?1").setParameter(1,username).getResultList();
		
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}


	public List<Team> viewAllTeam()
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		List<Team> list  = em.createQuery("select x from Team x").getResultList();
		
		return list;
		
	}
	
	public Team viewPlayersOfRespectiveTeam(int tid) 
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Team team  = em.find(Team.class, tid);
		
		return team;
		
	}
	
	public Team changeStatus(int tid)
	{
     
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Team team  = em.find(Team.class, tid);
		
		return team;
		
	}
	
	public void update(Team team)
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(team);
		et.commit();
		
		
	}

}
