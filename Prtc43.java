public class Prtc43 {
    public static void sumOfArrayelements(int[] elements,int startIndex, int endIntex){
        int sum =0;
        for(int i=startIndex;i<=endIntex;i++){
            if(elements[i]==0){
                elements[i]=10;
                
            }
            sum=sum+elements[i];
            System.out.println(elements[i]);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
       int[] elements={40, 50 ,0,20};
       sumOfArrayelements(elements, 0, 3);       
    }
    
}
