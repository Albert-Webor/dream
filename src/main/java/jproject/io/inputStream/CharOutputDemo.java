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
//        Writer wout = new OutputStreamWriter(new FileOutputStream(fileF),StandardCharsets.UTF_16);
//        wout.write(50);
//        wout.flush();

        // 文本格式输出,用的是追加的方式，那么输出流和文件的编码方式要一致，否则出现乱码，如果是替换，那么新文件的编码就是输出流的编码
        PrintStream pout = new PrintStream(new FileOutputStream(fileF,true),true,"UTF-8");
        pout.write(48);
        pout.write(49);
        pout.write(50);
        pout.print("ok");

//        pout.append("53");
    }

}
