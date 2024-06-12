package com.awesome.dao;

import com.awesome.pojo.User;

public class UserDAO {

	User users[];

	public UserDAO() {

		User xi = new User("100", "Xi Wang", "xi@gmail.com");
		User celia = new User("101", "Celia Lyu", "celia@yahoo.com");
		User lauren = new User("102", "Zhuoer", "zhuoer@gmail.com");

		users = new User[3];

		users[0] = xi;
		users[1] = celia;
		users[2] = lauren;
	}

//	public User findUser(String userId) {
//
//		for (User user : users) {
//
//			if (user.getUserId().equals(userId)) {
//				return user;
//			}
//		}
//		return null;
//	}

	public User findUser(String userId) {

		User user = null;

		for (User value : users) {

			if (value.getUserId().equals(userId)) {

				user = value;
				break;
			}
		}
		return user;
	}

}
