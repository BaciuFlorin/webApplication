package org.shop.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SomeEjb {

	@PersistenceContext(unitName = "jbugs-persistence")
	private EntityManager em;

	public String hello() {
		return "Hello JPA World!";
	}

}
