import java.io.*;



public class TaskSerialization {
    public static void main(String[] args) throws Exception{
        float f[] = {1.3f,0.7f,1.5f};
        FileOutputStream fos = new FileOutputStream("Mydata.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(3);
        for(float x:f){
            dos.writeFloat(x);
        }
        
        fos.close();
        dos.close();
        
    }
}
