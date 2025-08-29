import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}


public class SerializationTwo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("data.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student s = new Student();
        
        s.rollNo=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        
        System.out.println(s.name + " " + s.rollNo + " " + s.dept);
    }   
}
