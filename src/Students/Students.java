package Students;

import Model.Student;
import Utils.Input;

import java.util.ArrayList;

 public class Students  {
 static  private int Id,choose;
 static  boolean error=false;
 static  private  String FirstName;
 static  private  String  LastName;
 static  private  String  Email;
 static  private  String  Phone;
 static  private  int  N_Class;
 static  private  String  Trainer;
   static ArrayList<Student> list=new ArrayList<>();






   public static   void S_Menu(){
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
                       S_Add();
                       break;
                   case 2:
                       System.out.println("\n    Delete Student\n");
                       S_Delete();
                       break;
                   case 3:
                       System.out.println("\n    Update Student\n");
                       S_Update();
                       break;
                       case 4:
                       System.out.println("\n    Display All Students\n");
                       S_Display();
                       break;
                       case 5:
                           System.out.println("\n    Update  The  Class\n");

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
    private static  void S_Add(){

        do {
            try {
                System.out.print("     Enter The First name of the Student: ");
                FirstName=Input.getinput();
                System.out.print("     Enter The Last name of the Student: ");
                LastName=Input.getinput();
                System.out.print("     Enter The Email of the Student: ");
                Email=Input.getinput();
                System.out.print("     Enter The Phone of the Student :");
                Phone=Input.getinput();
                System.out.print("     Enter The Class of the Student :");
                N_Class=Integer.parseInt(Input.getinput());
                System.out.print("     Enter The Trainer of the Student :");
                Trainer=Input.getinput();
                Id=Id+1;
                list.add(new Student(Id,FirstName,LastName,Email,Phone,N_Class,Trainer));
                error=false;
            }
            catch (Exception e){
                System.out.println("  Oops An Error Occured  ");
                error=true;
            }
        }
        while (error);





    }
    private  static  void S_Delete(){


    }
    private  static  void S_Display(){

       for (Student s:list)
       {
           System.out.println("\n"+
                             "\n   ------------------------------------------ "
                             +"\n                    "+s.getId()+
                             "\n   ------------------------------------------ "
             
                              +"\n"+s.toString()+

                               
                              "\n   ------------------------------------------"+
                              "\n   ------------------------------------------  ");

       }

    }
    private  static  void S_Update(){


    }
    private static  void S_UpdateClass(){

    }
}
