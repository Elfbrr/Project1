package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("src/Homeworks/stream.data");
        InputStreamReader isr= new InputStreamReader(fis);
        System.out.println((char)isr.read());

        InputStreamReader isr2=new InputStreamReader(fis, StandardCharsets.UTF_16);

        System.out.println((char)isr2.read());

    }
}
