package org.cmx.study.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @ClassName: Application 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author caimingxin
* @date 2018年7月25日 下午7:40:13
* @Version 1.0
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
        System.out.println("程序正在运行...");
    }
}
