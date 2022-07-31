public class DefangingIpAddress {
    public static void main(String[] args) {
        System.out.println(defaningIpAddressSol1("255.100.50.0"));
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
}
