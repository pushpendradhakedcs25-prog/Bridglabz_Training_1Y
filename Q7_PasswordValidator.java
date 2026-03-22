package Assigment_10;

interface SecurityUtils {
    static boolean check(String p) {
        return p.length() >= 8;
    }
}

public class Q7_PasswordValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.check("password123"));
    }
}