package Month05_Dec.Day105_241222;

public class Test10 {

    public static void main(String str[]){
        String input= "H3L1omorn5ing5";

        for(char ch : input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                System.out.print(ch);
            }
        }

        int i = 0;
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        System.out.println();
        for(char ch : input.toCharArray()){
            if(Character.isDigit(ch)) {
                if (i < 2) {
                    sb.append(ch);
                } else {
                    sum += Integer.parseInt(String.valueOf(ch));
                }
                i++;
            }
        }

        System.out.println((Integer.parseInt(sb.toString()) + sum));
    }
}
