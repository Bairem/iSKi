package tn.esprit.blizzard.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.blizzard.iski.entities.User;

@Local
public interface UserServiceLocal {
	
	public User add(User u);
	public User update(User u);
	public void remove(Integer id);
	public List<User> findAll();
	public User findById(Integer id);

	public User findByEmail(String l);

}
