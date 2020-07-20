package com.pyramid;

import com.main.main;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner s = new Scanner(System.in);
        System.out.println("\u8bf7\u8f93\u5165\u91d1\u5b57\u5854\u5c42\u6570\uff1a");//文本：请输入金字塔层数：
        System.out.println("================");
        n = s.nextInt();
        //外层循环控制层数
        for(i = 1; i <= n; i++){
            //根据外层行号，输出星号左边的空格
            for(j = 1; j <= n - i; j++)
                System.out.print(" ");
            //根据外层行号，输出星号个数
            for(k = 1; k <= 2 * i -1; k++)
                System.out.print("*");
            //换行
            System.out.println();
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
