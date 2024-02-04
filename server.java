import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

class server{
    public static void main(String []args)
    {
        try{
            ServerSocket serverSocket=new ServerSocket(8000);
            Socket socket=serverSocket.accept();
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hii output conformed");
            dataOutputStream.close();
        }
        catch(Exception e)
        {
            System.out.print("Error in server");
        }
    }
}