public class RemoveOneElement {
    public static void main(String[] args) {
        int[] arr = {89,384,691,680,111,756};

        System.out.println(removeone(arr));
    }

    static boolean removeone(int[] arr) {

        int i = 1;
        int count = 0;

        while (i < arr.length) {
            if(i== arr.length-1)return true;

            if (arr[i - 1] < arr[i]) {
                i++;
            } else if (arr[i - 1] > arr[i]) {
                if (count == 1) {
                    return false;
                }
                if (i == 1 ) {
                    if(arr[i] < arr[i + 1]){
                        i++;
                        count++;
                    }else{
                        return false;
                    }

                } else if (arr[i - 1] < arr[i+1] || arr[i - 2] < arr[i]) {
                    i++;
                    count++;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

}