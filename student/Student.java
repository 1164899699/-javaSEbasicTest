package com.neuedu.student;
/**
* @ClassName: Question
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wdc
* @date 2019年8月11日 下午4:23:59
*
*/
public class Student {

	int id;
	String name;
	String sex;
	int age;
	String level;
	String address;
	long phoneNum;
	String mailAddress;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", level=" + level
				+ ", address=" + address + ", phoneNum=" + phoneNum + ", mailAddress=" + mailAddress + "]";
	}
	
	
	
	
}
