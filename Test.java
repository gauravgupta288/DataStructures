public class Test {
    public static void main(String[] args) {
        String str = "india";

        for(int i = 0 ; i < str.length(); i++){
            char ch1 = str.charAt(i);
            boolean flag = false;
            for(int j = 0; j < str.length(); j++){
                char ch2 = str.charAt(j);

                if(ch1 == ch2 && i != j){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.println(ch1);
                break;
            }
        }

//        HashMap<Character, Integer> map = new LinkedHashMap<>();
//
//       for(int i = 0; i < str.length(); i++){
//           map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//       }
//
//       for(char ch : map.keySet()){
//           if(map.get(ch) == 1){
//               System.out.println(ch);
//               break;
//           }
//       }

    }
}
