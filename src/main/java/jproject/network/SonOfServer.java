package jproject.network;

import java.net.Socket;

public class SonOfServer implements Runnable{
    private Socket socket;

    public SonOfServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("连接建立");
    }
}
