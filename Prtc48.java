public class Prtc48 {
    public static void binaryToDecimal(int n){
        int lastDigit=0;
        double decimal=0;
        int power =0;
        while (n >0) {
             lastDigit=n%10;
            decimal =decimal+lastDigit*Math.pow(2, power);
            power+=1;
            n=n/10;
            
        }
        System.err.println(decimal);

    }
    public static void decimalToBinary(int n){
        int binary=0;
        while (n>0) {
            binary=n%2;
            System.out.print(binary);
            n=n/2;

            
        }

    }
    
    public static void main(String[] args) {
        binaryToDecimal(101);
        decimalToBinary(5);
        
    }
}
