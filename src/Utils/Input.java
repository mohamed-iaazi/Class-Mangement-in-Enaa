package Utils;

import java.util.Optional;
import java.util.Scanner;

public class Input {

    static Scanner scanner;

    public Input() {
    }

    public boolean EmailVal() {
        return false;
    }

    public static boolean InputVal(String s) {
        Optional optional = Optional.ofNullable(s);
        return optional.isPresent();
    }

    public static String getinput() {
        scanner = new Scanner(System.in);
        return scanner.next();
    }
}
