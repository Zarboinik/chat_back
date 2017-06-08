package foo.bar.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {

    private final Socket client;

    public ClientHandler(Socket client) {
        this.client = client;
        start();
    }

    @Override
    public void run(){
        try {
            DataInputStream dis = new DataInputStream(client.getInputStream());
            if(dis.available() > 0){
                //Обработка

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
