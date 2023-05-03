package stringRelated.string;

/*
Strings are immutable. It means string object cannot be altered, but the reference to the object can be changed.
Every time we make a modification, a new instance of that string is created
and the previous value is copied to the new String with the change.
 */

public class Immutable {
    public static void main(String[] args) {
        String s1 = "Hello"; // String literal
        String s2 = "Hello"; // String literal
        String s3 = s1; // same reference

        //Changing the value of s1
        s1 = "Java";

        //Updating with concat() operation
        s2.concat(" World");

        //The concatenated String will be created as a new instance and an object should refer
        // to that instance to get the concatenated value.
        String newS3 = s3.concat(" Scaler");

        System.out.println("s1 refers to " + s1);
        System.out.println("s2 refers to " + s2);
        System.out.println("s3 refers to " + s3);
        System.out.println("newS3 refers to " + newS3);
    }
}
