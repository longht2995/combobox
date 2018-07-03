package greenglobal.lastdemo.services.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import greenglobal.lastdemo.entity.User;

@Repository
public class UserDao {
	@PersistenceContext
	private EntityManager em;
	public boolean checkUsername(String username) {
		if(em.createQuery("FROM User WHERE username = "+username,User.class).getFirstResult()>0) {
			return false;
		}
		return true;
	}
}
