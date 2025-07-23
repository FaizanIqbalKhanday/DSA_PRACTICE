
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prtc46 {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        System.out.println(reverseOfNumbers(numList));
        
    }
    public static List<Integer>reverseOfNumbers(List<Integer> numList){ 
        Collections.reverse(numList);
        return numList;
    }

    
}
