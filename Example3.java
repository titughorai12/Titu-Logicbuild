public class Example3 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); 
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            //System.out.println("Error: Invalid number format!");
            System.out.println(e);
        }
    }
}
