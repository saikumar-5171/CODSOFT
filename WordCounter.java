import java.io.*;
import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class WordCounter  
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int counter = 0;    
        FileReader file = new FileReader("file.txt");  
        BufferedReader br = new BufferedReader(file);   
        while((line = br.readLine()) != null) {  
            String words[] = line.split(" ");   
            counter = counter + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + counter);  
        br.close();  
    }  
}
