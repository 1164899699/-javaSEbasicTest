package com.liuyu.test4;


/**
* @ClassName: Test
* @Description: 多态测试类
* @author YangSong
* @date 2019年8月13日 下午3:06:22
*
*/
public class Test {
    public static void main(String[] args) {
  //  	BWPrinter bawp = new BWPrinter();
  //  	bawp.printer();
  //  	ColorfulPrinter colorfulPrinter = new ColorfulPrinter();
  //  	colorfulPrinter.printer();
    	
    	// 多态 继承 重写  向上转型
    	// 赋值多态
    	Printer printer = new ColorfulPrinter();
    	printer.printer();
    	// 传参多态
    	ColorfulPrinter colorfulPrinter = new ColorfulPrinter();
    	toPrint(colorfulPrinter);
    }
    //定义方法要打印 使用黑白打印机打印
    public static void toPrint(Printer printer) {
    	printer.printer();
    }
    
  //定义方法要打印  使用彩色打印机打印
   // public static void toPrint(ColorfulPrinter printer) {
    //	printer.printer();
  //  }
    
    
    
}
