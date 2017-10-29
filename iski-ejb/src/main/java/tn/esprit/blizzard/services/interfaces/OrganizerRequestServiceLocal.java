package tn.esprit.blizzard.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.blizzard.iski.entities.OrganizerRequest;

@Local
public interface OrganizerRequestServiceLocal {

	public OrganizerRequest add(OrganizerRequest u);

	public OrganizerRequest update(OrganizerRequest u);

	public void remove(Integer id);

	public List<OrganizerRequest> findAll();

	public OrganizerRequest findById(Integer id);

	public List<OrganizerRequest> findPendingRequests(String status);

}
