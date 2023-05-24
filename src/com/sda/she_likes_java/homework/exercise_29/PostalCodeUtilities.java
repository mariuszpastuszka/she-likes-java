package com.sda.she_likes_java.homework.exercise_29;

public class PostalCodeUtilities {

    /**
     * We're assuming correct format is: XX-YYY
     * X and Y are digits
     * @param postalCode postalCode to verify
     */
    public static void checkPostalCode(String postalCode) throws PostalCodeException {
        final int postalCodeLength = 6;
        final int separatorIndex = 2;
        final char separator = '-';

        if (postalCode.length() != postalCodeLength) {
            throw new PostalCodeException("Wrong length");
        } if (postalCode.charAt(separatorIndex) != separator) {
            throw new PostalCodeException("Lack of separator");
        } if (!containsOnlyDigits(postalCode.substring(0, separatorIndex))) {
            throw new PostalCodeException("No digits in first part");
        } else if (!containsOnlyDigits(postalCode.substring(separatorIndex + 1))) {
            throw new PostalCodeException("No digits in second part");
        }
    }

    private static boolean containsOnlyDigits(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
