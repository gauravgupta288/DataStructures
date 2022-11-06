package Month04_Nov.Day067_061122;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(stringCompression(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    static int stringCompression(char[] chars) {
            int index = 0;
            int len = chars.length;
            int indexCount = 0;


            while (index < len) {
                int count = 0;
                char curChar = chars[index];

                while (index < len && curChar == chars[index]){
                    index++;
                    count++;
                }
                chars[indexCount++] = curChar;

                if(count > 1){
                    for(char ch: Integer.toString(count).toCharArray()){
                        chars[indexCount++] = ch;
                    }
                }
            }

            return indexCount;
    }
}
