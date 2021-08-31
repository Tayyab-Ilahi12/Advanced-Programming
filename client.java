import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class client{
public static void main(String[] args) {
    
    try {
        Socket socket=new Socket(InetAddress.getLocalHost(),4000);
        DataOutputStream out1=new DataOutputStream(socket.getOutputStream());
        // DataOutputStream out=new DataOutputStream(socket.getOutputStream());
        out1.writeUTF("hello from client");
        out1.flush();
        out1.close();
        socket.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } 
}
}