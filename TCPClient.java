/*TCPClient.java
test：
  第七组：输入大写字母转化为小写字母
        输入数字、符号不变
        输入汉字由于编码不同无法输出，成为乱码
*/

import java.io.*; 
import java.net.*; 
class TCPClient { 

    public static void main(String argv[ ]) throws Exception 
    { 
        String sentence; 
        String modifiedSentence; 

        BufferedReader inFromUser = 
          new BufferedReader(new InputStreamReader(System.in)); 

        Socket ClientSocket = new Socket("127.0.0.1", 6789); 

        DataOutputStream outToServer = 
          new DataOutputStream(ClientSocket.getOutputStream());
  BufferedReader inFromServer = 
          new BufferedReader(new
          InputStreamReader(ClientSocket.getInputStream())); 

        sentence = inFromUser.readLine(); 

        outToServer.writeBytes(sentence + '\n'); 

        modifiedSentence = inFromServer.readLine(); 

        System.out.println("FROM Server: " + modifiedSentence); 

 ClientSocket.close(); 
                   
    } 
} 
