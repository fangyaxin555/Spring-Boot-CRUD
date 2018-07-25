package org.cmx.study.CRUD.service;

import java.util.List;

import org.cmx.study.CRUD.entity.User;

/**
 * @ClassName: UserService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author caimingxin
 * @date 2018年7月25日 下午7:50:18
 * @Version 1.0
 */
public interface UserService {

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @return
	 */
	boolean addUser(User user);

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);

	/**
	 * 删除用户
	 * 
	 * @param id
	 * @return
	 */
	boolean deleteUser(int id);

	/**
	 * 根据用户名字查询用户信息
	 * 
	 * @param userName
	 */
	User findUserByName(String userName);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<User> findAll();
}