import java.io.*;
import java.net.*;
import java.lang.*;
public class Server{
    public static void main(String args[])throws Exception{
        ServerSocket ss = new  ServerSocket(4999);
        System.out.println("Server waiting for client ");
        Socket s = ss.accept();
        System.out.println("Connection Established");
        InputStreamReader i =new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(i);
	String str =br.readLine();
        System.out.println("Message is: "+str);
	//server responds to client
 	PrintWriter p = new PrintWriter(s.getOutputStream(),true);
        p.println("Hello client  i am server ");
        p.println(str);
        p.close();
   
    }
}

