import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream os=null;
        try {
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port=9999;
            socket=new Socket(serverIP,port);
             os=socket.getOutputStream();
            System.out.println("请输入你想输入的话");
            Scanner sc=new Scanner(System.in);
            String a =sc.nextLine();
            os.write(a.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
