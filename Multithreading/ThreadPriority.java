
public class ThreadPriority extends Thread {
public void run(){
    for(int i=0;i< 5; i++){
       // using try catch block
        try{
            Thread.sleep(500);
        }
        catch (Exception e){
            System.out.println(e);

            System.out.println(i);
        }
    }
}

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        t2.setPriority(MAX_PRIORITY);// set thread priority
        System.out.println(t2.getPriority()); // getting thread priority
        System.out.println(Thread.currentThread().getPriority());// normal priority of thread
//		the start method moves the thread to the active state in a single time
        t1.start();
        t2.start();
        t3.start();
//		set the string
        t1.setName("Rohit");
        System.out.println(Thread.currentThread().getName());// getting current three
    }
}
