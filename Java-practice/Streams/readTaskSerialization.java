import java.io.*;



public class readTaskSerialization {
    public static void main(String[] args) throws Exception{
        // float f[] = {1.3f,0.7f,1.5f};
        FileInputStream fos = new FileInputStream("Mydata.txt");
        DataInputStream dos = new DataInputStream(fos);
        int x = dos.readInt();
        for (int i=0;i<x;i++){
            System.out.println(dos.readFloat());
        }
        fos.close();
        dos.close();
        
    }
}
