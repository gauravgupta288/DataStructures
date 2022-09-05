package gg.Month02_Sep.Day033_059022;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        deleteColumns(new String[]{"zyx","wvu","tsr"});
    }

    static int deleteColumns(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) + 0 < strs[j-1].charAt(i) + 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
