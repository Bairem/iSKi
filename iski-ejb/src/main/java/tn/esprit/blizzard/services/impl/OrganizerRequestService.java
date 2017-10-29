package tn.esprit.blizzard.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.blizzard.iski.entities.OrganizerRequest;
import tn.esprit.blizzard.services.interfaces.OrganizerRequestServiceLocal;
import tn.esprit.blizzard.services.interfaces.OrganizerRequestServiceRemote;

/**
 * Session Bean implementation class OrganizerRequestService
 */
@Stateless
public class OrganizerRequestService implements OrganizerRequestServiceRemote, OrganizerRequestServiceLocal {

	/**
	 * Default constructor.
	 */

	@PersistenceContext
	private EntityManager em;

	public OrganizerRequestService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public OrganizerRequest add(OrganizerRequest u) {
		em.persist(u);
		em.flush();
		return u;
	}

	@Override
	public OrganizerRequest update(OrganizerRequest u) {
		em.merge(u);
		em.flush();
		return u;
	}

	@Override
	public void remove(Integer id) {
		em.remove(findById(id));
		em.flush();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrganizerRequest> findAll() {
		String jpql = "select u from OrganizerRequest u";
		Query qry = em.createQuery(jpql, OrganizerRequest.class);
		return qry.getResultList();
	}

	@Override
	public OrganizerRequest findById(Integer id) {
		return em.find(OrganizerRequest.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrganizerRequest> findPendingRequests(String status) {
		String jpql = "select u from OrganizerRequest u where status=:status";
		Query qry = em.createQuery(jpql, OrganizerRequest.class).setParameter("status", "Pending");
		return qry.getResultList();
	}

}
