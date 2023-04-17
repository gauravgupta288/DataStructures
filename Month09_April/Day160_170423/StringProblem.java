package Month09_April.Day160_170423;

import java.util.HashMap;
import java.util.Map;

public class StringProblem {
    public static void main(String[] args) {
        String str = "I am one of the consultants abc";

        String[] strList = str.split(" ");

        for(int i = strList.length - 1; i >= 0; i -= 2){
            System.out.print(strList[i] + " ");
        }

        int startIndex = 0;
        if(strList.length  % 2 != 0){
            startIndex = 1;
        }
        for(int i = startIndex; i < strList.length; i += 2){
            System.out.print (strList[i] + " ");
        }

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "test1");
        map.put(2, "test2");
        String input = "testx2";

        for(int key : map.keySet()){
            String value = map.get(key);

            if(value.equals(input)){
                System.out.println("input found" + key);
                break;
            }else{
                System.out.println("iput not found" + input);
            }
        }
    }
}
