package networking;

import IOStream.Bufferreaderclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlClass {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://github.com/dheerajkr8287/PARALLAX-WEBSITE");
            System.out.println("protocol:"+url.getProtocol());
            System.out.println("Host:"+url.getHost());
            System.out.println("Path:"+url.getPath());
            System.out.println("Port:"+url.getPort());


            // Open a stream to read data from the URL


            BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));//openStream--Opens a connection to this URL and returns an InputStream for reading from that connection. This method is a shorthand for:
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
