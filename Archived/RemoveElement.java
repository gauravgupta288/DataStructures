package gg.Archived;

public class RemoveElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int nums[] = {0, 1,2,3,4};
        System.out.println(removeDuplicate(nums));
    }

    static int removeDuplicate(int arr[]) {
        int end = arr.length - 1;
        int id = 1;
        for (int i = 1; i < end; ++i) {
			if(arr[i] != arr[i-1]){
				arr[id++] = arr[i];
			}
        }

        return id;
    }
}
