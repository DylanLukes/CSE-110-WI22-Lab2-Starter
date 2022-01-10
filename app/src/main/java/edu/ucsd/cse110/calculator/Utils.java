package edu.ucsd.cse110.calculator;

public class Utils {
    public static boolean isEmpty(String str) {
        if (str == null) {
            return false;
        }
        else if (str.equals("")) {
            return false;
        }
        else {
            return true;
        }
    }

    public static int toIntNullsafe(String str) {
        if (isEmpty(str)) {
            return 0;
        }
        return Integer.parseInt(str);
    }
}
