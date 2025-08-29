import java.io.*;

class StreamOne{
    public static void main(String[] args) throws Exception {
       RandomAccessFile rf = new RandomAccessFile("data.txt", "rw");
       System.out.println((char)rf.read());
       System.out.println((char)rf.read());
       System.out.println((char)rf.read());
       rf.write('L');
       System.out.println((char)rf.read());
       rf.skipBytes(3);
       System.out.println((char)rf.read());
       rf.seek(3);
       System.out.println((char)rf.read());
       System.out.println((char)rf.read());
       System.out.println(rf.getFilePointer());
       
    }
}