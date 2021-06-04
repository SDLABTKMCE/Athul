import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket s = new  Socket("localhost",4999);
        PrintWriter p = new PrintWriter(s.getOutputStream(),true);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String > ");
	String one =sc.nextLine();
        System.out.print("Enter second String >");
	String two =sc.nextLine();
        String three =one.concat(two);
        p.println(three);
       //accept response from client
	InputStreamReader i =new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(i);
        String str1 =br.readLine();
        String str2 =br.readLine();
        System.out.println("Message: "+str1);
        System.out.println("Concatinated string is: "+str2);
        p.close();
    }
}
