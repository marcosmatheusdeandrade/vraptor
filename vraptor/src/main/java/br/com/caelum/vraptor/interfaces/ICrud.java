package br.com.caelum.vraptor.interfaces;

public interface ICrud {

	public <T> T merge(T t);

	public <T> T find(Class<T> entitie, Long id);
	
	public <T> void remove(Class<T> entitie, Long id);
}
