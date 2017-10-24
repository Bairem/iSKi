package tn.esprit.blizzard.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.blizzard.iski.entities.User;
import tn.esprit.blizzard.services.interfaces.UserServiceLocal;
import tn.esprit.blizzard.services.interfaces.UserServiceRemote;

/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService implements UserServiceRemote, UserServiceLocal {

	
	@PersistenceContext
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public UserService() {
        
    }

	@Override
	public User add(User u) {
		em.persist(u);
		em.flush();
		return u;
	}

	@Override
	public User update(User u) {
		em.merge(u);
		em.flush();
		return u;
	}

	@Override
	public void remove(Integer idUser) {
		em.remove(findById(idUser));
		em.flush();
	}

	
	@Override
	public List<User> findAll() {
		String jpql="select u from User u";
		Query qry = em.createQuery(jpql, User.class);
		return qry.getResultList();
	}

	
	@Override
	public User findById(Integer idUser) {
		return em.find(User.class, idUser);		

	}

}
