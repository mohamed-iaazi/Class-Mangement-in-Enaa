import Menu.ClassMenu;
import Menu.StudentMenu;
import Menu.TrainerMenu;
import Model.Student;
import Utils.Input;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    private  static int  choose;
   static TrainerMenu trainerMenu;
   static  StudentMenu studentMenu;
   static ClassMenu classMenu;
   Student S=new Student();
   static  ArrayList<Student> students=new ArrayList<>();

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
                    StudentMenu.S_Menu();

                    break;
                case 2:
                    System.out.println("\n   Welcome to Enaa Mangement System Trainers\n");
                    TrainerMenu.T_Menu();
                    break;
                case 3:
                    System.out.println("\n   Welcome to Enaa Mangement System Classes\n");
                    ClassMenu.C_Menu();

                    break;
            }

        }
        catch (Exception e){
            System.out.println("An Error Occured");
        }


    }


}