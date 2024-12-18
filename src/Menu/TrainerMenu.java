package Menu;

import Model.Trainer;
import Utils.Input;

public class TrainerMenu {
    private static int Id;
    static boolean error = false;
    static Trainer trainer = new Trainer();

    public static void T_Menu() {
        int choose = 0;

        while (choose != 5) {
            System.out.println("""
                    
                                *******************************************
                                *                                         *
                                *                                         *
                                *             Trainer Menu                *
                                *                                         *
                                *                                         *
                                *******************************************
                    
                    
                                      (1) Add New Trainer
                                      (2) Delete Trainer
                                      (3) Update Trainer info
                                      (4) Associated To class
                                      (5) Display All Trainers
                                      (5) Back To Main Menu
                    
                    
                    
                    
                    """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
                switch (choose) {
                    case 1:
                        System.out.println("\n    Add New Trainer\n");
                        Tadd();
                        break;


                    case 2:
                        System.out.println("\n    Delete A trainer\n");
                        if (trainer.Display()) {
                            Tdelete();
                        } else {
                            System.out.println("\n\n   No Trainers To Delete");
                        }
                        break;

                    case 3:
                        System.out.println("\n    Update A Trainer info\n");
                        if (trainer.Display()) {
                            Tupdate();
                        } else {
                            System.out.println("\n\n   No Trainers To Update");
                        }

                        break;

                    case 4:
                        System.out.println("\n   Associated To class \n");
                        if (trainer.Display()) {
                            Tassd();
                        } else {
                            System.out.println("\n\n   No Trainers  To Associate");
                        }

                        break;

                    case 5:
                        System.out.println("\n    Display All Trainers \n");

                        if (trainer.Display()) {
                            Tdisplay();
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

    private static void Tadd() {
        do {
            try {
                System.out.print("     Enter The First name of the Trainer: ");
                String FirstName = Input.getinput();
                System.out.print("     Enter The Last name of the Trainer: ");
                String LastName = Input.getinput();
                System.out.print("     Enter The Email of the Trainer: ");
                String Email = Input.getinput();
                System.out.print("     Enter The Phone of the Trainer :");
                int Phone = Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Class of the Trainer :");
                int N_Class = Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Salary of the Trainer :");
                String salary = Input.getinput();
                Id = Id + 1;
                trainer.Add(Id, FirstName, LastName, Email, Phone, N_Class, salary);
                error = false;
            } catch (Exception e) {
                System.out.println("  Oops An Error Occured  ");
                error = true;
            }
        }
        while (error);
    }

    public static void Tdelete() {
        System.out.print("Enter The ID Of the Trainer : ");
        int id = Integer.parseInt(Input.getinput());
        trainer.Delete(id);


    }

    public static void Tupdate() {
        error = false;

        do {
            try {
                System.out.println("\n\n   update try!");
                System.out.print("     Enter The First name of the Trainer: ");
                String FirstName = Input.getinput();
                System.out.print("     Enter The Last name of the Trainer: ");
                String LastName = Input.getinput();
                System.out.print("     Enter The Email of the Student: ");
                String Email = Input.getinput();
                System.out.print("     Enter The Phone of the Student :");
                int Phone = Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Class of the Student :");
                int N_Class = Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Trainer of the Student :");
                String Trainer = Input.getinput();
                Id = Id + 1;

                trainer.Update(Id, FirstName, LastName, Email, Phone, N_Class, Trainer);
                error = false;
            } catch (Exception e) {
                System.out.println("  Oops An Error Occured  ");
                error = true;
            }
        }
        while (error);


    }

    public static void Tassd(){
        // get the user iid to update
        System.out.print("\n\n   Enter The Id of The trainer  : ");
        int id=Integer.parseInt(Input.getinput());
        System.out.print("\n\n   Enter The Number Of The Class You Want To associate : ");
        int c=Integer.parseInt(Input.getinput());
        // call the assosiate function in the trainer model  adn it takes two param
        Trainer.ass(id,c);


    }
    public static void Tdisplay(){

            trainer.Display();

    }
}
