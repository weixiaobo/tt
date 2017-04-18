package com.lsn.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsn.web.dao.UserDao;
import com.lsn.web.entity.User;
import com.lsn.web.service.UserService;

@Service
public class IUserService implements UserService{

	@Resource
	private UserDao userDao;
	
	public List<User> getUserList(int offset, int limit) {
		
		return userDao.queryAll(offset, limit);
	}

	public User getUser(int phoneId) {
		
		return userDao.queryByPhone(phoneId);
	}

}
