package FilePac;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BuffersChanels{
    public static void main(String[] args) throws IOException {
        String text = new String("Maksud, I know that programming is important, but being leader is more important");
        try (RandomAccessFile file = new RandomAccessFile("/Users/maksudrustamov/Desktop/File.txt","rw");
             FileChannel channel = file.getChannel()
        ){
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int byteRead = channel.read(buffer);

            while (byteRead != -1){
                System.out.println((char)buffer.get());
            }

            buffer.clear();

            byteRead = channel.read(buffer);

        }


    }
}
