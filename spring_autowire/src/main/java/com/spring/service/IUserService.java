package com.spring.service;

import com.spring.pojo.User;

public interface IUserService {

	public void saveUser(User user);

	public User searchUser(String userId);

}
