class WorkerThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("WorkerThread completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LabTenB {
    public static void main(String[] args) throws InterruptedException {
        WorkerThread t = new WorkerThread();
        System.out.println("Before start - isAlive: " + t.isAlive());
        t.start();
        System.out.println("After start - isAlive: " + t.isAlive());
        t.join();
        System.out.println("After join - isAlive: " + t.isAlive());
        
        System.out.println("\nLab No.: 10b");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}