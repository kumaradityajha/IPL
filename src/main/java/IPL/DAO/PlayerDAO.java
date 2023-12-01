package IPL.DAO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IPL.DTO.Management;
import IPL.DTO.Player;



@Component
public class PlayerDAO
{
	@Autowired
	EntityManagerFactory entityManagerFactory;
	public void playerSignup(Player player) 
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(player);
		et.commit();
		
	}

	public Player playerLogin(String username )
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Query query = entityManager.createQuery("select x from Management x where username=?1").setParameter(1,username);
		
		//List<Management> list = query.getResultList();
		
		List<Player> list = entityManager.createQuery("select x from Player x where username=?1").setParameter(1,username).getResultList();
		
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	
	public void playerUpdate(Player player)
	{

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(player);
		et.commit();
		

	}
	
	public List<Player> viewAllPlayersForAuction() 
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		//EntityTransaction et = em.getTransaction();
		
	    List<Player> list =	em.createQuery("select x from Player x").getResultList();
	 
	    return list;
	    
	    
		
		
	}
	
	public Player changePlayerStatus(int id)
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Player player = em.find(Player.class, id);
		
		return player;
		
	}
}
