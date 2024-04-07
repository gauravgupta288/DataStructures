package JavaConcepets;

public class ThreadConcept {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        });

        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 1000; i++){
                System.out.println(i);
            }
        });

//        Long stime = System.currentTimeMillis();
//        t.start();
//
//        t1.start();
//        Long etime = System.currentTimeMillis();
//
//        System.out.println("time : " +  (etime - stime));


    }
}
