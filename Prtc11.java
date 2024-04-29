public class Prtc11 {
    public static boolean checkPlandromeOfString(String string){
        int n=string.length();
        for(int i=0;i<=(n/2)+1;i++){
            if(string.charAt(i)!=string.charAt(n-1-i)){
                return false;
               
            }
            
        }
        

        
     return true;    

    }
    public static void main(String[] args) {
        String string="madam";
        System.out.println(checkPlandromeOfString(string));
        
        
    }
    
}