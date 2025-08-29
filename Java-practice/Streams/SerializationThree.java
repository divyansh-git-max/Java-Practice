import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}


public class SerializationThree {
    public static void main(String[] args) throws Exception{
        FileOutputStream fo = new FileOutputStream("data.txt");
        DataOutputStream d = new DataOutputStream(fo);
        
        Student s = new Student();
        
        s.rollNo = 10;
        s.name="Divyansh";
        s.dept="Data Science";
        
        d.writeInt(s.rollNo);
        d.writeUTF(s.name);
        d.writeUTF(s.dept);
        d.close();
        fo.close();
    }
}
