class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public void incrementBlock() {
        synchronized(this) {
            count++;
        }
    }
    
    public int getCount() { return count; }
}

public class LabTenD {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });
        
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.incrementBlock();
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println("Final count: " + c.getCount());
        System.out.println("\nLab No.: 10d");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}