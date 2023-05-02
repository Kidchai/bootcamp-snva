package exceptions.unchecked;

public class IndexOutOfBoundsExceptionDemo {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};

            try {
                System.out.println(numbers[3]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The index is out of bounds. It will cause an IndexOutOfBoundsException");
            }
        }
}
