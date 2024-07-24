package com.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserRepository {
	
	public void addUser() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");//Class.forName("") is the way to load any class on runtime...
		//and it returns you ClassNotFoundException if the class is not present and ClassNotFoundException
				//is checked Exception...
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_jpa", "root", "root");

		Statement stmt = conn.createStatement();
		
		stmt.execute("insert into user values('eileen4@123', '123', 'Eileen')");
	}
	
	public void delete() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_jpa", "root", "root");

		Statement stmt = conn.createStatement();
		
		stmt.execute("delete from user where id = 'eileen@123'");
	}
	
	public List<User> findAllUsers() throws Exception {
		
		List<User> users = new ArrayList<>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_jpa", "root", "root");

		Statement stmt = conn.createStatement();
		
		ResultSet resultSet = stmt.executeQuery("select * from user");
		
		while( resultSet.next() ) {
			
			//System.out.println(resultSet.getString(1)+", "+resultSet.getString(2)+", "+resultSet.getString(3));
			String username = resultSet.getString(1);
			String password = resultSet.getString(2);
			String name = resultSet.getString(3);
			
			User user = new User(username, password, name);
			users.add(user);
		}
		
		return users;
	}
}
