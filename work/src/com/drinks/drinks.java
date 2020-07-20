package com.drinks;

import com.main.main;

import java.util.Scanner;

public class drinks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("\u670950\u74f6\u996e\u6599\uff0c\u559d\u5b8c3\u4e2a\u7a7a\u74f6\u53ef\u4ee5\u6362\u4e00\u74f6\u996e\u6599\uff0c\u4f9d\u6b21\u7c7b\u63a8\uff0c\u8bf7\u95ee\u603b\u5171\u559d\u4e86\u591a\u5c11\u74f6\u996e\u6599\uff1f");
        //文本：有50瓶饮料，喝完3个空瓶可以换一瓶饮料，依次类推，请问总共喝了多少瓶饮料？
        int drink = 50;//初始饮料数量
        int count = 0;//换的饮料数量
        int c;//用来计算的初始饮料数量
        int i = 0;//保存喝完的饮料瓶
        for (c=drink;c>0;c--) {
            i++;
            if ((i%3)==0) {
                count++;
                c++;
            }
        }
        System.out.println("\u603b\u5171\u559d\u4e86"+(drink+count)+"\u74f6\u996e\u6599");//输出最后数量
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
