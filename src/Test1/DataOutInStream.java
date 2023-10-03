package Test1;

import java.io.*;

public class DataOutInStream {
    public static void main(String[] args) throws IOException {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Binary.bin"))){
            outputStream.writeChars("My names is Maksud and i am loosing my time, so that i have to work myself");


        }
       try(DataInputStream dis = new DataInputStream(new FileInputStream("Binary.bin"))){
           while (dis.available() > 0){
               char ch = dis.readChar();
               System.out.print(ch);
           }
       }
}
}