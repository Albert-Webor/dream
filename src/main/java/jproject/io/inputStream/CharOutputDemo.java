package jproject.io.inputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CharOutputDemo {
    static String fileA = "/home/rui/Videos/a.txt";
    static String fileB = "/home/rui/Videos/b.txt";
    static String fileC = "/home/rui/Videos/c.txt";
    static String fileD = "/home/rui/Videos/d.txt";
    static String fileE = "/home/rui/Videos/e.txt";
    static String fileF = "/home/rui/Videos/f.txt";
    public static void main(String[] args) throws IOException {
        PrintStream pout = new PrintStream(fileA,"UTF-16");
        pout.print("你好woshi");
        pout.flush();
    }

}
