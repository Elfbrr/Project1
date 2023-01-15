package IOStream;

import java.io.*;
import java.util.Arrays;

public class InputStreamClass {

    public static void main(String[] args) {
        readFile("src/Homeworks/data.txt");
    }
    public static void readFile (String filePath){
        //reading a file
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(new File(filePath));

        String content = "";
          int i;
          while((i=fileInputStream.read()) !=-1){
              content=content+(char)+i;
          }
           String [] array=content.split(" ");

        System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
