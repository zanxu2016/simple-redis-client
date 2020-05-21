package info.luckydog.simpleredisclient.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RedisServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6388);
        Socket socket = server.accept();
        byte[] chars = new byte[64];

        int read = socket.getInputStream().read(chars);
        System.out.println("has read length: " + read);
        System.out.println(new String(chars));
    }

}
