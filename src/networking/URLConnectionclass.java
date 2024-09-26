package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
URLConnection
URLConnection represents a communication link between your Java application and a URL. It provides a more flexible way to handle network connections than URL.

Key Methods:
connect(): Establishes a connection.
getInputStream(): Returns an input stream for reading data from the resource.
getContentType(): Returns the content type of the resource.
openConnection() :method in Java is a part of the URL class in the java.net package. It is used to create a URLConnection object for the specified URL. This method allows you to interact with the resource referenced by the URL, such as establishing a connection, retrieving headers, or reading data.
 */
public class URLConnectionclass {
    public static void main(String[] args) {
     try{
         URL url=new URL("https://www.google.com/search?sca_esv=57cb6114f464605f&sca_upv=1&q=apple&udm=2&fbs=AEQNm0DPvcmG_nCbmwtBO9j6YBzM68ZanC7g01Skprhw5JoufbCK1nGzScVrgK3HSlrjNu6plNP03ZWuAbxABvYcOgcrHydSwHqGGsxzcjETdz_jfREN8sBQWtL2d4xGNW82kLvKueacnx5yN7incNARHL6xJm1Wgr2eGOfo6a3a-BUAf_Wk8ZvSMak_NuGcMJ4UZcmU8Vdq6lGH2YvZRPQ-Oelo1kedMw&sa=X&ved=2ahUKEwiokabri9mIAxWdXGwGHU_DDOkQtKgLegQIHBAB&biw=767&bih=735&dpr=1.25");
         //open a connection to the url
         URLConnection urlConnection=url.openConnection();
         //connect to url
         urlConnection.connect();
         // Get and print the content type
         System.out.println("content type:"+urlConnection.getContentType());

         // Get the data from the URL
         BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
         String line;
         while ((line = reader.readLine()) != null) {
             System.out.println(line); // Print the page content
         }
         reader.close();



     }
     catch (Exception e){
         System.out.println(e.getMessage());
     }
    }
}
