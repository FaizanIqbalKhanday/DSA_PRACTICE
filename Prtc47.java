// bionomial coefficient

public class Prtc47 {
   
    public static int factorial(int n){
        int factorial=n;
        for(int i=n-1;i>=1;i--){
        factorial=factorial*i;
    } 
        return factorial;
    }
    public static int binomialCoefficient(int n, int r){
         int coefficient =factorial(n)/(factorial(r)*factorial(n-r));
         return coefficient;
    }
    public static void main(String[] args) {
       int coefficient= binomialCoefficient(10, 2);
       System.out.println(coefficient);
        
    }
    
    
}
