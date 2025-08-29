import java.io.*;

import javax.xml.stream.events.StartDocument;


class Student implements Serializable{
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;
    
    public Student(){ }
    
    public Student(int r, String n, float a, String d){
        this.rollNo=r;
        this.name=n;
        this.avg=a;
        this.dept=d;
        this.t=100;
    }
    
    public String toString(){
        return rollNo+" "+name+" "+avg+" "+dept+" "+t;
    }
    
}


public class SerializationSeven {
    public static void main(String[] args) throws Exception{
        FileInputStream fos = new FileInputStream("mydata.txt");
        ObjectInputStream os = new ObjectInputStream(fos);
        
        Student s = (Student) os.readObject();
        
        System.out.println(s);
        
        fos.close();
        os.close();
        
        
        
    }
}
