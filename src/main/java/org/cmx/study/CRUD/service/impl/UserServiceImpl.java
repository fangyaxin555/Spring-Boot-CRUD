package org.cmx.study.CRUD.service.impl;

import java.util.List;

import org.cmx.study.CRUD.dao.UserDao;
import org.cmx.study.CRUD.entity.User;
import org.cmx.study.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author caimingxin
 * @date 2018年7月25日 下午7:51:30
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		boolean flag = false;
		try {
			userDao.addUser(user);
			flag = true;
		} catch (Exception e) {
			System.out.println("新增失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag = false;
		try {
			userDao.updateUser(user);
			flag = true;
		} catch (Exception e) {
			System.out.println("修改失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean flag = false;
		try {
			userDao.deleteUser(id);
			flag = true;
		} catch (Exception e) {
			System.out.println("删除失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public User findUserByName(String userName) {
		return userDao.findByName(userName);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
}