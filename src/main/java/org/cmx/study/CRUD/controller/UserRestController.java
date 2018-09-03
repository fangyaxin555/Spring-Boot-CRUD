package org.cmx.study.CRUD.controller;

import java.util.List;

import org.cmx.study.CRUD.entity.User;
import org.cmx.study.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
=======
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserRestController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author caimingxin
 * @date 2018年7月25日 下午7:52:34
 * @Version 1.0
 */
@RestController
<<<<<<< HEAD
@RequestMapping(value = "/user")
=======
//@RequestMapping(value = "/user")
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
public class UserRestController {
	@Autowired
	private UserService userService;

<<<<<<< HEAD
	@PostMapping("/address")
=======
	@PostMapping("/user")
//	@PostMapping("/address")
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
	public boolean addUser(User user) {
		System.out.println("开始新增...");
		return userService.addUser(user);
	}

<<<<<<< HEAD
	@PutMapping("/update")
=======
	@PutMapping("/user")
//	@PutMapping("/update")
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
	public boolean updateUser(User user) {
		System.out.println("开始更新...");
		return userService.updateUser(user);
	}

<<<<<<< HEAD
	@DeleteMapping("/delete/{id}")
=======
	@DeleteMapping("/user/{id}")
//	@DeleteMapping("/delete/{id}")
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
	public boolean delete(@PathVariable("id") Integer id) {
		System.out.println("开始删除...");
		return userService.deleteUser(id);
	}

<<<<<<< HEAD
	@GetMapping("/findByName/{name}")
=======
	@GetMapping("/user/{name}")
//	@GetMapping("/findByName/{name}")
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
	public User findByUserName(@PathVariable("name") String name) {
		System.out.println("开始查询...");
		return userService.findUserByName(name);
	}

<<<<<<< HEAD
	@GetMapping("/findAll")
=======
	@GetMapping("/user")
//	@GetMapping("/findAll")
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
	public List<User> findByUserAge() {
		System.out.println("开始查询所有数据...");
		return userService.findAll();
	}
<<<<<<< HEAD
	@RequestMapping({"","/","/index"})
	public String toIndex(){
		return "index";
	}
=======
>>>>>>> springboot集成mybatis实现resetful风格的增删改查
}