package com.narcissus;

import com.main.main;

import java.util.Scanner;

public class narcissus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x =0;//定义水仙花数的个数
        for (int i = 0; i < 1000; i++) {
            int b = i/100;//取得百位数
            int ss = (i-100*b)/10;//取得十位数
            int g = (i-ss*10-b*100);//取得个位数
            if (i==g*g*g+ss*ss*ss+b*b*b){
                x++;//每次符合水仙花数条件，则x+1;
                System.out.println(i+" ");//输出符合条件的数
            }
        }
        System.out.println();//换行
        System.out.println("\u6c34\u4ed9\u82b1\u6570\u5171\u6709"+x+"\u4e2a");//输出水仙花数的总数
        //文本：水仙花数共有?个
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
