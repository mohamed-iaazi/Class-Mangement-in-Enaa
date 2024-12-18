package Menu;

import Utils.Input;

public class ClassMenu {

    public static void C_Menu() {
        int choose = 0;

        while (choose != 5) {
            System.out.println("""
                    
                                *******************************************
                                *                                         *
                                *                                         *
                                *             Classes Menu                *
                                *                                         *
                                *                                         *
                                *******************************************
                    
                    
                                      (1) Add New Class
                                      (2) Delete Class
                                      (3) Update Class info
                                      (4) Associated  S/T To The  class
                                      (5) Display All The Classes
                                      (5) Back To Main Menu
                    
                    
                    
                    
                    """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
                switch (choose) {
                    case 1:
                        System.out.println("\n    Add New Class\n");

                        break;


                    case 2:
                        System.out.println("\n    Delete A Class\n");
                        if () {
                        } else {
                            System.out.println("\n\n   No Class To Delete");
                        }
                        break;

                    case 3:
                        System.out.println("\n    Update A Class info\n");
                        if () {

                        } else {
                            System.out.println("\n\n   No Class To Update");
                        }

                        break;

                    case 4:
                        System.out.println("\n   Associated S/T To class \n");
                        if () {

                        } else {
                            System.out.println("\n\n   No S/T  To Associate");
                        }

                        break;

                    case 5:
                        System.out.println("\n    Display All Classes \n");

                        if () {
                        } else {
                            System.out.println("\n\n   No Classes To Display");
                        }
                        break;

                    case 6:
                        System.out.println("\n     ################# Back  ################## \n");

                        break;

                }


            } catch (Exception e) {
                System.out.println("\n\n    An Error Occured \n\n");
            }
        }
    }


}
