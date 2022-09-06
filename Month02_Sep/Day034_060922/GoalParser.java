package gg.Month02_Sep.Day034_060922;

public class GoalParser {
    public static void main(String[] args) {
        System.out.println(goalParser("G()()()()(al)"));
    }

    static String goalParser(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='G'){
                sb.append('G');
            } else if (command.charAt(i)=='(') {
                sb.append('o'); i = i+1;
            } else{
                sb.append("al");i = i+3;
            }
        }
        return sb.toString();
    }


}
