package JAVA_8.functional_interface;

import java.util.function.Predicate;

public class _Predicate {
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    public static void main(String[] args) {
        Predicate<String> isValidNumber = number -> number.startsWith("07")
                && (number.length() == 11);

        System.out.println(isPhoneNumberValid("07865094509"));
        System.out.println(isValidNumber.test("07865094504"));
    }
}
