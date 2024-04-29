import java.util.Arrays;

public class Prtc15 {
    public static void countNumnerOfVowels(String string){
       int count=0;
       for(int i=0;i<=string.length()-1;i++){
        if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||string.charAt(i)=='o' ||string.charAt(i)=='u'){
            count+=1;
        }
       }
       System.out.println(count);
    }
    public static void anargmsOfString(String string ,String string3){
       char[] newString=string.toCharArray();
       char[] newString3=string3.toCharArray();
       Arrays.sort(newString);
       Arrays.sort(newString3);
       if(Arrays.equals(newString,newString3)){
        System.out.println(string+" and "+string3+" are not anagrams strings with each other ");
       }
       else{
        System.out.println(string+" and "+string3+" are not anagrams strings with each other");
       }
    }
    public static void main(String[] args) {
        String string="faizan";
        String string2="faizan1".replace('a', 'b');
        String string3="naziaf";
        System.out.println(string.equals(string2)+" "+string2.equals(string3));
        countNumnerOfVowels(string);
        System.out.println(string2);
        anargmsOfString(string, string3);
        
    }
    
}
