package br.com.caelum.vraptor.interfaces;

import java.util.List;

public interface ICrud {

	public <T> T merge(T t);

	public <T> T find(Class<T> entitie, Long id);
	
	public <T> List<T> findAll(Class<T> entitie);
	
	public <T> void remove(Class<T> entitie, Long id);
}
