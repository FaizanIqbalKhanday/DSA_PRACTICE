public class Prtc28 {
    public static void towerOfHonai(int height,char source, char destination,char helper){
       if(height<=1){
           System.out.println("move "+source+" to "+ destination);
           return;
       }
       towerOfHonai(height-1 ,source,helper,destination);
        System.out.println("move "+source+" to "+ destination);
        towerOfHonai(height-1 ,helper,destination,source);



    }
    public static void main(String[] args) {
        int height=3;
        towerOfHonai(height,'A','B','C');

    }
}
