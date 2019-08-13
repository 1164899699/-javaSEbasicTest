package com.neuedu.student;
/**
* @ClassName: Question
* @Description: TODO(������һ�仰��������������)
* @author wdc
* @date 2019��8��11�� ����4:23:59
*
*/
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	static Student[] student = {};
	
	
	public static void enter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------��ӭ��½ѧ����Ϣ����ϵͳ--------");
		System.out.println("1.��½     2.�˳�");
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
	// ѡ���½����ϵͳ
	public static void enterSystem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		String username = scanner.next();
		System.out.println("����������");
		String password = scanner.next();
		System.out.println("��½�ɹ�");
		System.out.println("��ӭ����"+username);
		chooseOperation();
	}
	
	// �˳�
	public static void exit() {
		System.exit(0);
	}
	
	// ѡ�����
	public static void chooseOperation(){
		System.out.println("*****************��ѡ��Ҫ��������Ϣ��Ӧ������***************");
		System.out.print("1.�鿴ѧ����Ϣ"+"\t");
		System.out.print("2.���ѧ����Ϣ"+"\t");
		System.out.print("3.ɾ��ѧ����Ϣ"+"\t");
		System.out.print("4.�޸�ѧ����Ϣ"+"\t");
		System.out.println("5.�˳�ϵͳ");
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
	
	
	// ���ѧ����Ϣ
	public static void addStudentMessage() {
		Scanner scanner = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("������ѧ��id");
		int id= scanner.nextInt();
		stu.id = id;
		System.out.println("������ѧ������");
		String name = scanner.next();
		stu.name = name;
		System.out.println("������ѧ���Ա�");
		String sex = scanner.next();
		stu.sex = sex;
		System.out.println("������ѧ������");
		int age = scanner.nextInt();
		stu.age = age;
		System.out.println("������ѧ���꼶(1.����  2.�м�  3.�߼�)");
		int level = scanner.nextInt();
		switch (level) {
		case 1 :
			stu.level = "����";
			break;
		case 2 :
			stu.level = "�м�";
			break;
		case 3 :
			stu.level = "�߼�";
			break;
		}
		
		System.out.println("������ѧ����ַ");
		String address = scanner.next();
		stu.address = address;
		System.out.println("������ѧ����ϵ��ʽ");
		long phoneNum = scanner.nextLong();
		stu.phoneNum = phoneNum;
		System.out.println("������ѧ����������");
		String mailAddress = scanner.next();
		stu.mailAddress = mailAddress;
		
		student = Arrays.copyOf(student, student.length+1);
		student[student.length-1] = stu;
		
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		chooseOperation();
	}
	
	// �鿴ѧ����Ϣѡ��
	public static void viewChoose() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("1.�鿴����ѧ����Ϣ"+"\t");
		System.out.print("2.����id��ѯѧ����Ϣ"+"\t");
		System.out.print("3.����id��ѯѧ������"+"\t");
		System.out.println("4.�˳�ϵͳ");
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
	
	// ͨ��id�鿴ѧ����Ϣ
	public static void viewStudentMessageById() {
		System.out.println("��ѡ��Ҫ�鿴��ѧ��id");
		Scanner scanner = new Scanner(System.in);
		int studentId = scanner.nextInt();
		for(int i=0;i<student.length;i++) {
			if(student[i].id == studentId) {
				System.out.println(student[i]);
			}
		}
		chooseOperation();
	}
	
	// ͨ��id��ȡ����
	public static void viewStudentMessageByIdToGetName() {
		System.out.println("��ѡ��Ҫ�鿴��ѧ��id");
		Scanner scanner = new Scanner(System.in);
		int studentId = scanner.nextInt();
		for(int i=0;i<student.length;i++) {
			if(student[i].id == studentId) {
				System.out.println(student[i].name);
			}
		}
		chooseOperation();
	} 
	
	// �鿴ȫ��ѧ����Ϣ
	public static void viewStudentMessage() {
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
		chooseOperation();
	}
	
	// ɾ��ѧ����Ϣ
	public static void deleteStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫɾ����id:");
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
	
	// �޸�ѧ����Ϣ
	public static void changeChoose() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("1.����id�޸�ȫ����Ϣ"+"\t");
		System.out.print("2.����id�޸Ĳ�����Ϣ"+"\t");
		System.out.print("3.�����ϼ�Ŀ¼"+"\t");
		System.out.println("4.�˳�ϵͳ");
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
	
	// ����id�޸�ȫ����Ϣ
	public static void changeAllById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�id:");
		int id = scanner.nextInt();
		for(int i = 0;i<student.length;i++) {
			if(student[i].id == id) {
				
				System.out.println("������ѧ��id");
				int idN= scanner.nextInt();
				student[i].id = idN;
				System.out.println("������ѧ������");
				String name = scanner.next();
				student[i].name = name;
				System.out.println("������ѧ���Ա�");
				String sex = scanner.next();
				student[i].sex = sex;
				System.out.println("������ѧ������");
				int age = scanner.nextInt();
				student[i].age = age;
				System.out.println("������ѧ���꼶(1.����  2.�м�  3.�߼�)");
				int level = scanner.nextInt();
				switch (level) {
				case 1 :
					student[i].level = "����";
					break;
				case 2 :
					student[i].level = "�м�";
					break;
				case 3 :
					student[i].level = "�߼�";
					break;
				}
				
				System.out.println("������ѧ����ַ");
				String address = scanner.next();
				student[i].address = address;
				System.out.println("������ѧ����ϵ��ʽ");
				long phoneNum = scanner.nextLong();
				student[i].phoneNum = phoneNum;
				System.out.println("������ѧ����������");
				String mailAddress = scanner.next();
				student[i].mailAddress = mailAddress;
				
			}
		}
		changeChoose();
	}
	
	// ����id�޸Ĳ�����Ϣ
	public static void changeOneById() {
		
	} 

	
	
	
}
