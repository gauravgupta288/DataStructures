package Month10_May.Day190_280523;

public class FindRange {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1}, 1));
    }
    static int[] solve(int A[], int B){
        return new int[]{findFirstOccurence(A, B), findLastOccurence(A, B)};
    }
    static int findFirstOccurence(int A[], int B){
        int start = 0;
        int end = A.length - 1;

        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;

            if((mid == 0 || (A[mid] > A[mid - 1]) )&& A[mid] == B){
                return mid;
            }
            else if(A[mid] < B){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findLastOccurence(int A[], int B){
        int start = 0;
        int end = A.length - 1;

        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;

            if((mid == A.length - 1 || A[mid] < A[mid + 1]) && A[mid] == B){
                return mid;
            }
            else if(A[mid] > B){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
