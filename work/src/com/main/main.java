package com.main;

import com.coin.coin;
import com.drinks.drinks;
import com.guess.guess;
import com.narcissus.narcissus;
import com.pyramid.pyramid;
import com.reverse.reverse;
import com.summation.sum;
import com.temperature.temperature;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("===\u9009\u62e9\u8981\u67e5\u770b\u7684\u529f\u80fd===");//文本：选择要查看的功能
        System.out.println("\t" + "1.\u6e29\u5ea6\u8f6c\u6362");//文本：温度转换
        System.out.println("\t" + "2.\u6a21\u62df\u63b7\u786c\u5e01");//文本：模拟掷硬币
        System.out.println("\t" + "3.\u731c\u6570\u5b57");//文本：猜数字
        System.out.println("\t" + "4.\u6c34\u4ed9\u82b1");//文本：水仙花
        System.out.println("\t" + "5.\u5012\u6392\u6570\u5b57");//文本：倒排数字
        System.out.println("\t" + "6.\u91d1\u5b57\u5854");//文本：金字塔
        System.out.println("\t" + "7.\u996e\u6599\u95ee\u9898");//文本：饮料问题
        System.out.println("\t" + "8.\u6c42\u548c");//文本：求和
        System.out.println("==================");
        System.out.println("\u8bf7\u8f93\u5165\u529f\u80fd\u524d\u9762\u7684\u6570\u5b57\u9009\u62e9");//文本：请输入功能前面的数字选择
        A:while (true){
            int a = myScanner.nextInt();                        //从键盘获取输入
            switch (a){                                         //功能选择判断
                case 1 : temperature.main(args);break A;
                case 2 : coin.main(args);break A;
                case 3 : guess.main(args);break A;
                case 4 : narcissus.main(args);break A;
                case 5 : reverse.main(args);break A;
                case 6 : pyramid.main(args);break A;
                case 7 : drinks.main(args);break A;
                case 8 : sum.main(args);break A;
                default: System.out.println("\u5bf9\u4e0d\u8d77"+"，"+"\u4f60\u7684\u8f93\u5165\u6709\u8bef\u8bf7\u91cd\u65b0\u8f93\u5165");
                    //文本：对不起，你的输入有误请重新输入
            }
        }
    }
}
