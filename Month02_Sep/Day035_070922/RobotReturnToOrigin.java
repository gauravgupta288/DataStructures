package gg.Month02_Sep.Day035_070922;

public class RobotReturnToOrigin {
    public static void main(String[] args) {

    }

    static boolean robotReturnToOrigin(String moves){
        int m = 0;
        int n = 0;

        for(int i = 0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'L'){
                m++;
            }else if(ch == 'R'){
                m--;
            }else if(ch == 'U'){
                n++;
            }else if(ch == 'D'){
                n--;
            }
        }

        return m == 0 && n == 0;
    }
}
