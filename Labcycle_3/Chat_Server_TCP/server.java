package athul;
import java.io.*;
import java.net.*;
public class server {
public static void main(String args[]) {
	try {
	System.out.println("Waiting for client");
	ServerSocket ss = new ServerSocket(5000);
	Socket soc = ss.accept();
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
	String str; 
	BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	while(true){
	System.out.println("client: "+in.readLine());
	System.out.print("Server :");
	str = input.readLine();
	out.println("Server : "+str);
	if("quit".equalsIgnoreCase(str)) {
	soc.close();
	System.out.println("Server Stopped");
	break;
	}
	}
	}
	catch(Exception e){
	e.printStackTrace();
	}
	}
}
