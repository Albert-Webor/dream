package jproject.network;

import java.io.*;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws IOException {
        Socket post = new Socket("127.0.0.1",8189);
        post.setSoTimeout(10000); // 设置超时时间
        InputStream inputStream = post.getInputStream();
        OutputStream out = post.getOutputStream();
        boolean flg =true;
        while(flg){
            InputStream io = System.in;
            int s= io.read();
            if(s== 48)
                flg = false;
            out.write(s);
        }
    }
}
