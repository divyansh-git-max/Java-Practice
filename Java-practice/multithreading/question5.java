import java.util.*;
import java.util.stream.Collectors;



public class question5 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        for (int i=10;i<=30;i+=5){
            numbers.add(i);
        }
        Map<Boolean,List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println("True -> " + partitioned.get(true));
        System.out.println("false -> " + partitioned.get(false));
    }
}
