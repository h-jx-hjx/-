import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDome1 {
    public static void main(String[] args) {
        Print print =new Print ();
        Thread01 thread01=new Thread01 (print);
        Thread02 thread02=new Thread02 (print);
        Thread03 thread03=new Thread03 (print);
        thread01.start ();
        new Thread (thread02).start ();
        FutureTask<String> futureTask=new FutureTask<String> (thread03);
        new Thread (futureTask).start ();
    }
}
class Thread01 extends Thread{

    Print print;

    public Thread01(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        int count=0;
        for (int i = 0; i < 120; i++) {
            if(count<=240||count>=0){
                count++;
                print.printNumber1 (count);
            }

        }

    }
}
class Thread02 implements Runnable{
    Print print;

    public Thread02(Print print) {
        this.print = print;
    }
    @Override
    public void run()
        {
            int count=0;
            for (int i = 0; i < 120; i++) {
                if(count<=120||count>=0){
                    count++;
                    print.twoorthree (count);
                }

            }
        }


}
class Thread03 implements Callable<String>{
    Print print;

    public Thread03(Print print) {
        this.print = print;
    }

    @Override
    public String call() throws Exception {
        int count=0;
        for (int i = 0; i < 120; i++) {
            if(count<=120||count>=0){
                count++;
                print.twoorthree (count);
            }}

        return null;
    }
}
class Print{
    boolean flag =false;
    public synchronized void printNumber1(int count){
        if (flag){
            try {
                this.wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        System.out.println ("线程1打印："+count);
        notify ();
        this.flag=!this.flag;

    }
    public synchronized void twoorthree(int count){
        if (!flag){
            try {
                this.wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        printNumber2 (count);
        printNumber3 (count);
        notify ();
        this.flag=!this.flag;
    }
    public synchronized void printNumber2(int count){
        if (!flag){
            try {
                this.wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        System.out.println ("线程2打印："+count);
        notify ();
        this.flag=!this.flag;

    }
    public synchronized void printNumber3(int count){
        if (flag){
            try {
                this.wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        System.out.println ("线程3打印："+count);
        notify ();
        this.flag=!this.flag;

    }
}