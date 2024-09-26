package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

public class InputStreamReader extends Reader
An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input stream. To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than are necessary to satisfy the current read operation.
 */
public class inputstreamreader {
    public static void main(String[] args) {
     try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
         System.out.println("Enter the some text:");
         // Read a line of text
         String input=reader.readLine();
         System.out.println("you entered:"+input);
     }
     catch( IOException e){
         System.out.println(e.getMessage());
     }

    }
}
