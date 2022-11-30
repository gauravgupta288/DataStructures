package Month04_Nov.Day088_301122;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {
        System.out.println(chessBoardSquare("a3"));
    }

    static boolean chessBoardSquare(String coordinates){
        char ch[] = coordinates.toCharArray();

        if((ch[0] == 'a' || ch[0] == 'c' || ch[0] == 'e' || ch[0] == 'g')){
            if(ch[1] %2 == 0){
                return true;
            }else{
                return false;
            }

        }else{
            if(ch[1] %2 == 0){
                return false;
            }else{
                return true;
            }
        }

    }
}
