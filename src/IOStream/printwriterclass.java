package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
The PrintWriter class is part of the java.io package and is used for writing formatted text to output streams such as files, console, or even sockets. It is a convenient class because it offers features like automatic flushing and writing text in a human-readable format.
1. PrintWriter Class
The PrintWriter class is used to write formatted text to a file, socket, or other output streams.
It provides methods to write data, including the print(), println(), and printf() methods.
Explanation:
PrintWriter is created using FileWriter to write to the file output.txt.
println() writes a line of text followed by a newline.
printf() allows formatted text, such as inserting numbers into the string.
The file is closed after writing to ensure that data is saved properly.


 */
public class printwriterclass {
    public static void main(String[] args) {

        try {
            // Create a PrintWriter connected to a file
            PrintWriter writer=new PrintWriter(new FileWriter("src/IOStream/output.txt"));
            //writing to the file
            writer.println("hello kakaji");
            writer.println("this is printwriter example");
            writer.printf("This is a number: %d", 123);

            writer.close();
            System.out.println("data written sucessful in file");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
