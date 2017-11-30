package com.pe.ouracademy.myschool.common;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CRUDRepository<T,ID extends Serializable>  extends CrudRepository<T,ID>{
	
	default T add(T entity) {
		return this.save(entity);
	}
	
	default Iterable<T> get() {
		return this.findAll();
	}
	
}
