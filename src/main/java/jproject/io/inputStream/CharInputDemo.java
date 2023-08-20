package jproject.io.inputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
* 面向字符流
* */
public class CharInputDemo {
    static String fileA = "/home/rui/Videos/a.txt";
    static String fileB = "/home/rui/Videos/b.txt";
    static String fileC = "/home/rui/Videos/c.txt";
    static String fileD = "/home/rui/Videos/d.txt";
    static String fileE = "/home/rui/Videos/e.txt";
    static String fileF = "/home/rui/Videos/f.txt";

    public static void main(String[] args) throws IOException {
        char[] a = new char[14];
        //基础
        FileInputStream in = new FileInputStream(fileF);

        //Unicode码元单位
        Reader reader = new InputStreamReader(in,StandardCharsets.UTF_16BE);
        reader.read(a);
        for(char c : a)
            System.out.println(c);

        //常见的
//        Scanner scanner = new Scanner(in,"UTF-16BE");
//
//        while (scanner.hasNext())
//            System.out.println(scanner.nextLine());
    }
}
