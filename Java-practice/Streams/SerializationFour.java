import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class SerializationFour {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("data.txt");
        DataInputStream d = new DataInputStream(fis);
        
        Student s = new Student();
        s.rollNo = d.readInt();
        s.name = d.readUTF();
        s.dept = d.readUTF();
        System.out.println(s.rollNo+":"+s.name+":"+s.dept);
        d.close();
        fis.close();
    }
}
