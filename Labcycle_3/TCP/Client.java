package MCAPY;
import java.io.*;

import java.net.*;

public class Client {
    public static void main(String args[]) {
		try {
			System.out.println("Client Started");
			Socket soc = new Socket("localhost",5000);
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			
			while(true) {
				System.out.println("Enter your Text");
				String str = input.readLine();
				if("quit".equalsIgnoreCase(str)) {
					soc.close();
					System.out.println("Client Stopped");
					break;
				}
				out.println(str);
				BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				System.out.println(in.readLine());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    
}

