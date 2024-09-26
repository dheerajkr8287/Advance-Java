package IOStream;
/*
The FileWriter class in Java is part of the java.io package and is used to write character data to files.
 It makes it easy to write text to a file using a character stream

 */
import java.io.FileWriter;
import java.io.IOException;


public class filewriter {
    public static void main(String[] args) {
        //define filename
        String fileName="fileMake.txt";
        //try with resource:error handled by jvm
        try(FileWriter writer=new FileWriter(fileName)){
            //write a string to fileName
            writer.write("hello java developer");
            writer.flush();//flush();ensuring all the data is written out.
            for (int i = 0; i < 100; i++) {
                writer.write("*");
            }
            System.out.println("Sucessful written to the file");
        }
        catch (IOException e){
            System.out.println("An error");
            e.getMessage();



        }

    }
}
