package com.lcf.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("本例程将模拟登陆中输入的各种情况来验证常见的异常");
        Thread.currentThread().sleep(500);
        while (true) {
            try {
                System.out.println();
                System.out.println("请输入对应选项前面的数字按下回车来查看相关异常的演示");
                Thread.currentThread().sleep(500);
                System.out.println("===================");
                System.out.println("【1】空值异常（调用getMessage()方法输出错误）");
                System.out.println("【2】输入类型错误异常（调用printStackTrace()方法输出错误）");
                System.out.println("【3】数值负值异常（调用toString()方法输出错误）");
                System.out.println("【4】数值越界异常（调用自定义的warnMess()方法）");
                System.out.println("===================");
                System.out.print("请输入：");
                int temp = s.nextInt();
                switch (temp){
                    case 1:nullException(0);break;
                    case 2:login();break;
                    case 3:rangeException(-1);break;
                    case 4:maxException();break;
                }
                break;
            }catch (NullException e) {
                System.out.println("调用getMessage()方法：");
                Thread.currentThread().sleep(500);
                System.out.println(e.getMessage());
                Thread.currentThread().sleep(500);
                System.out.println("请重新选择。");
                System.out.println();
                Thread.currentThread().sleep(500);
            }catch (DoubleException e) {
                System.out.println("调用printStackTrace()方法");
                Thread.currentThread().sleep(500);
                e.printStackTrace();
                Thread.currentThread().sleep(500);
                System.out.println("请重新选择。");
                System.out.println();
                Thread.currentThread().sleep(500);
            }catch (StringException e) {
                System.out.println("调用printStackTrace()方法");
                Thread.currentThread().sleep(500);
                e.printStackTrace();
                Thread.currentThread().sleep(500);
                System.out.println("请重新选择。");
                System.out.println();
                Thread.currentThread().sleep(500);
            }catch (RangeException e) {
                System.out.println("调用toString()方法");
                Thread.currentThread().sleep(500);
                System.out.println(e.toString());
                Thread.currentThread().sleep(500);
                System.out.println("请重新选择。");
                System.out.println();
                Thread.currentThread().sleep(500);
            }catch (MaxException e) {
                System.out.println("调用warnMess()方法");
                Thread.currentThread().sleep(500);
                System.out.println(e.warnMess());
                Thread.currentThread().sleep(500);
                System.out.println("请重新选择。");
            }catch (InputMismatchException e){
                e.printStackTrace();
            } finally {
                System.out.println("finally中执行的语句");
            }
        }

    }

    public static void login() throws DoubleException, StringException {//判断输入的类型
        Scanner s = new Scanner(System.in);
        long Long;
        String string;
        double Double;
        System.out.println("输入一个整数\n\n");
        if(s.hasNextInt()){
            Long = s.nextLong();
            System.out.println("您输入的是一个整数:"+Long);
        }
        else if(s.hasNextDouble()){
            Double =s.nextDouble();
            throw new  DoubleException();
        }
        else if (s.hasNext()){
            string = s.nextLine();
            throw new StringException();
        }
    }
    public static void nullException(int a) throws NullException {//空值异常演示
        Integer A = a;
        A = null;
        if (A == null) throw new NullException();
    }
    public static void rangeException(int a) throws RangeException {//负值异常演示
        if (a <= 0) throw new RangeException();
    }
    public static void maxException() throws MaxException {//范围异常演示
        /*if (Integer.MAX_VALUE+1 > Integer.MAX_VALUE) */throw new MaxException();
    }
}
