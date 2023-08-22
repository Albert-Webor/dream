package jproject.io.inputStream;

import java.io.*;

import static javafx.scene.input.KeyCode.H;

public class ByteInputDemo {
    static String fileA = "/home/rui/Videos/a.txt";
    static String fileB = "/home/rui/Videos/b.txt";
    static String fileC = "/home/rui/Videos/c.txt";
    static String fileD = "/home/rui/Videos/d.txt";
    static String fileE = "/home/rui/Videos/e.txt";
    static String fileF = "/home/rui/Videos/f.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream aio =new FileInputStream(fileA);
        DataInputStream dio = new DataInputStream(new FileInputStream(fileB));
        while (aio.available() > 0){
            System.out.println(aio.read());
        }



    }
}
