package jproject.network;

import java.io.*;
import java.net.Socket;

public class CustomOne {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8189);
        socket.setSoTimeout(10000); // 设置超时时间
        InputStream inputStream = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
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
