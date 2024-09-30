public class Prtc42 {
    public static void passwordDecryption(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i + 1))) {
                result.append(s.charAt(i + 1));    
                result.append('*');      
                i++; 
            } 
            
            else if (Character.isDigit(s.charAt(i))) {
                digits.append(s.charAt(i)); 
                result.append('0');         
            } 
            
            else {
                result.append(s.charAt(i));
            }
        }

        
        result.insert(0, digits.toString());
        
        
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        passwordDecryption("fAizan3abc4"); 
    }
}
