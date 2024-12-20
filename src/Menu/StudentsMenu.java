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
   static int Id;
    boolean error = false;
    static   ArrayList<Student> StudentList=new ArrayList<>();
    static  Student student=new Student();

    // Sub Menu of student
    public static void Menu() {
        int choose = 0;
        while (choose != 6) {
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
                                  (5) Associate To Class/Trainer
                                  (6) Back To Main Menu
                    
                    """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
                StudentsMenu studentsMenu = new StudentsMenu();
                studentsMenu.OnClick(choose);
            } catch (Exception e) {
                System.out.println("\n\n   An Error Occurred " + e);

            }
        }
    }
    @Override
    public void OnClick(int menu) {
        switch (menu) {
            case 1 -> Add();
            case 2 -> Delete();
            case 3 -> Update();
            case 4 -> Display();
            case 5 -> Associate();
            case 6 -> System.out.print("\n\n    Back To Main Menu"); //back;
        }

    }
    @Override
    public void Display() {

        if (student.getStudentlist().isEmpty()) {
            System.out.println("\n\n   Ops No Student To Display ");
        } else {
            for (Student value : student.getStudentlist()) {
                System.out.print("\n\n  The Id : " + value.getId() + "\n  First Name : " + value.getFirstName() +
                        "\n  Last Name : " + value.getLastName()
                        + "\n  Email : "
                        + value.getEmail());
            }

        }

    }
    @Override
    public void Associate() {

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

                if (!StudentList.isEmpty()){
                    Id=StudentList.getLast().getId()+1;
                }
                else {
                    Id=Id+1;
                }

                StudentList.add(new Student(Id,FirstName,LastName,Email));
                student.setStudentlist(StudentList);

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
        if (!StudentList.isEmpty()){


        boolean found = false;
        System.out.print("Enter The ID Of the Student : ");
        int id=Integer.parseInt(Input.getinput());

        for (int i = 0; i < StudentList.size(); i++) {
            if (id == StudentList.get(i).getId()) {
                found = true;
                id=i;
            }
        }
        if (found) {
            StudentList.remove(id);
            System.out.println("\n\n      Deleted With Success");

        } else {
            System.out.println("\n\n      Ops Not Found");
        }
        }
        else {
            System.out.println("\n\n   No Data To Delete");
        }
    }
    @Override
    public void Update() {
        error=false;
        boolean found=false;
        int origineid=0;
        if (!StudentList.isEmpty()) {
            do {
                try {
                    System.out.println("\n\n   Enter The Id Of Student To Update : ");
                    int id=Integer.parseInt(Input.getinput());
                    origineid=id;

                    for(int i =0 ; i<StudentList.size();i++){
                     if (id==StudentList.get(i).getId())
                     {
                         found=true;
                         id=i;
                     }
                    }


                    if (found){
                        System.out.print("     Enter The First name of the Student: ");
                        String FirstName= Input.getinput();
                        System.out.print("     Enter The Last name of the Student: ");
                        String LastName=Input.getinput();
                        System.out.print("     Enter The Email of the Student: ");
                        String Email=Input.getinput();
                        StudentList.set(id,new Student(origineid,FirstName,LastName,Email));
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


}
