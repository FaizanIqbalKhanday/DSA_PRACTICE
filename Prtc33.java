import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prtc33 {
    public static void checkValidIpAddress(String ipAddress){
        String zeroTo255= "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        Pattern validIp=Pattern.compile(regex);
        Matcher m=validIp.matcher(ipAddress);

        if(m.matches()){
            System.out.println(ipAddress+ " is valid ip address");

        }
        else{
            System.out.println(ipAddress+" is not valid");
        }


    }
    public static void main(String[] args) {
        String ipAddress= "45.46.47.55";
        checkValidIpAddress(ipAddress);

    }
}
