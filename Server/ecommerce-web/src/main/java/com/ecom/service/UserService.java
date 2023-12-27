package com.ecom.service;

import java.util.List;

import com.ecom.entity.User;
import com.ecom.exception.UserException;

public interface UserService {

	public User findUserById(Long userId) throws UserException;

	public User findUserProfileByJwt(String jwt) throws UserException;

	public List<User> findAllUsers();
}
