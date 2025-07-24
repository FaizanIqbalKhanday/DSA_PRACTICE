public class Test2 {
    public static boolean  primeNumber(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return true;
            }
           
        }
        return false;
    }
    public static void primeInRange(int n){
        for(int i=2;i<=n; i++){
            if(primeNumber(i)==true){
                System.out.print(" "+i);
            }
        }

    }

    public static void main(String[] args) {
        
    primeInRange(5);
}
}
