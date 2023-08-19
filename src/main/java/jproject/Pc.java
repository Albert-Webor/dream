package jproject;

import java.io.*;

public class Pc {
    enum Size{SMALL,MEDIUM,LARGE};
    static int a = 1;
    static int b = 2;
    static int c = 3;
    static int d = -4;
    static int e = 5;

    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(10000);
        int a=0;
        for(int i=1;i<100;i++){
            a+=i;
        }
        System.out.println(a);

    }
}
