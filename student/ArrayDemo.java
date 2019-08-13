import java.util.*;

public class ArrayDemo{
	public static void main(String[] args){
		//基本数据类型  byte short int long float double char boolean 
		//引用数据类型  数组 Class interface
		//创建数组
		//第一种创建数组的方式
		byte[] nums = {1,5,7,9,10};
		//第二种创建数组的方式
		byte[] nums2 = new byte[5];
		nums2[0] = 10;
		nums2[1] = 50;
		//第三种
		byte[] nums3 = new byte[]{
			1,5,7,9,10
		};
		//char 
		//数组特点
		//连续的 长度固定 类型明确 下标从0开始
		//System.out.print(nums[2]);
		//nums.length 属性
		/*for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}*/
		//System.out.print(nums2[1]);
		// 数组   引用数据类型   null空
		byte[] bytes = {1,5,7,9,10};
		byte[] bytes2 = new byte[bytes.length];
		for(int i=0;i<bytes.length;i++){
			bytes2[i] = bytes[i];
		}
		//System.out.print("bytes的第一位:"+bytes[0]);
		//System.out.print("bytes2的第一位:"+bytes2[0]);
		bytes[0] = 100;
		//System.out.print("bytes的第一位:"+bytes[0]);
		//System.out.print("bytes2的第一位:"+bytes2[0]);
		
		//Arrays.toString();
		//System.out.print(Arrays.toString(bytes));
		
		//源数组
		//手动扩容
		//byte[] sourceArray = {1,5,7,9,10};
		//byte[] newArray = new byte[sourceArray.length+1];
		//for(int i=0;i<sourceArray.length;i++){
		//	newArray[i] = sourceArray[i];
		//}
		//newArray[newArray.length-1] = 100;
		//System.out.print(Arrays.toString(newArray));
		
		//jdk提供了数组扩容的API
		//System.arraycopy(src , srcPos, dest , destPos , length)：
		//这个方法是 Java API 提供的，底层 是用 C++写的，
		//所以速度非常快，比 for()循环实现数组拷贝效率要高很多，
		//所以推荐使用.
		//byte[] sourceArray = {1,5,7,9,10};
		//byte[] newArray = new byte[sourceArray.length];
		//System.arraycopy(sourceArray,0,newArray,0,5);
		//System.out.print(Arrays.toString(newArray));
		
		
		//Arrays.copyOf(src , length)：是 JDK1.6 版本提供的方法，
		//比起 System.arraycopy()使用更简便，但需要注意的是你的开发环境 
		//JDK 版本必须是 1.6 及以上。copyOf() 方法的底层就是 arraycopy()方法.
		/*
		byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,3);
		System.out.print(Arrays.toString(newArray));
		*/
		
		//扩容数组
		//源数组
		byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
	}
}