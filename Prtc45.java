// reverse of a string using stack
import java.util.*;

public class Prtc45 {
    public static void reverseOfString(String string){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<string.length();i++){
            s.push(string.charAt(i));
        }
        StringBuilder stringBuilder=new StringBuilder("");
        while(!s.isEmpty()){
            char curr= s.pop();
            stringBuilder.append(curr);
        }
        System.out.println(stringBuilder);

    }
    public static void main(String[] args) {
        
        reverseOfString("abc");
    }
    
}
