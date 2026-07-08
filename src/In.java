

public class In {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <=1000; i++) {
                System.out.println(i);
            }
        }); //0-10
        Thread t2 = new Thread( ()-> {
            for (int i = 1100; i <=2000; i++) {
                System.out.println(i);
            }
        });; //11-20

        t1.start();
        t1.sleep(100);
        t2.start();




    }
}
