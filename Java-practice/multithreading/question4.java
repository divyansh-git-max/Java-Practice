import java.io.*;
class Laptop implements Serializable{
    private double price;
    private transient String model;
    private transient int serialNum;

    Laptop(){ }
    Laptop(double p, String m, int sN){
        this.price=p;
        this.model=m;
        this.serialNum=sN;
    }
    public String toString(){
        return price + " " + model + " " + serialNum;
    }

    private void writeObject(ObjectOutputStream out) throws Exception{
        out.defaultWriteObject(); // write non-transient
        out.writeInt(serialNum+100);// write custom
    }

    private void readObject(ObjectInputStream in) throws Exception{
        in.defaultReadObject();
        serialNum = in.readInt() - 100;
    }

}


public class question4 {
    public static void main(String[] args) throws Exception{
        var fos = new FileOutputStream("Laptop.txt");
        var oos = new ObjectOutputStream(fos);
        Laptop l1 = new Laptop(900, "Dell", 123);
        oos.writeObject(l1);

        var fis = new FileInputStream("Laptop.txt");
        var is = new ObjectInputStream(fis);

        Laptop obj = (Laptop) is.readObject();
        System.out.println(obj);
    }
}
