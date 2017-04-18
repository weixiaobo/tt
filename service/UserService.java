package com.lsn.web.service;

import java.util.List;

import com.lsn.web.entity.User;



public interface UserService {

	List<User> getUserList(int offset, int limit);
	User getUser(int phoneId);
}
