package stringRelated.tasks;

/*
Sunil is a little scientist. Sunil has planned to design a wildcard pattern matcher to exhibit at the "Young Inventors",
a tech talent show organized at his school. Sunil wanted to design the wildcard pattern matcher supporting the wildcard
character '?'. The wildcard character '?' can be substituted by any single lower case English letter for matching.
He has two strings X and Y of equal length, made up of lower case letters and the character '?'.
Sunil wants your help in designing the device, to know whether the strings X and Y can be matched or not.
Write a program to check whether the given strings can be matched or not.

Input Format:
First line of the input contains the string ‘X’.
Second line of the input contains the string ‘Y’.

Output Format:
Output a single line with the word "Yes"(without quotes) if the strings can be matched, otherwise output "No"(without quotes).
Refer sample input and output for formatting specifications.

Sample Input1:
s?or?
sco??
Sample Output1:
Yes

Sample Input2:
stor?
sco??
Sample Output2:
No

 */

import java.util.Scanner;

public class WildcardMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first line:");
        String a = scanner.nextLine();
        System.out.println("Enter the second line:");
        String b = scanner.nextLine();

        System.out.println(couldMatch(a, b));
    }

    static String couldMatch(String a, String b) {

        for (int i = 0; i < a.length(); i++) {
            if ( a.charAt(i) != b.charAt(i) &&
                 a.charAt(i) != '?' &&
                 b.charAt(i) != '?') {
                return "No";
            }
        }
        return "Yes";
    }
}
