import Menu.StudentMenu;
import Utils.Input;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {

   int x;
   static   int choose;

    public static void main(String[] args) {
        while (choose != 4) {
            Menu();
        }
    }

   static public void  Menu(){

        System.out.println("""
                           
                                       *******************************************
                                       *                                         *
                                       *                                         *
                                       *                  Menu                   *
                                       *                                         *
                                       *                                         *
                                       *******************************************
                                       
                                       
                                             (1) Enaa Management System Students
                                             (2) Enna Management System Trainers
                                             (3) Enna Management System Classes
                                             (4) Exit
                                             
                
                
                           """);
        try {
            System.out.print("   Enter Your Choice : ");
            choose= Integer.parseInt(Input.getinput());
            switch (choose){
                case 1:
                    System.out.println("\n   Welcome to Enaa Mangement System Students\n");
                    StudentMenu.S_Menu();

                    break;
                case 2:
                    System.out.println("\n   Welcome to Enaa Mangement System Trainers\n");
                    break;
                case 3:
                    System.out.println("\n   Welcome to Enaa Mangement System Classes\n");
                    break;
            }

        }
        catch (Exception e){
            System.out.println("An Error Occured");
        }


    }


}