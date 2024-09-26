package IOStream;

import java.io.FileReader;
import java.io.IOException;

/*
FileReader class is used for reading streams of character from filies
-->its character based stream,meaning it reads character .it make suitable for reading text files

 */
public class filereader {
    public static void main(String[] args) {
        String fileName="src/FileHandling/fileMake.txt";
        try(FileReader reader=new FileReader(fileName)){
          int read=0;
          do{
              read=reader.read();
              System.out.print((char) read);
          }while (read!=-1);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
