package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public List<User> findByUsernameAndPassword(int username, String password);
	
	public List<User> findByPasswordLessThan(String password);
	
	public List<User> findByPasswordLessThanEqual(String password);
	
	@Query(value = "select * from users", nativeQuery = true)
	public List<User> fetchAllUsers();
	
	@Query(value = "Select * from users where user_id = ?", nativeQuery = true)
	public User getUser(int user_id);
	
	@Query(value = "Select * from users where user_id = ?", nativeQuery = true)
	public Optional<User> fetchUser(int user_id);

}




//@Repository
//public interface UserRepository extends JpaRepository<User, String>{//Extending JPARepository will have 
//		//more no of methods than you get by extending CrudRepository
//
//}
//public interface UserRepository extends CrudRepository<User, String>{//If your Repository extends
		//CrudRepository then you will have lesser no of methods than you get by extending JPARepository...
//
//}
