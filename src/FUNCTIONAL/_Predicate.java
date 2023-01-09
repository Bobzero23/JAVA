package FUNCTIONAL;

public class _Predicate {
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07865094509"));
        System.out.println(isPhoneNumberValid("05865094509"));
    }
}
