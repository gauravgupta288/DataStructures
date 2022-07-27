package gg;

public class ReverseOnlyString {
    public static void main(String[] args) {
        reverse("Test1ng-Leet=code-Q!");
    }
    static void reverse(String s){
        int len = s.length();

        Character ch[] = new Character[len];
        String s1 = "";
        for(int i=0;i<len;i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                ch[i] = s.charAt(i);
            }else{
                s1+=s.charAt(i);
            }
        }

        int k=0;
        int m=s1.length()-1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==null){
               ch[i] = s1.charAt(m--);
            }
        }
    }
}
