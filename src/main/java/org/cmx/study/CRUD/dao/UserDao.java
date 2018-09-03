package org.cmx.study.CRUD.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.cmx.study.CRUD.entity.User;

/**
 * @ClassName: UserDao 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author caimingxin
 * @date 2018年7月25日 下午7:49:10
 * @Version 1.0
 */
@Mapper
public interface UserDao {
	/**
	 * 用户数据新增
	 */
	@Insert("insert into user(id,name,age) values (#{id},#{name},#{age})")
	void addUser(User user);

	/**
	 * 用户数据修改
	 */
	@Update("update user set name=#{name},age=#{age} where id=#{id}")
	void updateUser(User user);

	/**
	 * 用户数据删除
	 */
	@Delete("delete from user where id=#{id}")
	void deleteUser(int id);

	/**
	 * 根据用户名称查询用户信息
	 *
	 */
	@Select("SELECT id,name,age FROM user where name=#{userName}")
	User findByName(String userName);

	/**
	 * 查询所有
	 */
	@Select("SELECT id,name,age FROM user")
	List<User> findAll();
}
