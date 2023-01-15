package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        try {
            String getEmployerDetailsQuery="select * from employee where employee salary> 15000";
            FileWriter fw = new FileWriter("src/Homeworks/data.data.sql");
            fw.write(getEmployerDetailsQuery);
            System.out.println("File writing is successful");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
