import java.io.*;


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


public class SerializationSix {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("mydata.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        
        Student s = new Student(12,"Divyansh",99.99f,"CSE");
        
        os.writeObject(s);
        
        fos.close();
        os.close();
        
        
    }
}
