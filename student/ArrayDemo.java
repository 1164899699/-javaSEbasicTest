import java.util.*;

public class ArrayDemo{
	public static void main(String[] args){
		//������������  byte short int long float double char boolean 
		//������������  ���� Class interface
		//��������
		//��һ�ִ�������ķ�ʽ
		byte[] nums = {1,5,7,9,10};
		//�ڶ��ִ�������ķ�ʽ
		byte[] nums2 = new byte[5];
		nums2[0] = 10;
		nums2[1] = 50;
		//������
		byte[] nums3 = new byte[]{
			1,5,7,9,10
		};
		//char 
		//�����ص�
		//������ ���ȹ̶� ������ȷ �±��0��ʼ
		//System.out.print(nums[2]);
		//nums.length ����
		/*for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}*/
		//System.out.print(nums2[1]);
		// ����   ������������   null��
		byte[] bytes = {1,5,7,9,10};
		byte[] bytes2 = new byte[bytes.length];
		for(int i=0;i<bytes.length;i++){
			bytes2[i] = bytes[i];
		}
		//System.out.print("bytes�ĵ�һλ:"+bytes[0]);
		//System.out.print("bytes2�ĵ�һλ:"+bytes2[0]);
		bytes[0] = 100;
		//System.out.print("bytes�ĵ�һλ:"+bytes[0]);
		//System.out.print("bytes2�ĵ�һλ:"+bytes2[0]);
		
		//Arrays.toString();
		//System.out.print(Arrays.toString(bytes));
		
		//Դ����
		//�ֶ�����
		//byte[] sourceArray = {1,5,7,9,10};
		//byte[] newArray = new byte[sourceArray.length+1];
		//for(int i=0;i<sourceArray.length;i++){
		//	newArray[i] = sourceArray[i];
		//}
		//newArray[newArray.length-1] = 100;
		//System.out.print(Arrays.toString(newArray));
		
		//jdk�ṩ���������ݵ�API
		//System.arraycopy(src , srcPos, dest , destPos , length)��
		//��������� Java API �ṩ�ģ��ײ� ���� C++д�ģ�
		//�����ٶȷǳ��죬�� for()ѭ��ʵ�����鿽��Ч��Ҫ�ߺܶ࣬
		//�����Ƽ�ʹ��.
		//byte[] sourceArray = {1,5,7,9,10};
		//byte[] newArray = new byte[sourceArray.length];
		//System.arraycopy(sourceArray,0,newArray,0,5);
		//System.out.print(Arrays.toString(newArray));
		
		
		//Arrays.copyOf(src , length)���� JDK1.6 �汾�ṩ�ķ�����
		//���� System.arraycopy()ʹ�ø���㣬����Ҫע�������Ŀ������� 
		//JDK �汾������ 1.6 �����ϡ�copyOf() �����ĵײ���� arraycopy()����.
		/*
		byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,3);
		System.out.print(Arrays.toString(newArray));
		*/
		
		//��������
		//Դ����
		byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
	}
}