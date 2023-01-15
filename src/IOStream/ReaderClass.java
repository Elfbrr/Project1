package IOStream;

import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.io.FileNotFoundException;

public class ReaderClass {
    public static void main(String[] args) throws IOException {
        Reader readeFile=new FileReader("src/Homeworks/stream.data");
        int value= readeFile.read();
        System.out.println(value);
        System.out.println((char) value);
        String content= "";

        while(value != -1){
            content =content+(char)value;
            value= readeFile.read();
        }
        System.out.println(content);
        System.out.println("===============");
        System.out.println(content.toUpperCase());
    }
}
