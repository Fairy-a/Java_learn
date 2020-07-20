package com.guess;

import com.main.main;

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\u731c\u6570\u5b57\u6e38\u620f");
        System.out.println("================");
        System.out.println("\u5c06\u4f1a\u4ea7\u751f\u4e00\u4e2a 1-100 \u7684\u968f\u673a\u6570");
        //文本：将会产生一个1-100的随机数
        System.out.println("\u8bf7\u5728\u63a7\u5236\u53f0\u8f93\u5165\u6570\u5b57\u8fdb\u884c\u6e38\u620f");
        //文本：请在控制台输入数字进行游戏
        int num = (int)(Math.random()*100)+1;//生成一个1-100的随机数
        int temp = 7;//7次机会
        while (true){
            if (temp<0){
                int i = s.nextInt();
                if (i<num){
                    System.out.println("\\u5bf9\\u4e0d\\u8d77\\uff0c\\u4f60\\u731c\\u5c0f\\u4e86");
                    //文本：对不起，你猜小了
                    temp--;
                }else if (i>num){
                    System.out.println("\\u5bf9\\u4e0d\\u8d77\\uff0c\\u4f60\\u731c\\u5927\\u4e86");
                    //文本：对不起，你猜大了
                    temp--;
                }else if (i==num){
                    System.out.println("\\u606d\\u559c\\u4f60\\u731c\\u5bf9\\u4e86");
                    //文本：恭喜你猜对了
                    break;
                }else {
                    System.out.println("\\u8f93\\u5165\\u6709\\u8bef\\uff0c\\u8bf7\\u91cd\\u65b0\\u8f93\\u5165");
                    //文本：输入有误，请重新输入
                }
            }else {
                System.out.println("\u4f60\u592a\u7b28\u4e86\uff0c\u4e0b\u6b21\u518d\u6765\u5427\uff01");
                //文本：你太笨了，下次再来吧！
                break;
            }
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
