package gg.Day1_040822;

public class BuddyString {
    public static void main(String[] args) {
        System.out.println(buddyString("abcd", "abcd"));
    }

    static boolean buddyString(String s, String goal) {
        int count = 0;
        int f1 = 0;
        boolean flag = false;
        int f2 = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {

                if (count == 0) {
                    f1 = i;
                }
                else if (count == 1) {
                    f2 = i;
                }else {
                    return false;
                }
                count++;
            }
            if (sb.toString().indexOf(s.charAt(i)) != -1) {
                flag = true;
            }
            sb.append(s.charAt(i));
        }
        if (count == 0 && !flag) {
            return false;
        }

        if (s.length() == 2) {
            char ch = sb.charAt(0);
            sb.setCharAt(0, sb.charAt(1));
            sb.setCharAt(1, ch);

            if (goal.equals(sb.toString())) return true;

            else return false;
        }

        char ch = s.charAt(f1);
        sb.setCharAt(f1, s.charAt(f2));
        sb.setCharAt(f2, ch);

        if (goal.equals(sb.toString())) return true;
        else return false;


    }
}
