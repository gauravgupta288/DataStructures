public class DefangingIpAddress {
    public static void main(String[] args) {
        System.out.println(defaningIpAddressSol2("255.100.50.0"));
    }

    static String defaningIpAddressSol1(String ipAddress) {
        String str = "";
        for (int i = 0; i < ipAddress.length(); i++) {
            if (ipAddress.charAt(i) == '.') {
                str += "[.]";
            } else {
                str += ipAddress.charAt(i);
            }
        }


        return str;
    }

    static String defaningIpAddressSol2(String ipAddress) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ipAddress.length();i++){
            if(ipAddress.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(ipAddress.charAt(i));
            }
        }return sb.toString();
    }


}
