package Menu;

import Model.Crud;
import Model.Student;
import Model.Trainer;
import Utils.Input;
import interfaces.OnClickListnner;

import java.util.ArrayList;

public class TrainersMenu extends Crud implements OnClickListnner {

    static  private int Id;
    static  boolean error=false;
    static ArrayList<Trainer> trainerArrayList =new ArrayList<>();


    public static void Menu() {
        int choose=0;
        while (choose != 6) {
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
                                                  (6) Back To Main Menu
                                                  
                    
                    """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
                TrainersMenu trainersMenu=new TrainersMenu();
                trainersMenu.OnClick(choose);
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
            case 6 -> System.out.print("\n\n    Back To Main Menu"); //back;
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
                System.out.print("     Enter The Salary of the Trainer :");
                int salary = Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Specialisation of the Trainer :");
                String sp = Input.getinput();
                if (!trainerArrayList.isEmpty()){
                    Id= trainerArrayList.getLast().getId()+1;
                }
                else {
                    Id=Id+1;
                }
                trainerArrayList.add(new Trainer(Id,FirstName,LastName,Email,salary,sp));


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


        if (!trainerArrayList.isEmpty()){


            boolean found = false;
            System.out.print("Enter The ID Of the Trainer : ");
            int id = Integer.parseInt(Input.getinput());

            for (int i = 0; i < trainerArrayList.size(); i++) {
                if (id == trainerArrayList.get(i).getId()) {
                    found = true;
                    id=i;
                }
            }
            if (found) {
                trainerArrayList.remove(id);
                System.out.println("\n\n      Deleted With Success");

            } else {
                System.out.println("\n\n      Ops Not Found");
            }
        }
        else {
            System.out.println("\n\n   No Trainer To Delete");
        }

    }
    @Override
    public void Update() {
        error=false;
        boolean found=false;
        int origineid=0;
        if (!trainerArrayList.isEmpty()) {
            do {
                try {
                    System.out.println("\n\n   Enter The Id Of Trainer To Update : ");
                    int id=Integer.parseInt(Input.getinput());
                    origineid=id;

                    for(int i =0 ; i<trainerArrayList.size();i++){
                        if (id==trainerArrayList.get(i).getId())
                        {
                            found=true;
                            id=i;
                        }
                    }
                    if (found){
                        System.out.print("     Enter The First name of the Trainer: ");
                        String FirstName = Input.getinput();
                        System.out.print("     Enter The Last name of the Trainer: ");
                        String LastName = Input.getinput();
                        System.out.print("     Enter The Email of the Trainer: ");
                        String Email = Input.getinput();
                        System.out.print("     Enter The Salary of the Trainer :");
                        int salary = Integer.parseInt(Input.getinput());
                        System.out.print("     Enter The Specialisation of the Trainer :");
                        String sp = Input.getinput();
                        trainerArrayList.set(id,new Trainer(origineid,FirstName,LastName,Email,salary,sp));
                        System.out.println("\n\n   Your Student Update With Success");
                        error=false;
                    }
                    else {
                        System.out.println("\n\n   The ID Doesn't Match Ant Student ");
                        error=true;

                    }

                }
                catch (Exception e){
                    System.out.println("  Oops An Error Occurred  ");
                    error=true;
                }
            }
            while (error);

        }
        else {
            System.out.println("\n\n   No Data To Update");

        }



    }
    public void Associate() {
        // get the user iid to update
        System.out.print("\n\n   Enter The Id of The trainer  : ");
        int id=Integer.parseInt(Input.getinput());
        System.out.print("\n\n   Enter The Number Of The Class You Want To associate : ");
        int c=Integer.parseInt(Input.getinput());
        // call the assosiate function in the trainer model  adn it takes two param
      //  Trainer.ass(id,c);
    }
    @Override
    public void Display() {


        if (trainerArrayList.isEmpty()) {
            System.out.println("\n\n   Ops No Student To Display ");
        } else {
            for (Trainer value : trainerArrayList) {
                Trainer trainer;
                trainer = value;

                System.out.print("\n\n  The Id : " + trainer.getId()
                        + "\n  First Name : " + trainer.getFirstName()
                        + "\n  Last Name : " + trainer.getLastName()
                        + "\n  Email : " + trainer.getEmail()
                        + "\n  The Salary Is : " + trainer.getSalary()
                        + "\n  The Specialisation is : " + trainer.getSp());
            }

        }
    }


}
