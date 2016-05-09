package com.mxnavi.yongcheyi.service;

import com.mxnavi.yongcheyi.model.User;

public interface UserService {
	public User getUserById(int id);
	
	public void saveUser(User user);
}
