import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class SerializationOne {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("data.txt");
        PrintStream ps = new PrintStream(fos);
        
        Student s = new Student();
        
        s.rollNo=10;
        s.name="divyansh";
        s.dept="CSE";
        
        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();
    }

}
