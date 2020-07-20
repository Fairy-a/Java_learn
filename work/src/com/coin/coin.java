package com.coin;

import com.main.main;

import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("\u672c\u7a0b\u5e8f\u5c06\u6a21\u62df\u63b7\u786c\u5e01\u7684\u7ed3\u679c");//文本：本程序将模拟掷硬币的结果
        System.out.println("==============");
        if((int)(Math.random()*(2)) >= 0.5){
            System.out.println("\u672c\u6b21\u7684\u7ed3\u679c\u4e3a:"+" \u6b63\u9762");//文本：本次的结果为 正面
        }else {
            System.out.println("\u672c\u6b21\u7684\u7ed3\u679c\u4e3a:"+" \u53cd\u9762");//文本：本次的结果为 反面
        }
        System.out.println();
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
