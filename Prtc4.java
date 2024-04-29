public class Prtc4 {
    public static void subArrays(int[] array){
        int max=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<=array.length-1;i++){
            for(int j=i;j<=array.length-1;j++){
                currentSum=currentSum+array[j];
                if(currentSum>max){
                    max=currentSum;
                }
                System.out.println(currentSum);

            }
            currentSum=0;
            
        }
        System.out.println(max);
        

    }
        
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
       subArrays(array);
       
        
    }
    
}
