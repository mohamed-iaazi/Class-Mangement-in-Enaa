package Menu;

import Model.Crud;
import Model.Student;
import Utils.Input;
import interfaces.OnClickListnner;

public class StudentsMenu extends Crud implements OnClickListnner {
    // var
    static  private int Id;
    static  boolean error=false;
    static Student student = new Student();


    // Sub Menu of student
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
                StudentsMenu studentsMenu=new StudentsMenu();
                studentsMenu.OnClick(choose);
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
            case 4 -> Display();
            case 5 -> System.exit(0);
        }

    }

    @Override
    public void Display() {
        student.Display();
    }

    @Override
    public void Add() {

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
                student.Add(Id,FirstName,LastName,Email,Phone,N_Class,Trainer);
                error=false;
            }
            catch (Exception e){
                System.out.println("\n\n   Oops An Error Occurred  "+ e);
                error=true;
            }
        }
        while (error);

    }

    @Override
    public void Delete() {
        System.out.print("Enter The ID Of the Student : ");
        int id=Integer.parseInt(Input.getinput());
        student.Delete(id);
    }

    @Override
    public void Update() {
        error=false;
        if (student.Display()) {
            do {
                try {
                    System.out.println("\n\n   update try!");
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

                    student.Update(Id,FirstName,LastName,Email,Phone,N_Class,Trainer);
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
