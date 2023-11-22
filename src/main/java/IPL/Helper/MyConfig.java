package IPL.Helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // here by using this annotation we will do the Configuration of our project
//@ComponentScan("IPL.Controller")
//@ComponentScan("IPL.DAO")
//@ComponentScan("IPL.DTO")
//@ComponentScan("IPL.Helper")
@ComponentScan("IPL")
public class MyConfig
{
	@Bean // it will help to create reference variable of interface type.
	public EntityManagerFactory getEntityManagerFactory() 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
		return emf;
	}

}