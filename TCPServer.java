
// TCPserver.java

//测试内容:
//(1) 7.1 ha NACUYASUMI do tanosi BEkyousuru.
//(2) TOO many dianshangjishu Exp！
//(3) Thanks FOR Watching! 

import java.io.*; 
import java.net.*; 
class TCPServer { 

  public static void main(String argv[]) throws Exception 
    { 
      String ClientSentence; 
      String capitalizedSentence; 

      ServerSocket welcomeSocket = new ServerSocket(6789); 
  
      while(true) { 
  
            Socket connectionSocket = welcomeSocket.accept(); 

           BufferedReader inFromClient = 
              new BufferedReader(new
              InputStreamReader(connectionSocket.getInputStream()));            


           DataOutputStream  outToClient = 
             new DataOutputStream(connectionSocket.getOutputStream()); 

           ClientSentence = inFromClient.readLine(); 

           capitalizedSentence = ClientSentence.toLowerCase() + '\n'; 

           outToClient.writeBytes(capitalizedSentence); 
        } 
    } 
} 
 
