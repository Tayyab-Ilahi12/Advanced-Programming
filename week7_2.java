
class bankAccount{
    int balance=0;
    synchronized void deposit(){
        for (int i = 0; i < 10; i++) {
            balance++;
            System.out.println("balance : "+balance+"Thread "+Thread.currentThread().getName());
        }
    }
    synchronized void withDraw(){
        for (int i = 0; i < 10; i++) {
            balance--;
            System.out.println("balance : "+balance+" Thread "+Thread.currentThread().getName());
        }
    }

}
public class week7_2 {
    public static void main(String[] args) {
        bankAccount bAccount=new bankAccount();
        Thread thread1=new Thread(){
            @Override
            public void run() {
                bAccount.deposit();
            }
        };
        
        Thread thread2=new Thread(){
            @Override
            public void run() {
                bAccount.withDraw();
            }
        };

        thread1.start();
        thread2.start();
        
    }
}
