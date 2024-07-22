package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.example.model.User;

import lombok.val;

@Repository
public class UserRepositoryImpl implements IUserRepository {
	
//	List<User> users = new CopyOnWriteArrayList<>();//I am using CopyOnWriteArrayList which is Concurrent
//				//Collection. Reason being since I am iterating as well as removing and adding the same
//					//list simultaneouly in delete and update methods. Out of thread-safety, Arraylist
//				//returned me ConcurrentModificationException...
	List<User> users = new ArrayList<>();
	public UserRepositoryImpl() {
		
		User user1 = new User("eileen@123", "123", "Eileen Zheng", "eileen@gmail.com");
		User user2 = new User("xi@123", "234", "Xi Wang", "xi@gmail.com");
		User user3 = new User("jing@123", "345", "Jing Bai", "jing@gmail.com");
		User user4 = new User("zhen@123", "456", "Zhen Luo", "zhen@gmail.com");
		
		users.add(user1);  users.add(user2);   users.add(user3);  users.add(user4);
	}

	@Override
	public String addUser(User user) {
		
		users.add(user);
		
		System.out.println("Size of Users is "+users.size());
		
		return "User is added";
	}

	@Override
	public User findUser(String username, String password) {
		
		User user = null;
		
		for( User val : users ) {
			
			if( val.getUsername().equals(username) && val.getPassword().equals(password)) {
				
				user = val;
				break;
			}
		}
		
		return user;
	}

	@Override
	public List<User> allUsers() {
		
		return users;
	}

	@Override
	public String delete(String userId) {
		
		for( User user : users ) {
			
			if(user.getUsername().equals(userId)) {
				users.remove(user);
			}
		}
		
		return "User Deleted";
	}

	@Override
	public User findUser(String username) {
		
		User user = null;
		
		for( User value : users ) {
			
			if(username.equals(value.getUsername())) {
				
				user = value;
				break;
			}
		}
		
		return user;
	}

//	@Override
//	public void updateUser(User user) {
//		
//		for( User value : users ) {
//			
//			if(value.getUsername().equals(user.getUsername())) {
//				System.out.println("size is beofre remove "+users.size());
//				users.remove(value);
//				System.out.println("size is after remove "+users.size());
//				users.add(user);
//				System.out.println("size is after add "+users.size());
//			}
//		}
//		
//	}
	
	@Override
	public void updateUser(User user) {
		
		int counter = 0;
		
		for( User value : users ) {
			
			if(value.getUsername().equals(user.getUsername())) {
				
				break;
			}
			counter++;
		}
		
		users.set(counter, 	user);
	}

}
