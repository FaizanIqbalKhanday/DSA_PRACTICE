// Anagram
public class Prtc24 {
    public  static  boolean isAnagram(String a ,String b) {
        int[] frequency = new int[250];
        for (int i = 0; i < a.length(); i++) {
            frequency[Character.toLowerCase(a.charAt(i))]++;
        }
        for (int i = 0; i < b.length(); i++) {
            frequency[Character.toLowerCase(b.charAt(i))]--;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String a="faizan";
        String b="Nazkaf";
        boolean ret=isAnagram(a,b);
        System.out.println((ret)? "anagram": "not anagram");

    }
}
