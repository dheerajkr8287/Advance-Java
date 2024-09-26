package IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader Class
The BufferedReader class is used to read text from an input source, like a file, efficiently by buffering the input.
It provides methods like readLine() for reading data line by line.
Explanation:
BufferedReader is created using FileReader to read from output.txt.
readLine() reads each line from the file until the end (returns null when no more lines are available).
The BufferedReader is closed after reading to release resources.
Key Differences:
PrintWriter writes data, while BufferedReader reads data.
PrintWriter can be used for formatted writing, while BufferedReader is typically used for efficient line-by-line reading.



 */
public class Bufferreaderclass {
    public static void main(String[] args) {
       try{
           // Create a BufferedReader to read from a file

           BufferedReader reader=new BufferedReader(new FileReader("src/IOStream/output.txt"));
           // Reading the file line by line

           String line;
           while ((line=reader.readLine())!=null){
               System.out.println(line);
           }
           reader.close();
           System.out.println("All data read sucessfully");
       }catch (IOException e){
           System.out.println(e.getMessage());

       }
    }
}
