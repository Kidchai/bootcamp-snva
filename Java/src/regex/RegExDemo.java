package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    private static final String EMAIL_PATTERN = "\\w+.*@\\w+\\.\\w+"; // simple email pattern
    public static void main(String[] args) {
        String[] emails = new String[]{
                "example@gmail.com",
                "user.mail@com.edu",
                "john_doe@example.fn",
                "invalid.email",
                "invalid.email@",
                "@invalid.email",
                "invalid.email@invalid",
                "invalid.email@invalid."
        };

        for (String email : emails) {
            System.out.printf("%s: %s\n", email, isValidEmail(email));
        }
    }

    private static String isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches() ? "Valid" : "Invalid";
    }
}
