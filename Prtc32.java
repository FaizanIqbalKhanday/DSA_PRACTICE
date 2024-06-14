//pair sum
import java.util.ArrayList;

public class Prtc32 {
    public static void pairSum(ArrayList<Integer> list, int target){
        int leftpointer=0, rightPointer=list.size()-1;
        while(leftpointer<rightPointer){
            if(list.get(leftpointer)+list.get(rightPointer)==target){
                System.out.println("("+list.get(leftpointer)+","+list.get(rightPointer)+")");
                rightPointer--;
                leftpointer++;
            }
             else if(list.get(leftpointer)+list.get(rightPointer)>target){
                rightPointer--;
            }
            else{
                leftpointer++;
            }

        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       int target=5;
       pairSum(list,target);

    }
}
