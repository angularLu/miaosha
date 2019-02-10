package com.angularLu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularLu.dao.UserDOMapper;
import com.angularLu.dataobject.UserDO;
import com.angularLu.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDOMapper userDOMapper;

	@Override
	public void getUserById(Integer id) {
	
		UserDO userDO = userDOMapper.selectByPrimaryKey(id);
	}
	
	

}
