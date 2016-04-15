package id.go.bkn.app.service.impl;

import id.go.bkn.app.dao.UserDao;
import id.go.bkn.app.entities.User;
import id.go.bkn.app.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
