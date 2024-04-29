public class Prtc17 {
    public static int prinrNumberInIncreasingOrder( int n){
        if(n==1){
            System.out.print(n+" ");
        return 1;
        }
        System.out.print(n+" ");
        return prinrNumberInIncreasingOrder(n-1);
    }
    public static void prinrNumberInDecreasingOrder(int n){
        
        if(n==1)
        {
            System.out.print(n+" ");
            return;
    
        }
        prinrNumberInDecreasingOrder(n-1);
        System.out.print(n+" ");
        
        
        
    }
    public static int factorialOfNumber(int n){
        if(n==1){
            
            return n;
        }
        return n*factorialOfNumber(n-1);
        
    }
    public static int sumOfNumbers(int n){
        if(n==1){
            
            return n;
        }
        return n+sumOfNumbers(n-1);
    }
    public static int febonachiSeries(int n){
        if(n==0 || n==1){
            return n;
        }
        int feb1=febonachiSeries(n-1);
        int feb2=febonachiSeries(n-2);
        return feb1+feb2;
       


        
    }
    public static void occuranceOfNumber(int[] array, int key, int i){
        if(i==array.length){
            return;
        }
        if(array[i]==key){
            System.out.print(i+" ");
        }
        occuranceOfNumber(array, key, i+1);

    }
    public static void numberIntoWords(int n,int p,String[] digits, String word){
        if(n==0){
            return;
        }
        p=n%10;
        numberIntoWords(n/10, p, digits, word);
        System.out.print(digits[p]+" ");
        
    }
    public static int lengthOfString(String string, int i){
        if(i==string.length()){
            return i;
        }
            return lengthOfString(string, i+1);

        

    }
    public static void towerOfHonai(int n, char from, char to,char aux){
        if(n==0){
            return;
        }
        towerOfHonai(n-1, from, aux, to);
        System.out.println("move disk "+from+ " to "+to);
        towerOfHonai(n-1, aux, to, from);
    }
    public static void printInd(int n){
        if(n==0){
            return;

        }
        System.out.print(n+" ");
        printInd(n-1);
        System.out.print(n+" ");
    }
    public static void puzzle(int n){
        if(n==0){
            return;
        }
        System.out.println("post " +n);
        puzzle(n-1);
        System.out.println("in " +n);
        puzzle(n-1);
        System.out.println("pre " +n);
    }

    public static void main(String[] args) {
        int n=5;
    //     String[] digts={"zero","one","two","three","four","five","six",
    // "seven","eight","nine"};
    //     String word="";
        // prinrNumberInIncreasingOrder(n);
        // System.out.println();
        // prinrNumberInDecreasingOrder(n);
        // System.out.println();
        //System.out.println(factorialOfNumber(n));
        // System.out.println(sumOfNumbers(n));
        //occuranceOfNumber(array, 2, 0);
       // numberIntoWords(1234, 0,digts, word);
       //towerOfHonai(2, 'A', 'C', 'B');
      // printInd(n);
      puzzle(n);

        
        
    }
    
}
