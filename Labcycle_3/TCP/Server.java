package MCAPY;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) {
		try {
			System.out.println("Waiting for client");
			ServerSocket ss = new ServerSocket(5000);
			Socket soc = ss.accept();
			System.out.println("Connection Established");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			String str; 
			while((str= in.readLine()) != null) {
				out.println("From Server : "+str);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

