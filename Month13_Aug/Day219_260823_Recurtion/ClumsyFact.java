package Month13_Aug.Day219_260823_Recurtion;

public class ClumsyFact {
    public static void main(String[] args) {
        System.out.println(clumsy(10));
    }

    public static  int clumsy(int n) {
        int sum = n;

        int k = n-1;
        for(int i = 0;i<n;i++){

            if(i%4 == 0){
                sum *= k;
            }else if(i%4 == 1){
                sum /= k;
            }else if(i%4==2){
                sum += k;
            }else{
                sum -= k;
            }
            k--;
            if(k == 0){
                break;
            }

        }

        return sum;
    }
}
