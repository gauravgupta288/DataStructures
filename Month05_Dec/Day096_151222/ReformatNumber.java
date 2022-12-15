package Month05_Dec.Day096_151222;

public class ReformatNumber {
    public static void main(String[] args) {

    }

    static String format(String number) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();

        int i = 1;
        for (char ch : number.toCharArray()) {
            if (ch != ' ' || ch != '-') {
                sb.append(ch);
            }
        }

        int lastIndex = 0;
        int rem = sb.length() % 3;
        int qou = sb.length() / 3;
        if (rem == 0) {
            lastIndex = 0;
        } else if (rem == 2) {
            lastIndex = 2;
        } else {
            lastIndex = 4;
        }
        int k = 0;
        for (char ch : sb.toString().toCharArray()) {
            if (qou == 0) {
                if (rem == 2 || rem == 0) {
                    return number;
                }
            } else if (qou == 1 && rem == 1) {
                res.append(sb.toString().charAt(0));
                res.append(sb.toString().charAt(1));
                res.append("-");
                res.append(sb.toString().charAt(2));
                res.append(sb.toString().charAt(3));
                return res.toString();
            } else {
                if (k == 3) {
                    res.append("-");
                }
                res.append(ch);
                k++;
            }
        }

        return "";

    }
}
