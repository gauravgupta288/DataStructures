public class ShuffleString {
    public static void main(String[] args) {
System.out.println(shuffleString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    static String shuffleString(String str, int indices[]) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            sb.setCharAt(indices[i], str.charAt(i));
        }
        return sb.toString();
    }

}
