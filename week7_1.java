public class week7_1 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            long start=System.nanoTime();
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello  " + Thread.currentThread().getName());
            }
            System.out.println(Thread.currentThread().getName()+", "+(System.nanoTime()-start));
        };
        Thread t0,t1;
        t0=new Thread(runnable);
        t1=new Thread(runnable);
        t0.setPriority(10);
        t1.setPriority(1);
        t0.setName("t0");
        t1.setName("t1");
        
        t0.start();
        t1.start();
}
}