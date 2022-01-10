package edu.ucsd.cse110.calculator;

public class Utils {
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        else if (str.equals("")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int toIntNullsafe(String str) {
        if (isEmpty(str)) {
            return 0;
        }
        return Integer.parseInt(str);
    }
}
