package com.temperature;

import com.main.main;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\u534e\u6c0f\u6e29\u5ea6\u4e0e\u6444\u6c0f\u6e29\u5ea6\u8f6c\u6362");//文本：华氏温度与摄氏温度转换
        System.out.println("===================");
        System.out.println("\u5c06\u534e\u6c0f\u6e29\u5ea6\u8f6c\u6362\u6210\u6444\u6c0f\u6e29\u5ea6\u6216\u5c06\u6444\u6c0f\u6e29\u5ea6\u8f6c\u5316\u6210\u534e\u6c0f\u6e29\u5ea6");
            //文本：将华氏温度转换成摄氏温度或将摄氏温度转化成华氏温度
        System.out.println("\u4f8b\u5982\uff1a\u82e5\u7528\u6237\u8f93\u5165" + "27 C" + "\uff0c\u5219\u7a0b\u5e8f\u8f93\u51fa" + "81 F" + "\uff0c\u82e5\u7528\u6237\u8f93\u5165" + "96 C" + "\uff0c\u5219\u7a0b\u5e8f\u8f93\u51fa" + "36 F");
            //文本：例如：若用户输入27 C则程序输出，81 F若用户输入96 C，则程序输出36 F
        String a = s.nextLine();    //从键盘输入
        String tem = a.substring(a.length()-1,a.length());//截取最后一个字符
        String num = a.substring(0, a.length()-2);//截取第一个到倒数第二个字符
        int i = Integer.parseInt(num);//把String转化为int类型
        if (tem.equalsIgnoreCase("F")){ //忽略大小写判断字符是否为F
            int temp = (int)(5*(i-32)/9);
            System.out.println("\u534e\u6c0f\u5ea6"+a+"\u8f6c\u4e3a\u6444\u6c0f\u5ea6\u4e3a"+temp+" C");
            //文本：华氏度转为摄氏度为
        }else if (tem.equalsIgnoreCase("C")){//忽略大小写判断字符是否为C
            int temp = (int)((9*i)/5+32);
            System.out.println("\u6444\u6c0f\u5ea6"+a+"\u8f6c\u4e3a\u534e\u6c0f\u5ea6\u4e3a"+temp+" F");
            //文本：摄氏度转为华氏度为
        }else {
            System.out.println("\u8f93\u5165\u6709\u8bef\u5c06\u4f1a\u91cd\u65b0\u6267\u884c");
            //文本：输入有误将会重新执行
            System.out.println("===================");
            temperature.main(args);
        }
        System.out.println("\u662f\u5426\u56de\u5230\u4e3b\u9875"+"(y/n)?");//文本：是否回到主页
        String input="";
        input=s.nextLine();
        if (input.equals("y")){
            main.main(args);
        }else {
            main(args);
        }
    }
}
