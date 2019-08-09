//????
import java.util.Random;
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
		//????
	    int age1 = 50;
		int age2 = 80;
		//System.out.print(age1+age2);
		//API
		//int num = 19;
		//??????
		//System.out.print(Integer.toBinaryString(num));
		//???
		//System.out.print(Integer.toHexString(num));
		//?????
		//System.out.print(Integer.toOctalString(num));
		
		//Test3
		long longNum = 12345678901L;
		float floatNum = 3.1415926F;
		double doubleNum = 1234567890.0987654321;
		
		
		//Test4
		//??????????
		Random random = new Random();
		int num = random.nextInt(26);
		//????char????
		char result = (char)('A'+num);
		//System.out.println(result);
		
		//Test5
		//Scanner scanner = new Scanner(System.in);
		//int scannerNum = scanner.nextInt();
		//System.out.print(scannerNum*scannerNum);
		
		//?????
		//1???? = 4.2*9.46*10^15m
		double lightYear = 4.2*9.46*Math.pow(10,15);
		//System.out.print(lightYear/0.45);
		
		//????????
		double height = 384;
		double g = 9.8;
		System.out.print(Math.sqrt(2*height*g));
	}
}