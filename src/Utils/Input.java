package Utils;

import java.util.Scanner;

public class Input {

  static   Scanner scanner ;
    public static String getinput(){
        scanner = new Scanner(System.in);
        return   scanner.nextLine();
    }
}
