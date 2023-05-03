package stringRelated.tasks;
/*
Caption Contest is a competition open to all writers worldwide. The entrants will have one day to compose and submit
a caption that will be based on the theme posted on the competition page.

Robin, a creative writer had penned two captions for the contest, but he unknowingly misplaced them. After searching long,
he managed to locate his captions, but some letters in them have become unreadable. The captions were in two very old
sheets of paper, each of which originally contained a string of lowercase English letters. The strings on both the
sheets have equal lengths.

Robin would like to estimate the difference between these strings. Let's assume that the first string is named S1,
and the second S2. The unreadable symbols are specified with the question mark symbol '?'. The difference between the
strings equals to the number of positions i, such that S1i is not equal to S2i, where S1i and S2i denote the symbol at
the i th position in S1 and S2, respectively.

Robin would like to know the minimal and the maximal difference between the two strings, if he changes all unreadable
symbols to lowercase English letters. Robin needs your help solving this problem!

Input Format:
The first line of the input contains a string S1.
The second line of the input contains a string S2.
Both strings consist of lowercase English letters and question marks in places where the symbols are unreadable.

Output Format:
Output the minimal and the maximal difference between two given strings separated with a single space.
Refer sample input and output for formatting specifications.

Sample Input1:
a?c
??b

Sample Output1:
1 3

Sample Input2:
???a
???a

Sample Output2:
0 3
 */

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first line:");
        String a = scanner.nextLine();
        System.out.println("Enter the second line:");
        String b = scanner.nextLine();

        findDifference(a, b);
    }

    static void findDifference(String a, String b) {
        int minDif = 0;
        int maxDif = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '?' || b.charAt(i) == '?') {
                maxDif++;
            } else if (a.charAt(i) != b.charAt(i)) {
                minDif++;
                maxDif++;
            }
        }
        System.out.printf("%d %d\n", minDif, maxDif);
    }
}
