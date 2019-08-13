package com.neuedu.student;
/**
* @ClassName: Question
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wdc
* @date 2019年8月11日 下午4:23:59
*
*/
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	static Student[] student = {};
	
	
	public static void enter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------欢迎登陆学生信息管理系统--------");
		System.out.println("1.登陆     2.退出");
		System.out.println("-----------------------------------");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			enterSystem();
			break;
		case 2:	    
			exit();		
			break;
		}
	}
	// 选择登陆进入系统
	public static void enterSystem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.next();
		System.out.println("请输入密码");
		String password = scanner.next();
		System.out.println("登陆成功");
		System.out.println("欢迎您，"+username);
		chooseOperation();
	}
	
	// 退出
	public static void exit() {
		System.exit(0);
	}
	
	// 选择操作
	public static void chooseOperation(){
		System.out.println("*****************请选择要操作的信息对应的数字***************");
		System.out.print("1.查看学生信息"+"\t");
		System.out.print("2.添加学生信息"+"\t");
		System.out.print("3.删除学生信息"+"\t");
		System.out.print("4.修改学生信息"+"\t");
		System.out.println("5.退出系统");
		System.out.println("******************************************************");
		Scanner scanner = new Scanner(System.in);
		int chooseNum = scanner.nextInt();
		switch(chooseNum) {
		case 1:
			viewChoose();
			break;
		case 2:
			addStudentMessage();
			break;
		case 3:
			deleteStudent();
			break;
		case 4:
			changeChoose();
			break;
		case 5 :
			exit();
		}
	}
	
	
	// 添加学生信息
	public static void addStudentMessage() {
		Scanner scanner = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("请输入学生id");
		int id= scanner.nextInt();
		stu.id = id;
		System.out.println("请输入学生姓名");
		String name = scanner.next();
		stu.name = name;
		System.out.println("请输入学生性别");
		String sex = scanner.next();
		stu.sex = sex;
		System.out.println("请输入学生年龄");
		int age = scanner.nextInt();
		stu.age = age;
		System.out.println("请输入学生年级(1.初级  2.中级  3.高级)");
		int level = scanner.nextInt();
		switch (level) {
		case 1 :
			stu.level = "初级";
			break;
		case 2 :
			stu.level = "中级";
			break;
		case 3 :
			stu.level = "高级";
			break;
		}
		
		System.out.println("请输入学生地址");
		String address = scanner.next();
		stu.address = address;
		System.out.println("请输入学生联系方式");
		long phoneNum = scanner.nextLong();
		stu.phoneNum = phoneNum;
		System.out.println("请输入学生电子邮箱");
		String mailAddress = scanner.next();
		stu.mailAddress = mailAddress;
		
		student = Arrays.copyOf(student, student.length+1);
		student[student.length-1] = stu;
		
		System.out.println("数据保存成功，系统将自动返回上层目录~");
		chooseOperation();
	}
	
	// 查看学生信息选择
	public static void viewChoose() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("1.查看所有学生信息"+"\t");
		System.out.print("2.根据id查询学生信息"+"\t");
		System.out.print("3.根据id查询学生姓名"+"\t");
		System.out.println("4.退出系统");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Scanner scanner = new Scanner(System.in);
		int chooseNum = scanner.nextInt();
		switch(chooseNum) {
		case 1:
			viewStudentMessage();
			break;
		case 2 :
			viewStudentMessageById();
			break;
		case 3 :
			viewStudentMessageByIdToGetName();
			break;
		case 4 :
			exit();
		}
	}
	
	// 通过id查看学生信息
	public static void viewStudentMessageById() {
		System.out.println("请选择要查看的学生id");
		Scanner scanner = new Scanner(System.in);
		int studentId = scanner.nextInt();
		for(int i=0;i<student.length;i++) {
			if(student[i].id == studentId) {
				System.out.println(student[i]);
			}
		}
		chooseOperation();
	}
	
	// 通过id获取姓名
	public static void viewStudentMessageByIdToGetName() {
		System.out.println("请选择要查看的学生id");
		Scanner scanner = new Scanner(System.in);
		int studentId = scanner.nextInt();
		for(int i=0;i<student.length;i++) {
			if(student[i].id == studentId) {
				System.out.println(student[i].name);
			}
		}
		chooseOperation();
	} 
	
	// 查看全部学生信息
	public static void viewStudentMessage() {
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
		chooseOperation();
	}
	
	// 删除学生信息
	public static void deleteStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要删除的id:");
		int id = scanner.nextInt();
		for(int i = 0; i<=student.length;i++) {
			if(student[i].id == id) {
				student[i] = null;
				student[i] = student[student.length-1];
				student = Arrays.copyOf(student, student.length-1);
			}
		}
		chooseOperation();
	}
	
	// 修改学生信息
	public static void changeChoose() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("1.根据id修改全部信息"+"\t");
		System.out.print("2.根据id修改部分信息"+"\t");
		System.out.print("3.返回上级目录"+"\t");
		System.out.println("4.退出系统");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Scanner scanner = new Scanner(System.in);
		int chooseNum = scanner.nextInt();
		switch(chooseNum) {
		case 1:
			changeAllById();
			break;
		case 2 :
			
			break;
		case 3 :
			chooseOperation();
			break;
		case 4 :
			exit();	
			
		}
	}
	
	// 根据id修改全部信息
	public static void changeAllById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要修改的id:");
		int id = scanner.nextInt();
		for(int i = 0;i<student.length;i++) {
			if(student[i].id == id) {
				
				System.out.println("请输入学生id");
				int idN= scanner.nextInt();
				student[i].id = idN;
				System.out.println("请输入学生姓名");
				String name = scanner.next();
				student[i].name = name;
				System.out.println("请输入学生性别");
				String sex = scanner.next();
				student[i].sex = sex;
				System.out.println("请输入学生年龄");
				int age = scanner.nextInt();
				student[i].age = age;
				System.out.println("请输入学生年级(1.初级  2.中级  3.高级)");
				int level = scanner.nextInt();
				switch (level) {
				case 1 :
					student[i].level = "初级";
					break;
				case 2 :
					student[i].level = "中级";
					break;
				case 3 :
					student[i].level = "高级";
					break;
				}
				
				System.out.println("请输入学生地址");
				String address = scanner.next();
				student[i].address = address;
				System.out.println("请输入学生联系方式");
				long phoneNum = scanner.nextLong();
				student[i].phoneNum = phoneNum;
				System.out.println("请输入学生电子邮箱");
				String mailAddress = scanner.next();
				student[i].mailAddress = mailAddress;
				
			}
		}
		changeChoose();
	}
	
	// 根据id修改部分信息
	public static void changeOneById() {
		
	} 

	
	
	
}
