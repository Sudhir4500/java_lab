// Extending Thread class
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread (extended) is running");
    }
}

// Implementing Runnable
class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Thread (implemented) is running");
    }
}

public class LabTenA {
    public static void main(String[] args) {
        System.out.println("Thread Creation Demonstration:");
        
        // Method 1: Extending Thread
        MyThread1 t1 = new MyThread1();
        t1.start();
        
        // Method 2: Implementing Runnable
        Thread t2 = new Thread(new MyThread2());
        t2.start();
        
        System.out.println("\nLab No.: 10a");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}