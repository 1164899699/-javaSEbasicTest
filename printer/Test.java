package com.liuyu.test4;


/**
* @ClassName: Test
* @Description: ��̬������
* @author YangSong
* @date 2019��8��13�� ����3:06:22
*
*/
public class Test {
    public static void main(String[] args) {
  //  	BWPrinter bawp = new BWPrinter();
  //  	bawp.printer();
  //  	ColorfulPrinter colorfulPrinter = new ColorfulPrinter();
  //  	colorfulPrinter.printer();
    	
    	// ��̬ �̳� ��д  ����ת��
    	// ��ֵ��̬
    	Printer printer = new ColorfulPrinter();
    	printer.printer();
    	// ���ζ�̬
    	ColorfulPrinter colorfulPrinter = new ColorfulPrinter();
    	toPrint(colorfulPrinter);
    }
    //���巽��Ҫ��ӡ ʹ�úڰ״�ӡ����ӡ
    public static void toPrint(Printer printer) {
    	printer.printer();
    }
    
  //���巽��Ҫ��ӡ  ʹ�ò�ɫ��ӡ����ӡ
   // public static void toPrint(ColorfulPrinter printer) {
    //	printer.printer();
  //  }
    
    
    
}
