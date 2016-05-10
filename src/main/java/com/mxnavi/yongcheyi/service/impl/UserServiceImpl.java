package com.mxnavi.yongcheyi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxnavi.yongcheyi.dao.UserMapper;
import com.mxnavi.yongcheyi.model.User;
import com.mxnavi.yongcheyi.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public void saveUser(User user) {
		userMapper.insert(user);
	}

}
