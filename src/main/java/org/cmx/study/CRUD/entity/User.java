package org.cmx.study.CRUD.entity;
/** 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author caimingxin
* @date 2018年7月25日 下午7:47:25
* @Version 1.0
*/
public class User {
	 /** 编号 */
    private int id;
    /** 姓名 */
    private String name; 
    /** 年龄 */
    private int age;
    
    public User(){
    }
    /**
	  *  构造方法
	  * @param id  编号
	  * @param name  姓名
	  */
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
