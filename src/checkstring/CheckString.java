
package checkstring;

import java.util.regex.Pattern;

public class CheckString {

    /**
     * Checks if the given string contains any digits.
     * @param str The string to be checked.
     * @return true if the string contains digits, false otherwise.
     */
    public static boolean checkchar(String str) {
        // Regular expression to match any digit
        String regex = ".*\\d.*";
        // Check if the string matches the regular expression
        return Pattern.matches(regex, str);
    }

    public static void main(String[] args) {
        // Test the checkchar method
        String str1 = "as23g";
        if (checkchar(str1)) {
            System.out.println("Given String has digits");
        } else {
            System.out.println("Given String has only characters, no digits");
        }
    }
}

