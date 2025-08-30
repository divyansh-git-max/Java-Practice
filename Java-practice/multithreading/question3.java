import java.util.*;
class GrindingMachine {
    String brand;
    String powerSource;
    public GrindingMachine(String b, String pS){
        this.brand=b;
        this.powerSource=pS;
    }
}

public class question3 {
    public static void main(String[] args) {
        var machineList = new ArrayList<GrindingMachine>();
        machineList.add(new GrindingMachine("Bajaj","Electrical"));
        machineList.add(new GrindingMachine("Hitachi",null));
        for(GrindingMachine obj: machineList){
            Optional<String> op1 = Optional.ofNullable(obj.powerSource);
            op1.ifPresent(source -> System.out.println(source));
        }
    }
}
