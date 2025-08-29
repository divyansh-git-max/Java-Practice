import java.io.*;

public class FileHandlingOne{
    public static void main(String[] args) throws Exception{
        File f = new File("data");
        System.out.println(f.isDirectory());
        File fList[] = f.listFiles();
        
        for(File x:fList){
            System.out.println(x.getName());
            System.out.println(x.getAbsolutePath());
        }
        
    }
}
