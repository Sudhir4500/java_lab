public class LabTenE {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=10; i++) {
                System.out.println("Thread1: " + i);
                try { Thread.sleep(2000); } 
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i=11; i<=20; i++) {
                System.out.println("Thread2: " + i);
                try { Thread.sleep(1000); } 
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        
        t1.start();
        t2.start();
        
        System.out.println("\nLab No.: 10e");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}