package jproject.io.inputStream;

import java.io.*;
/*
* 面向字节流
* */
public class ByteOutputDemo {
    static String fileA = "/home/rui/Videos/a.txt";
    static String fileB = "/home/rui/Videos/b.txt";
    static String fileD = "/home/rui/Videos/d.txt";
    static String fileF = "/home/rui/Videos/f.txt";
    static String fileG = "/home/rui/Videos/g.txt";

    /*将字节读入到字节数组中*/
    public static void readToByteArray(FileInputStream io,byte[] a)throws IOException{
        io.read(a);
    }

    public static void writeToByteArray(FileOutputStream io, byte[] a)throws IOException{
        io.write(a);
    }
    public static void main(String[] args) throws IOException {
        byte[] a = new byte[1];
        byte[] b = {50};
        //基础
        FileInputStream ain = new FileInputStream(fileF);
        FileOutputStream aout = new FileOutputStream(fileB);

        //读取不同长度的字节赋给基本数据类型或者将基本数据类型写到流中
        DataOutputStream dout = new DataOutputStream(aout);

        //带缓冲区的输入输出流
        BufferedInputStream bin = new BufferedInputStream(ain);
        BufferedOutputStream bout = new BufferedOutputStream(aout);

        //可回推输入流
        PushbackInputStream pin = new PushbackInputStream(bin);
        DataInputStream din = new DataInputStream(pin);

        while(ain.available() > 0){
            System.out.println(ain.read());
        }
    }
}
