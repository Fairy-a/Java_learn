package com.reverse;

import com.main.main;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\u8bf7\u8f93\u5165\u4e00\u4e32\u6570\u5b57\uff0c\u672c\u7a0b\u5e8f\u5c06\u4f1a\u5012\u7740\u8f93\u51fa\u8fd9\u4e32\u6570\u5b57");
        //文本：请输入一串数字，本程序将会倒着输出这串数字
        System.out.println("============================");
        int a = s.nextInt();//从键盘输入数字
        StringBuffer aa = new StringBuffer(a+"");//使用StringBuffer对象，具有对象引用传递的特点
        a = Integer.parseInt(aa.reverse().toString());//倒转数字
        System.out.println(a);
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
