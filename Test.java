

public class Test {
  public static void alternativeString(String word1, String word2){
    if(word1.length()==word2.length()){
      for(int i=0;i<word1.length();i++){
        System.out.println(word1+""+word1);
      }
     }
     else if(word1.length()>word2.length()){
      int i;
      for( i=0;i<word2.length();i++){
        System.out.print(word1.charAt(i)+""+word2.charAt(i));
      }
      System.out.println(word1.substring(i, word1.length()));
     }
     else{
      int i;
      for( i=0;i<word1.length();i++){
        System.out.print(word1.charAt(i)+""+word2.charAt(i));
      }
      System.out.println(word2.substring(i, word2.length()));
     }
  }
    
    
    public static void main(String[] args) {
     String word1="ab";
     String word2="efghi";
     alternativeString(word1, word2);
        
    }
        
    }
     

