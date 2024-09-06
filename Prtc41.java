public class Prtc41 {
    public static void checkPrimeNumber(int number){
        int flag=0;
        for(int i=2;i<=number/2;i++){
            if(number/i==0){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println(number+" is not prime");
        }
        else{
            System.out.println(number+" is prime");
        }
    }
    public static void main(String[] args) {
        checkPrimeNumber(12);
        
    }
    
}
