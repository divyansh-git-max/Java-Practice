import java.io.*;

class Student implements Serializable{
    int rollNo;
    String name;
    String dept;
    
    
    Student(){ } // Serialize only non-static memeber or non-transient
}



public class SerializationFive {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("mytext.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Student s = new Student();
        s.rollNo=13;
        s.name="divyansh";
        s.dept="CSE";
        
        oos.writeObject(s);
    }
}
