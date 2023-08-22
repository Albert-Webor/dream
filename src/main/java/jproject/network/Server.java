package jproject.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 服务器
* */
public class Server {
    public static void main(String[] args) throws IOException {
        //指定服务器端口
        ServerSocket server = new ServerSocket(8189);
        boolean flg=true;
        Socket in = server.accept();
        while(in.isConnected()){
            InputStream inputStream = in.getInputStream();
            OutputStream outputStream = in.getOutputStream();
            int s=inputStream.read();
            if(s == 48){
                System.out.println("客户端请求断开连接");
                in.close();
                break;
            }
            if(s != -1 && s !=10){
                System.out.println("收到数据:"+s);
            }
        }
    }
}
