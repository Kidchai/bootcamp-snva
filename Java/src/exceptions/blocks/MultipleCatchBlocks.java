package exceptions.blocks;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. It will cause an ArithmeticException");
        } catch (NumberFormatException e) {
            System.out.println("The string is not a valid number. It will cause a NumberFormatException");
        }
    }
}
