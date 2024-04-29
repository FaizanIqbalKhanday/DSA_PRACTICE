public class Prtc13 {
    public static void makeFirstLetterUpperCase(String string){
        StringBuilder sb=new StringBuilder("");
        
        char ch=Character.toUpperCase(string.charAt(0));
        sb.append(ch);
        for(int i=1;i<string.length();i++){
            if(string.charAt(i)==' '){
                sb.append(string.charAt(i));
                i++;
                sb.append(Character.toUpperCase(string.charAt(i)));
             
            }
            else{
                sb.append(string.charAt(i));
            }
            
        }
        System.out.println(sb);
    }
    public static void compress(String string){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<string.length();i++){
            Integer count=1;
            while (i<string.length()-1 && string.charAt(i)==string.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(string.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String string="my name is faizan iqbal";
        String str="aaabbccc";
        makeFirstLetterUpperCase(string);
        compress(str);
    }
    
}
