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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserRestController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author caimingxin
 * @date 2018年7月25日 下午7:52:34
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserRestController {
	@Autowired
	private UserService userService;

	@PostMapping("/address")
	public boolean addUser(User user) {
		System.out.println("开始新增...");
		return userService.addUser(user);
	}

	@PutMapping("/update")
	public boolean updateUser(User user) {
		System.out.println("开始更新...");
		return userService.updateUser(user);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Integer id) {
		System.out.println("开始删除...");
		return userService.deleteUser(id);
	}

	@GetMapping("/findByName/{name}")
	public User findByUserName(@PathVariable("name") String name) {
		System.out.println("开始查询...");
		return userService.findUserByName(name);
	}

	@GetMapping("/findAll")
	public List<User> findByUserAge() {
		System.out.println("开始查询所有数据...");
		return userService.findAll();
	}
	@RequestMapping({"","/","/index"})
	public String toIndex(){
		return "index";
	}
}