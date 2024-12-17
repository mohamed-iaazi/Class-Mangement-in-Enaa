package services;

import Model.Person;
import Model.Student;
import Utils.Input;

import java.util.ArrayList;

 public class Students  {

 static ArrayList<Student> list=new ArrayList<>();


    public static void AddSt(int Id,String f,String l,String Email,int Phone,int N_Class,String Trainer ){
        list.add(new Student(Id,f,l,Email,Phone,N_Class,Trainer));
    }

    public  static void display(){
        if (list.isEmpty()){
            System.out.println("\n\n   Ops No Student To Display ");
        }
        else {
            for (Student s : list) {
                s.Display();
            }
        }
        }

        public static  void delete(int id){
        boolean found=false;
        for(int i=0;i<list.size();i++){
           if (id==list.get(i).getId()){
               id=i;
               found=true;
           }
        }
        if (found) {
            list.remove(id);
            System.out.println("\n\n      Deleted With Success");

        }
        else {
            System.out.println("\n\n      Ops Not Found");
        }
        }
    }

