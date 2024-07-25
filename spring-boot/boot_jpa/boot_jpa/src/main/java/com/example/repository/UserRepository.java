package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	public List<User> findByUsernameAndPassword(String username, String password);
	
	public List<User> findByPasswordLessThan(String password);
	
	public List<User> findByPasswordLessThanEqual(String password);

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
