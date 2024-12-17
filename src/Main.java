import Menu.StudentMenu;
import Menu.TrainerMenu;
import Utils.Input;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    private  static int  choose;
   static TrainerMenu trainerMenu=new TrainerMenu();
   static  StudentMenu studentMenu=new StudentMenu();

    public static void main(String[] args) {
        while (choose != 4) {
            Menu();
        }
    }

   static private void  Menu(){


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
                    studentMenu.S_Menu();

                    break;
                case 2:
                    System.out.println("\n   Welcome to Enaa Mangement System Trainers\n");
                    trainerMenu.T_Menu();
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