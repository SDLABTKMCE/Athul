package athul;
import java.io.*;
import java.net.Socket;
public class client {
public static void main(String args[]) {
	try {			
	System.out.println("Client Started");			
	Socket soc = new Socket("localhost",5000);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
	BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	while(true) {			
	System.out.println("Client :");
	String str = input.readLine();
	out.println(str);
	if("quit".equalsIgnoreCase(str)) {
	soc.close();
	System.out.println("Client Stopped");
	break;			
	}
	System.out.println("Server : "+in.readLine());
	}
	}
	catch(Exception e){
	e.printStackTrace();
}
}
}
