package SingletonDP;

public class DatabaseConnection {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();


        Database dc = Database.getInstance();
        Database dc1 = Database.getInstance();
    }


}


