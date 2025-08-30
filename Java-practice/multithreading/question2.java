class Rider implements Cloneable{
    String name;
    int[] distances;
    public Rider(String n, int[] d){
        name=n;
        distances=d;
    }

    public Rider clone() throws CloneNotSupportedException{
        Rider clonedR = (Rider) super.clone(); // shallow copy
        clonedR.distances=this.distances.clone(); // deep copy
        return clonedR;
    }
}

public class question2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] d = {50,60,70};
        Rider r1 = new Rider("Raj", d);
        Rider r2 = (Rider) r1.clone();
        Rider r3 = r1;

        r2.distances[1]=90;
        r3.name="amit";

        System.out.println(r1.name + " "+r1.distances[1]);
        System.out.println(r2.name + " "+r2.distances[1]);
        System.out.println(r3.name + " "+r3.distances[1]);
    }
}
