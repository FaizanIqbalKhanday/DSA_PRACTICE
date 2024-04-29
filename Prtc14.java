public class Prtc14 {
    public static void aramstrongNumbe(int number){
        int j=0,sum=0;

        for(int i=number;i>0;i=i/10){
            j=i%10;
            sum=sum+(j*j*j);
        }
        if(sum==number){
            System.out.println(number+" is aramstrong number");
        }
        else{
            System.out.println(number+" is not aramstrong number");
        }

    }
    public static void main(String[] args) {
        int number=153;
        aramstrongNumbe(number);
        
    }
}
