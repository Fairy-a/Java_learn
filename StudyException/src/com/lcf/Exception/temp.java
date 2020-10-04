package com.lcf.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class temp{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int a = s.nextInt();

        }catch (InputMismatchException e){
            System.out.println("输错了");
        }
    }
}
