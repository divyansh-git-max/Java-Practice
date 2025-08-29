import java.io.*;

class Customer implements Serializable{
    String cusID;
    String name;
    String phone;
    static int count=0;
    
    Customer(){ }

    Customer(String n,String p){
        this.cusID="C"+count;
        count++;
        this.name=n;
        this.phone=p;
    }
    
    public String toString(){
        return this.cusID+" "+this.name+" "+this.phone;
    }
}

public class CustomerSerialization {
    public static void main(String[] args) throws Exception{
        // Customer cList[] = {new Customer("Smith","12345"), new Customer("John","5678910"), new Customer("Cena","14628756")};
        // FileOutputStream fos = new FileOutputStream("Customer.txt");
        // ObjectOutputStream os = new ObjectOutputStream(fos);
        
        // os.writeInt(cList.length);
        // for(Customer x:cList){
        //     os.writeObject(x);
        // }
        // fos.close();
        // os.close();
        
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        int length = ois.readInt();
        Customer clist[] = new Customer[length];
        for(int i=0;i<length;i++){
            clist[i] = (Customer) ois.readObject(); 
        }
        
        for(int i=0;i<length;i++){
            System.out.println(clist[i]);
        }
        
    }
}
