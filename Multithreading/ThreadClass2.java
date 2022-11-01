public class ThreadClass2 implements Runnable {
    //	override the run method
    public void run() {
        System.out.println("Thread activated");
    }
    // main method
    public static void main(String[] args) {
//		creating reference variable of runnable class
        Runnable r = new ThreadClass2();
//		creating object of thread class
        Thread obj = new Thread(r,"Rohit");
//		activate state thread by thread class object
        obj.start();
        String str = obj.getName();
        System.out.println(str);

    }

}

