package Menu;

import Model.Crud;
import Model.Student;
import Model.Trainer;
import Utils.Input;
import interfaces.OnClickListnner;

public class TrainersMenu extends Crud implements OnClickListnner {

    static  private int Id;
    static  boolean error=false;
    static Trainer trainer = new Trainer();

    public static void Menu() {
        int choose=0;
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
            }
            catch (Exception e){
                System.out.println("\n\n   An Error Occurred " +e);

            }
        }
    }



    @Override
    public void OnClick(int menu) {
        switch (menu){
            case 1 -> Add();
            case 2 -> Delete();
            case 3 -> Update();
            case 4 -> Associate();
            case 5 -> Display();
            case 6 -> System.exit(0);
        }
    }


    @Override
    public void Add() {
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
                System.out.println("\n\n   Oops An Error Occurred  ");
                error = true;
            }
        }
        while (error);
    }

    @Override
    public void Delete() {
        System.out.print("Enter The ID Of the Trainer : ");
        int id = Integer.parseInt(Input.getinput());
        trainer.Delete(id);

    }

    @Override
    public void Update() {
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
                System.out.println("\n\n   Oops An Error Occurred  ");
                error = true;
            }
        }
        while (error);



    }
    public void Associate() {
        // get the user iid to update
        System.out.print("\n\n   Enter The Id of The trainer  : ");
        int id=Integer.parseInt(Input.getinput());
        System.out.print("\n\n   Enter The Number Of The Class You Want To associate : ");
        int c=Integer.parseInt(Input.getinput());
        // call the assosiate function in the trainer model  adn it takes two param
        Trainer.ass(id,c);
    }


    @Override
    public void Display() {
        trainer.Display();
    }


}
