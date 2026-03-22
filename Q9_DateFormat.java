package Assigment_10;

import java.time.LocalDate;

interface DateUtil {
    static String format(LocalDate d) {
        return d.toString();
    }
}

public class Q9_DateFormat {
    public static void main(String[] args) {
        System.out.println(DateUtil.format(LocalDate.now()));
    }
}