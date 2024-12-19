/*
* */


import Menu.ClassesMenu;
import Menu.StudentsMenu;
import Menu.TrainersMenu;
import Utils.Input;
import interfaces.OnClickListnner;
import interfaces.SubMenus;

public class Application implements SubMenus, OnClickListnner {
    static Application application = new Application();

    public Application() {
    }

    public static void main(String[] args) {
        int selected = 0;

        while(selected != 4) {
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
                selected = Integer.parseInt(Input.getinput());
                if (Input.InputVal(String.valueOf(selected))) {
                    application.Listnner(selected);
                } else {
                    System.out.println("  You Cant Send an Empty Value");
                }
            } catch (Exception var3) {
                System.out.println("   Error :");
            }
        }

    }

    public void StudentMenu() {
        StudentsMenu.Menu();
    }

    public void ClassMenu() {
        ClassesMenu.Menu();
    }

    public void TrainerMenu() {
        TrainersMenu.Menu();
    }



    @Override
    public void OnClick(int menu) {
        switch (menu) {
            case 1 -> application.StudentMenu();
            case 2 -> application.TrainerMenu();
            case 3 -> application.ClassMenu();
            case 4 -> System.exit(0);
        }
    }
}

