package stringRelated.string;

public class Comparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("== compares the references");
        // true, two variables point to the same String literal
        System.out.printf("str1 == str2 is %b\n", str1 == str2);

        // false, str1 is created with a literal and str3 is created using the new operator, so they reference different objects
        System.out.printf("str1 == str3 is %b\n", str1 == str3);

        System.out.println("=====================================");
        System.out.println("equals() compares two Strings character by character, ignoring their address");
        System.out.printf("str1.equals(str2) is %b\n", str1.equals(str2)); //true
        System.out.printf("str1.equals(str3) is %b\n", str1.equals(str3)); //true

        System.out.println("=====================================");
        System.out.println("compareTo() compares two Strings character by character lexicographically");
        /*returns 0 if two Strings are equal,
        a negative number if the first String comes before the argument,
        and a number greater than zero if the first String comes after the argument String.
        */
        String author = "author";
        String book = "book";
        String duplicateBook = "book";

        System.out.printf("author.compareTo(book) is %d\n", author.compareTo(book)); //-1
        System.out.printf("book.compareTo(author) is %d\n", book.compareTo(author)); // 1
        System.out.printf("duplicateBook.compareTo(book) is %d\n", duplicateBook.compareTo(book)); //0
    }
}
