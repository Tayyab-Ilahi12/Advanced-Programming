import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(4000);
            Socket socket=serverSocket.accept();
            DataInputStream in =new DataInputStream(socket.getInputStream());
            System.out.println(in.readUTF());
            in.close();
            socket.close();
            serverSocket.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}