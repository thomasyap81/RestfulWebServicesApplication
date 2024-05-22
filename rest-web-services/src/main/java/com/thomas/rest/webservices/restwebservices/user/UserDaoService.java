package com.thomas.rest.webservices.restwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	//UserDaoService > Static List
	//JPA/Hibernate > Database
	//public List<User> findAll()
	//public User save(User user){
	//public User findOne(int id){
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Jim", LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
//		User userFound = null;
//		for (int i=0; i<users.size();i++) {
//			if(i==id-1) {
//				 userFound = users.get(i);
//			}
//		}
//		return userFound;
	
}
