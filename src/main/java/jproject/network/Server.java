package jproject.network;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.Arrays;


/*
* 服务器
* */
public class Server {
    //客户端连接数
    public static int i;
    //服务器等待时间30s,超过这个时间并且没有正在连接的将自动关闭
    public static int ACTIVE_TIME = 30;
    public static void main(String[] args) throws IOException {
        Runnable jiankong = new Monitor();
        Thread monitor= new Thread(jiankong);
        try(ServerSocket serverSocket = new ServerSocket(8189)){
            //启动监控器

            monitor.start();

            i=0;
            while(true){

                Socket socket = serverSocket.accept();
                i++;
                System.out.println("请求建立");
                Thread r= new Thread(new SonOfServer(socket));
                r.start();

            }
        }
    }
}
