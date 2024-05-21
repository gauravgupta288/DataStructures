//package JavaConcepets;
//
//import java.util.concurrent.ConcurrentLinkedQueue;
//
//public class leetcode {
//    public static void main(String[] args) {
//        String word = "aaAbcBC";
//        int small[] = new int[26];
//        int big[] = new int[26];
//
//        ConcurrentLinkedQueue q = new ConcurrentLinkedQueue();
//        int ans = 0;
//        for(int i = 0; i < word.length(); i++){
//
//            char ch = word.charAt(i);
//
//            if(ch >= 'a' && ch <= 'z'){
////                small[ch - 'a']++;
////
////                int ch1 = word.substring(i+1).indexOf(Character.isLowerCase(ch));
////                String temp = word.substring(i+1);
////                int ch2 = temp.substring(ch1 + 1).indexOf(ch);
////                if(ch1 != -1 && ch2 == -1){
////                    big[Character.toUpperCase(ch) - 'A']++;
////                }
////            }
//        }
//
////        for(int i = 0; i < 26;i++){
////            if(small[i] >= 1 && big[i] >= 1){
////                ans++;
////            }
////        }
//        System.out.println(ans);
//    }
//}
