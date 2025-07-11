// Final class  
final class FinalClass {  
    // Final variable  
    final int MAX_VALUE = 100;  

    // Final method  
    final void showMax() {  
        System.out.println("Max value: " + MAX_VALUE);  
    }  
}  

public class LabThreeB {  
    public static void main(String[] args) {  
        System.out.println("Demonstrating final concepts:");  
        FinalClass obj = new FinalClass();  
        obj.showMax();  

        // Uncommenting below will cause error (final variable cannot be modified)  
        // obj.MAX_VALUE = 200;  

        // Printing lab info  
        System.out.println("\nLab No.: 3b");  
        System.out.println("Name: Sudhir Sharma");  
        System.out.println("Roll No./Section: 53/B");  
    }  
}  