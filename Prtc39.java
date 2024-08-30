//tagContentExtractor
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prtc39 {
    public static void tagContentExtractor(String line){
        Pattern pattern=Pattern.compile("<(.+?)>([^<>]+)</\\1>");
        Matcher matcher=pattern.matcher(line);
        if(!(matcher.find())){
            System.out.println("none");
        }
        matcher = pattern.matcher(line);
            while(matcher.find()){
                String matchStr = matcher.group(2);
                Matcher matcher2 = pattern.matcher(matchStr);
                while(matcher2.find()){
                    matchStr = matcher2.group(2);
                    matcher2 = pattern.matcher(matchStr);
                }
                System.out.println(matchStr);
                }
            }
    public static void main(String[] args) {
        String line="<h1>faizan</h1>";
        tagContentExtractor(line);
        
    }
    
}
