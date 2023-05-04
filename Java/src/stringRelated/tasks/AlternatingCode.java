package stringRelated.tasks;

/*
It is IPL Season and the first league match of Dhilip’s favorite team, "Chennai Super Kings". The CSK team is playing at
the IPL after 2 years and like all Dhoni lovers, Dhilip is also eagerly awaiting to see Dhoni back in action.

After waiting in long queues, Dhilip succeeded in getting the tickets for the big match. On the ticket, there is a
letter-code that can be represented as a string of upper-case Latin letters.

Dhilip believes that the CSK Team will win the match in case exactly two different letters in the code alternate.
Otherwise, he believes that the team might lose. Please see note section for formal definition of alternating code.

You are given a ticket code. Please determine, whether CSK Team will win the match or not based on Dhilip’sconviction.
Print "Yes" or "No" (without quotes) corresponding to the situation.

Note:
Two letters x, y where x != y are said to be alternating in a code, if code is of form "xyxyxy...".

Input Format:
First and only line of the input contains a string S denoting the letter code on the ticket.

Output Format:
Output a single line containing "Yes" (without quotes) based on the conditions given and "No" otherwise.
Refer sample input and output for formatting specifications.

Sample Input1:
ABABAB

Sample Output1:
Yes

Sample Input2:
ABC

Sample Output2:
No

Sample Input3:
XYXYX

Sample Output3:
Yes
 */

import java.util.Scanner;

public class AlternatingCode {
    public static void main(String[] args) {
        System.out.println("Enter the code:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();

        System.out.println(isAlternate(code));
    }

    static String isAlternate(String code) {
        char a = code.charAt(0);
        char b = code.charAt(1);
        for (int i = 2; i < code.length(); i++) {
            if (i % 2 == 0 && code.charAt(i) != a) {
                return "No";
            } else if (i % 2 != 0 && code.charAt(i) != b) {
                return "No";
            }
        }
        return "Yes";
    }
}
