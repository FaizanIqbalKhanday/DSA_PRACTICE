// frequency of a number
import java.util.ArrayList;
public class Prtc36 {
    public static void frequenncyOfNumber(ArrayList<Integer> list, int key){
        int count =0;
        int index=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                count+=1;
                index=i;
            }
        }
        System.out.println("frequency of "+list.get(index)+" is "+count);

    }
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);



    }
}
