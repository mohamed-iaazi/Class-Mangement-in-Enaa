package Menu;

import Model.Classe;
import Model.Crud;
import Model.Student;
import Utils.Input;
import interfaces.OnClickListnner;

import java.util.ArrayList;

public class ClassesMenu extends Crud implements OnClickListnner {
    static int Id;
    boolean error = false;
    static ArrayList<Classe> classes=new ArrayList<>();
    public static void Menu() {
        int choose=0;
        while (choose != 6) {
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
                                                   (6) Back To Main Menu
                                         
                                         
                                 
                    """);
            try {
                System.out.print("   Enter Your Choice : ");
                choose = Integer.parseInt(Input.getinput());
                ClassesMenu classesMenu=new ClassesMenu();
                classesMenu.OnClick(choose);
            }
            catch (Exception e){
                System.out.println("\n\n   An Error Occurred " +e);

            }
        }

    }

    @Override
    public void Add() {

        do {
            try {
                System.out.print("     Enter The Class name : ");
                String name = Input.getinput();
                if (!classes.isEmpty()){
                    Id=classes.getLast().getId()+1;
                }
                else {
                    Id=Id+1;
                }
                classes.add(new Classe(Id,name,null,null));


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
        if (!classes.isEmpty()){


            boolean found = false;
            System.out.print("Enter The ID Of the Class : ");
            int id=Integer.parseInt(Input.getinput());

            for (int i = 0; i < classes.size(); i++) {
                if (id == classes.get(i).getId()) {
                    found = true;
                    id=i;
                }
            }
            if (found) {
                classes.remove(id);
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
        if (!classes.isEmpty()) {
            do {
                try {
                    System.out.println("\n\n   Enter The Id Of Class To Update : ");
                    int id=Integer.parseInt(Input.getinput());
                    origineid=id;

                    for(int i =0 ; i<classes.size();i++){
                        if (id==classes.get(i).getId())
                        {
                            found=true;
                            id=i;
                        }
                    }


                    if (found){
                        System.out.print("     Enter The  name of the Class: ");
                        String name= Input.getinput();
                        classes.set(id,new Classe(origineid,name,null,null));
                        System.out.println("\n\n   Your Class Update With Success");
                        error=false;
                    }
                    else {
                        System.out.println("\n\n   The ID Doesn't Match Any Class ");
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
            System.out.println("\n\n   No Class To Update");

        }
    }


    @Override
    public void Display() {
        if (classes.isEmpty()) {
            System.out.println("\n\n   Ops No Student To Display ");
        } else {
            for (Classe value : classes) {
                System.out.print("\n\n  The Id : " + value.getId() + "\n  First Name : " + value.getClassName());
            }

        }

    }

    @Override
    public void Associate() {

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
}
