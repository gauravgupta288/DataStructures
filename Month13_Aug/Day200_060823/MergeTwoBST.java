package Month13_Aug.Day200_060823;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBST {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        int i = 0;
        int j = 0;

        while(i < list1.size() && j < list2.size()){
            int x = list1.get(i);
            int y = list2.get(j);
            if(x < y){
                list3.add(x);
                i++;
            }else{
                list3.add(y);
                j++;
            }
        }

        while(i < list1.size()){
            int x = list1.get(i);
            list3.add(x);
            i++;
        }

        while(j < list2.size()){
            int x = list2.get(j);
            list3.add(x);
            j++;
        }

        return list3;

    }
}
