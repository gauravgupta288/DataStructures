package Month13_Aug.Day220_270823;

public class MaximumFar {
    public static void main(String[] args) {
        System.out.println(solve("L_RL__R"));
    }

    static int solve(String moves){
        int count = 0;

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'L'){
                c1++;
            }else if(ch == 'R'){
                c2++;
            }else{
                c3++;
            }
        }

        return Math.abs(Math.max(c1, c2) - Math.min(c1, c2) + c3);
    }
}
