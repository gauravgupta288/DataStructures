package gg.Month02_Sep.Day034_060922;

import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        System.out.println(countItems(List.of(List.of("phone","blue","pixel"), List.of("computer","silver","lenovo")), "name", "pixel"));
    }

    static int countItems(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for(int i = 0;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) count++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) count++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) count++;
        }
        return count;
    }
}
