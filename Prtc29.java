// subsets
public class Prtc29 {
    public static void subSets(String str ,String ans, int index){
         if(index==str.length()){
             System.out.println(ans);
             return;
         }
         subSets(str, ans+str.charAt(index),index+1);
        subSets(str, ans,index+1);

    }
    public static void main(String[] args) {
        String str="abc";
        subSets(str,"",0);

    }
}
