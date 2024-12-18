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
                        System.out.println("\n    Add New Trainer\n");

                        break;


                    case 2:
                        System.out.println("\n    Delete A trainer\n");
                        if () {
                        } else {
                            System.out.println("\n\n   No Trainers To Delete");
                        }
                        break;

                    case 3:
                        System.out.println("\n    Update A Trainer info\n");
                        if () {

                        } else {
                            System.out.println("\n\n   No Trainers To Update");
                        }

                        break;

                    case 4:
                        System.out.println("\n   Associated To class \n");
                        if () {

                        } else {
                            System.out.println("\n\n   No Trainers  To Associate");
                        }

                        break;

                    case 5:
                        System.out.println("\n    Display All Trainers \n");

                        if () {
                        } else {
                            System.out.println("\n\n   No Trainers To Display");
                        }
                        break;

                    case 6:
                        System.out.println("\n     ################# Back  ################## \n");

                        break;

                }


            } catch (Exception e) {
                System.out.println("An Error Occured");
            }
        }
    }


}
