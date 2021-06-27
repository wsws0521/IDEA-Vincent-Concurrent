package cn.vincent.threadpool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 用线程池  可以  简单的实现一个 webserver
 */
public class TaskExecutionWebServer {
    private static final int SIZE = 100;
    private static final Executor executor = Executors.newFixedThreadPool(SIZE);

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true){
            final Socket socket = serverSocket.accept();
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    handleRequest(socket);
                }
            };
            executor.execute(task);
        }
    }
    public static void handleRequest(Socket socket){
        // do sth
        System.out.println("request in...");
    }
}
