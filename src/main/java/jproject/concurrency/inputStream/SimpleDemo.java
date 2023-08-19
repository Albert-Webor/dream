package jproject.concurrency.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SimpleDemo {
    static String fileA = "/home/rui/Videos/a.txt";

    public static void main(String[] args) throws IOException {
        byte[] lstByte = new byte[5];
        FileInputStream aio = new FileInputStream(fileA);
        System.out.println("输入流共字节"+aio.available());
        aio.read(lstByte);
        for(byte a : lstByte)
            System.out.println(""+a);

    }
}
