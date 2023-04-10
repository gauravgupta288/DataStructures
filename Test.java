import java.util.HashMap;

class Test {
    public static void main(String[] args) {
        String str = "00111110101010111100000";

        String para = "this is a test it is a coding test";

        HashMap<String, Integer> map = new HashMap<>();

        String str1[] = para.split(" ");

        for(String s : str1){

            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(" occurences of each word " + map);

        int max = 0;
        int start = -1;
        int end = -1;
        for(int i = 0; i < str.length(); i++){
            int count = 0;

            while(i < str.length() &&  str.charAt(i) == '1'){
                    start = i;
                i++;
                count++;
            }
            if(count > max){
                end = i;
                max = count;
            }
        }

        System.out.println("max one " + max);
        System.out.println("start index "+ start);
        System.out.println("end = " + end);
    }
}
