package com.liuyu.test2;

import java.util.Arrays;
import java.util.Scanner;

/**

* @ClassName: Add

* @Description: 添加新的学生信息

* @author guoxiang

* @date 2019年8月11日

*


*/
public class Add {
	
	static Student[] students = {};
	
	// 2、添加学生信息
	public static void addStudentInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生id：");
		byte id = scanner.nextByte();
		if(students.length != 0) {
			for(int i=0;i<students.length;i++) {
				if(students[i].id == id) {
					System.out.println("此id" + id + "存在，请重新输入！");
					addStudentInfo();
				}
			}
		}
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄：（1~120）");
		byte age = scanner.nextByte();
		System.out.println("请输入学生所属年级：（初级，中级，高级）");
		String grade = scanner.next();
		System.out.println("请输入学生地址：");
		String address = scanner.next();
		System.out.println("请输入学生联系方式（11位手机号码）：");
		long telNum = scanner.nextLong();
		System.out.println("请输入学生电子邮箱（包含@和.com）：");
		String mailbox = scanner.next();
		// 创建学生
		Student student = new Student();
		student.id = id;
		student.name = name;
		student.sex = sex;
		student.age = age;
		student.grade = grade;
		student.address = address;
		student.telNum = telNum;
		student.mailbox = mailbox;
		// 学生数组长度加一
		students = Arrays.copyOf(students, students.length+1);
		students[students.length-1] = student;
		
		if(students != null) {
			System.out.println("数据保存成功，系统将自动返回上级目录！");
		}
		Client.welcome();
	}
		
}
