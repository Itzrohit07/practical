public class ThreadClassEx implements Runnable{
    //	override run method
    public void run() {
        System.out.println("Thread activated");
    }
    // main method
    public static void main(String[] args) {
//		creating object instance of class
        ThreadClass e1 = new ThreadClass();
//		creating thread class object where invoke the parameter instance class object
        Thread t1 = new Thread(e1);
//		activate state of thread
        t1.start();

    }

}

