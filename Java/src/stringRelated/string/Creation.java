package stringRelated.string;

//String Pool in java is a pool of Strings stored in Java Heap Memory

public class Creation {
    public static void main (Creation[] args) {
        String str1 = "Hello"; // String literal, stores in the string pool
        String str2 = new String("World"); // String object, stores in the heap

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
    }
}
