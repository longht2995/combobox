package greenglobal.lastdemo.services.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import greenglobal.lastdemo.entity.Thanhpho;

@Repository
public class ThanhphoDao {
	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	private EntityManager em;
	public List<Thanhpho> findAll(){
		return em.createQuery("FROM Thanhpho",Thanhpho.class).getResultList();
	}
}
