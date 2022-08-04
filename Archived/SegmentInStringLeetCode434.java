package gg.Archived;

public class SegmentInStringLeetCode434 {
    public static void main(String s[]){
        System.out.println(findSegment(" this is simple               "));
    }

    static int findSegment(String s){
        int count=0,word=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)== ' ' && s.charAt(i-1) !=' ' && s.charAt(i+1) !=' '){

                count++;
            }else if (s.charAt(i-1) !=' '){
                return word++;
            }
        }

        if (count!=0 && word==1 && count==0)return count+1;

        return count;
    }
}
