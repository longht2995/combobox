package greenglobal.lastdemo.services.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import greenglobal.lastdemo.entity.Quan;
import greenglobal.lastdemo.entity.Thanhpho;

@Repository
public class QuanDao {
	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	private EntityManager em;
	public List<Quan> findAll(Thanhpho tp){
		return em.createQuery("FROM Quan WHERE thanhpho_id = "+tp.getId(),Quan.class).getResultList();
	}

}
