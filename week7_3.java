import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

class readWrite{
    ReentrantLock lock = new ReentrantLock();
    ReentrantLock lock2=new ReentrantLock();
    
    void read(){

        lock.lock();
        try {
            Thread.sleep(1000);} catch (InterruptedException e) {}
        System.out.println("hi i am read, "+Thread.currentThread().getName()+" "+new Date());
        lock.unlock();  
    }

    void write(){
        lock2.lock();
        try {
            Thread.sleep(1000);} catch (InterruptedException e) {}
        System.out.println("hi i am write, "+Thread.currentThread().getName()+" "+new Date());
        lock2.unlock();
    }
}

public class week7_3 {
    public static void main(String[] args) {
        readWrite obj=new readWrite();

        Runnable r1=()->{obj.read();};
        Runnable r2=()->{obj.write();};

        Thread t0,t1,t2,t3;
        t0=new Thread(r1);
        t1=new Thread(r2);
        t2=new Thread(r1);
        t3=new Thread(r2);
        t0.start();t1.start();t2.start();t3.start();
    }   
}
