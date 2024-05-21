package JavaConcepets;

public class reversestring {
    public static void main(String[] args) {
        String s = "a good   example";
        String str[] = s.split(" ");

        StringBuilder sb = new StringBuilder();


        for(int i = str.length - 1; i >=0; i--){
            if(str[i].length() > 0){
                sb.append(str[i].trim());
                sb.append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
