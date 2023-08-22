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
        Reader aio = new InputStreamReader(new FileInputStream(fileA));
        Reader bio = new BufferedReader(new InputStreamReader(new FileInputStream(fileB)));
        Scanner sio = new Scanner(new FileInputStream(fileC));
        RandomAccessFile rio = new RandomAccessFile(fileD,"rw");

        while(aio.ready()){
            System.out.println(aio.read());
        }
    }
}
