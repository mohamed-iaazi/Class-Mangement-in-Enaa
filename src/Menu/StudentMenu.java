package Menu;

import Model.Student;
import Utils.Input;
import services.Students;

public class StudentMenu {
    static  private int Id,choose;
    static  boolean error=false;

    public   static void S_Menu(){
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
                                     (5) Update  The  Class
                                     (6) Back To Main Menu
                   
                   
                   
                   
                   """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
                switch (choose) {
                    case 1:
                        System.out.println("\n    Add New Student\n");
                        add();
                        break;
                    case 2:
                        System.out.println("\n    Delete Student\n");
                       delete();
                        break;
                    case 3:
                        System.out.println("\n    Update Student\n");

                        break;
                    case 4:
                        System.out.println("\n    Display All Students\n");
                        display();

                        break;
                    case 5:
                        System.out.println("\n    Update  The  Class\n");
                        update();

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

    private static  void add(){
        do {
            try {
                System.out.print("     Enter The First name of the Student: ");
                String FirstName= Input.getinput();
                System.out.print("     Enter The Last name of the Student: ");
                String LastName=Input.getinput();
                System.out.print("     Enter The Email of the Student: ");
                String Email=Input.getinput();
                System.out.print("     Enter The Phone of the Student :");
                int Phone=Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Class of the Student :");
                int N_Class=Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Trainer of the Student :");
                String Trainer=Input.getinput();
                Id=Id+1;
                Students.AddSt(Id,FirstName,LastName,Email,Phone,N_Class,Trainer);
                error=false;
            }
            catch (Exception e){
                System.out.println("  Oops An Error Occured  ");
                error=true;
            }
        }
        while (error);
    }

    private static void display(){
        Students.display();
    }
    private static void delete(){
        System.out.print("Enter The ID Of the Student : ");
        int id=Integer.parseInt(Input.getinput());
        Students.delete(id);
    }
    private static void update(){
        if (Students.display()) {


            do {
                try {
                    System.out.print("     Enter The First name of the Student: ");
                    String FirstName= Input.getinput();
                    System.out.print("     Enter The Last name of the Student: ");
                    String LastName=Input.getinput();
                    System.out.print("     Enter The Email of the Student: ");
                    String Email=Input.getinput();
                    System.out.print("     Enter The Phone of the Student :");
                    int Phone=Integer.parseInt(Input.getinput());
                    System.out.print("     Enter The Class of the Student :");
                    int N_Class=Integer.parseInt(Input.getinput());
                    System.out.print("     Enter The Trainer of the Student :");
                    String Trainer=Input.getinput();
                    Id=Id+1;
                    Students.Update(Id,FirstName,LastName,Email,Phone,N_Class,Trainer);
                    error=false;
                }
                catch (Exception e){
                    System.out.println("  Oops An Error Occured  ");
                    error=true;
                }
            }
            while (error);

        }
        else {
            System.out.println("\n\n   No Data To Update");
        }
    }
}