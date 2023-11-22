package IPL.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IPL.DTO.Management;


@Component
public class ManagementDAO 
{
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	
	public void saveManagement(Management management) 
	{
	
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(management);
		et.commit();
		
	}
	
	public Management managementLogin(String username , String password)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Query query = entityManager.createQuery("select x from Management x where username=?1").setParameter(1,username);
		
		//List<Management> list = query.getResultList();
		
		List<Management> list = entityManager.createQuery("select x from Management x where username=?1").setParameter(1,username).getResultList();
		
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
