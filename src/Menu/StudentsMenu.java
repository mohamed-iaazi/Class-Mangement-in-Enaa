package Menu;

import Utils.Input;
import interfaces.OnClickListnner;

public class StudentsMenu implements OnClickListnner {

    public static void Menu() {
        int choose=0;
        while (choose != 5) {
            System.out.println("""
                    
                                *******************************************
                                *                                         *
                                *                                         *
                                *             Student Menu                *
                                *                                         *
                                *                                         *
                                *******************************************
                    
                    
                                      (1) Add New Student
                                      (2) Delete Student
                                      (3) Update Student
                                      (4) Display All Students
                                      (5) Back To Main Menu
                    
                    
                    
                    
                    """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
            }
            catch (Exception e){
            }
        }
        }

    @Override
    public void OnClick(int menu) {
        switch (menu){
            case 1 -> Crud.StudentMenu();
            case 2 -> application.TrainerMenu();
            case 3 -> application.ClassMenu();
            case 4 -> System.exit(0);
        }

    }
}
