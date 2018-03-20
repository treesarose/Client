import java.net.*; 

import java.io.OutputStream;

import java.io.DataOutputStream;

 

public class WishesClient

{

   public static void main(String args[]) throws Exception

   {

     Socket sock = new Socket("localhost", 5000);

	InetAddress ip=sock.getInetAddress();

	System.out.println(ip);       

     String message1 = "Accept Best Wishes, Server";

 

     OutputStream ostream = sock.getOutputStream();                 

     DataOutputStream dos = new DataOutputStream(ostream);

     dos.writeBytes(message1);                                                         

     dos.close();                            

     ostream.close();   

     sock.close();

  }

}
