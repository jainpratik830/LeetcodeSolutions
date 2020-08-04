import java.util.Arrays;

public class Validate_IP_Address {

    public static boolean checktTrailingZeros(String a){
        int x=a.length();
        switch (x){
            case 1:
                return false;

            case 2:
                if (a.charAt(0)=='0' || a.equals("00")){
                    return true;
                }else {
                    return false;
                }

            case 3:
                if (a.charAt(0)=='0' || a.substring(0,2).equals("00") || a.equals("000"))
                    return true;
                else
                    return false;

            case 4:
                if (a.equals("0000")){
                    return false;
                }
                if (a.charAt(0)=='0' || a.substring(0,2).equals("00") || a.substring(0,3).equals("000") ){
                    return true;
                }
                return false;


        }
        return false;

    }

    public static String validIPAddress(String IP) {
        if(IP.contains(".")) {
            String[] codes = IP.split("\\.");
            if (IP.chars().filter(ch -> ch == '.').count() != 3){
                return ("Neither");
            }
            if (codes.length!=4){
                return ("Neither");
            }
            for (int i=0;i<4;i++){
                if (codes[i].length() == 0 ||codes[i].length() > 3) return "Neither";
                for (char ch : codes[i].toCharArray()) {
                    if (! Character.isDigit(ch)) return "Neither";
                }
                if (checktTrailingZeros(codes[i]) || Integer.parseInt(codes[i])>255){
                    return ("Neither");
                }
            }
            return "IPv4";

        }else if   (IP.contains(":")) {
            String hex= "0123456789abcdefABCDEF";
            if (IP.chars().filter(ch -> ch == ':').count() != 7){
                return ("Neither");
            }
            String[] codes = IP.split("\\:");
            // System.out.println(Arrays.toString(codes));
            if (codes.length!=8){
                return ("Neither");
            }
            for (int i=0;i<8;i++){
                if (codes[i].length()>4|| codes[i].length()==0){
                    return ("Neither");
                }
                for (char b: codes[i].toCharArray()){
                    if (hex.indexOf(b)==-1){
                        return ("Neither");
                    }
                }
            }
            return "IPv6";
        }
        return ("Neither");
    }

    public static void main(String[] args) {

        String IP="2001:0db8:85a3::8A2E:0370:7334";
        System.out.println(validIPAddress(IP));

    }

}
