package jproject.basic;

import java.util.Scanner;

/*
* 输入输出案例
* */
public class InOutDemo {
    public static void main(String[] args) {
        int age=12;
        String name="Lundon";
        System.out.printf("%d , %s",age,name);

        String s=String.format("大家好，我叫%s,年龄是%d",name,age);
        System.out.println(s);

    }
}
