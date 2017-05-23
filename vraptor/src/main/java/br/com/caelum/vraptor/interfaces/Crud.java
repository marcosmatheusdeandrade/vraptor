package br.com.caelum.vraptor.interfaces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Crud implements ICrud{

	private EntityManager getEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vraptor");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		return em;
	}
	
	public <T> T find(Class<T> entitie, Long id){
		return getEntityManager().find(entitie, id);
	}
	
	public <T> T merge(T t){
		return getEntityManager().merge(t);
	}
	
	public <T> void remove(Class<T> entitie, Long id){
		T find = find(entitie, id);
		getEntityManager().remove(find);
		getEntityManager().getTransaction().commit();
	}
	
}
