package com.suchiit.service.impl;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.model.User;
import com.suchiit.repo.UserRepository;
import com.suchiit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository daoImpl;
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		/*
		 * User saveUser=daoImpl.save(user); boolean flag=false;
		 * 
		 * if(saveUser!=null) return flag; return flag;
		 */
		
		user.setCreatedAt(new Date(System.currentTimeMillis()));
	    user.setStatus("active");
	    return daoImpl.save(user);
	}
	@Override
	public User LoginUser(String email, String password) {
		// TODO Auto-generated method stub
		return daoImpl.verifyEmailAndPassword(email,password);
	}

	/*
	 * @Override public boolean verifyEmailAndPass(String email, String pass) { //
	 * TODO Auto-generated method stub return false; }
	 */

}
