public class Prtc16 {
    public static int getIthBit(int n, int a){
        int b=n>>a;
        int k=1;
        if((b&k)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit( int n, int i){
        int bitMask=1<<i;
        return n| ~bitMask;

    }
    public static int clearIthBit( int n, int i){
        int bitMask=1<<i;
        return n& bitMask;

    }
    public static void main(String[] args) {
     
       System.out.println(clearIthBit(10, 2));
   
       }
}
