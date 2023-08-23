package jproject.network;

import java.net.Socket;

public class Monitor implements Runnable{
    private  Server server;

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("每10秒监控一次连接数："+server.i);
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
