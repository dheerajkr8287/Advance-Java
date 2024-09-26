package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Q_robustFileReader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the filename you want");
        String fileName=sc.next();
        try(FileReader reader=new FileReader(fileName)){
            int read=0;
            do{
                read= reader.read();
                System.out.print((char) read);

            }while (read!=-1);
        }
        catch (FileNotFoundException e){
            System.out.printf("%s not found",fileName);

        }
        catch(Exception e){
            System.out.println("File does not found");
        }
    }
}
