//push at bottom of the stack
import java.util.Stack;

public class Prtc40 {
    public static void pushAtBottomOfTheStack(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottomOfTheStack(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottomOfTheStack(s, 4);
        System.out.println(s);
        }
    
}
