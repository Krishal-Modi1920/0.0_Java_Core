// Multithreading
// Threads are handled by CPU
// Threads are faster than process (Concurrently run multiple functions)
// Multithreading and Multiprocessing are used to achieve multitasking
// Thread are lightweight (easily run)


// Thread by extending Thread class
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<=10)
        {
            System.out.println("My thread is running");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=10)
        {
            System.out.println("Thread2 is running");
            System.out.println("I am Sad!");
            i++;
        }
    }
}

public class extend_thread {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
