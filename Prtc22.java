public class Prtc22 {
    public static void numberIntoWords(int number ,String[] words,int uNum){
        uNum=number%10;
        if(number==0){
            return;
        }
        numberIntoWords(number/10,words,uNum);
        System.out.print(words[uNum]+" ");




    }
    public static void main(String[] args) {
        String[] words ={"zero","one ","two ","three","four","five","six","seven","eight","nine"};
        numberIntoWords(1990,words,0);
        
    }
}
