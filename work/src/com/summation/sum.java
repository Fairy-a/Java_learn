package com.summation;

import com.main.main;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\u8ba1\u7b970.01+0.02+0.03+...+1.0=?\u7684\u503c");//文本：计算0.01+0.02+0.03+...+1.0=?的值
        System.out.println("================");
        double sum=0.0;//保存临时的结果
        double d=0.01;//初始值
        double newSum=0.0;//最终结果
        for(int i=0;i<100;i++){//100个数相加
            sum=sum+d;
            newSum=(int)(sum*100.0)/100.0;//因为double类型相加不是完全准确，所以转换为int再除以100得到正确结果
            d=d+0.01;
        }
        System.out.println(sum);
        System.out.println("\u7b54\u6848\u4e3a\uff1a"+newSum);//输出答案
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
