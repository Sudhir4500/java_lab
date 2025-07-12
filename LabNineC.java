public class LabNineC {
    public static void main(String[] args) {
        try {
            try {
                int x = 10 / 0;
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division error");
            }
            
            String s = null;
            System.out.println(s.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Outer catch: Null reference");
        }

        System.out.println("\nLab No.: 9c");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}