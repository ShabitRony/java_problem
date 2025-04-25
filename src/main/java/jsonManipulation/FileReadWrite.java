package jsonManipulation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
//        FileWriter writer = new FileWriter("test.txt",true);
//        writer.write("\nHello Java");
//        writer.close();
        FileReader fileReader = new FileReader("test.txt");
        int character;
        while((character = fileReader.read())!=-1){
        System.out.print((char)character);
         }
        fileReader.close();
    }
}
