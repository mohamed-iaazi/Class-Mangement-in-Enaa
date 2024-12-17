package Utils;

import java.util.Scanner;

public class Input {

  static private  Scanner scanner ;
    public static String getinput(){
        scanner = new Scanner(System.in);
        return   scanner.nextLine();
    }
}
