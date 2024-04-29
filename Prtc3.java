
public class Prtc3 {
    public static void reverseOfArray( int[] mainArray){
        for(int i =mainArray.length-1;i>=0;i--){
        System.out.print(" "+mainArray[i]);
        
    }
    System.out.println();

    }
    public static  void pairsOfArray(int[] mainArray){
        for(int i=0;i<=mainArray.length-1;i++){
            for(int j=i+1;j<=mainArray.length-1;j++){
                System.out.print("("+mainArray[i]+","+mainArray[j]+")"+" " );
            }
            System.out.println();   
        }
        
    }
   public static void main(String[] args) {
    int[] mainArray={1,12,23,34,45,56,67,78,89};
    // reverseOfArray(mainArray);
    pairsOfArray(mainArray);
    
   }
    
}
