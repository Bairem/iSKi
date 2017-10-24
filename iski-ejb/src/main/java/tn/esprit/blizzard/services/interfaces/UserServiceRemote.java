package tn.esprit.blizzard.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.blizzard.iski.entities.User;

@Remote
public interface UserServiceRemote {

	public User add(User u);
	public User update(User u);
	public void remove(Integer id);
	public List<User> findAll();
	public User findById(Integer id);
}
