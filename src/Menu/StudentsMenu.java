package Menu;

import Model.Classe;
import Model.Crud;
import Model.Student;
import Model.Trainer;
import Utils.Input;
import interfaces.OnClickListnner;

import java.util.ArrayList;

public class StudentsMenu extends Crud implements OnClickListnner {
    // var
    static  private int Id;
    static  boolean error=false;
    static Student student = new Student();
     ArrayList<Student> StudentList=new ArrayList<>();
     ArrayList<Trainer> TrainerList=new ArrayList<>();
     ArrayList<Classe> ClassList=new ArrayList<>();



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
                StudentList.add(new Student(Id,FirstName,LastName,Email,StudentList));
                Id=Id+1;
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
        boolean found = false;
        System.out.print("Enter The ID Of the Student : ");
        int id=Integer.parseInt(Input.getinput());
        for (int i = 0; i < StudentList.size(); i++) {
            if (id == StudentList.get(i).getId()) {
                id = i;
                found = true;
            }
        }
        if (found) {
            StudentList.remove(id);
            System.out.println("\n\n      Deleted With Success");

        } else {
            System.out.println("\n\n      Ops Not Found");
        }
    }

    @Override
    public void Update() {
        error=false;
        if (!StudentList.isEmpty()) {
            do {
                try {
                    System.out.println("\n\n   Enter The Id Of Student To Update : ");
                    int id=Integer.parseInt(Input.getinput());
                    for(int i =0 ; i<StudentList.size();i++){
                     if (id==StudentList.get(i).getId())
                     {
                         System.out.print("     Enter The First name of the Student: ");
                         String FirstName= Input.getinput();
                         System.out.print("     Enter The Last name of the Student: ");
                         String LastName=Input.getinput();
                         System.out.print("     Enter The Email of the Student: ");
                         String Email=Input.getinput();
                         System.out.print("     Enter The Class of the Student :");
                         StudentList.set(id,new Student(Id,FirstName,LastName,Email,StudentList));

                         error=false;
                     }
                    }
                    if (!error){
                        System.out.println("\n\n   Your Student Update With Success");
                    }
                    else {
                        System.out.println("\n\n   The ID Doesn't Match Ant Student ");

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


}
