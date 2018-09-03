package org.cmx.study.CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @ClassName: IndexController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author caimingxin
* @date 2018年7月25日 下午10:19:10
* @Version 1.0
*/
@Controller
public class IndexController {
	@RequestMapping({"","/","/index"})
	public String toIndex(){
		return "index";
	}
}
