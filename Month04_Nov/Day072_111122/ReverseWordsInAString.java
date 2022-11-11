package Month04_Nov.Day072_111122;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverse("a good   example"));
    }

    static String reverse(String s){
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();


        for(int i = list.length-1; i>=0;i--){
            if(list[i].equals(" ") || list[i].equals("")){
                continue;

            }else{
                sb.append(list[i].trim());
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
