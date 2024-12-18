package Model;

import java.util.ArrayList;

public class Trainer extends Person {
    private   int salary;
    private   String sp;
   private   static ArrayList<Trainer> list=new ArrayList<>();

    public Trainer(int id, String firstName, String lastName, String email, int phone, int salary, String sp, int n_Class) {
        super(id, firstName, lastName, email, phone, n_Class);
        this.salary = salary;
        this.sp = sp;
    }
    public Trainer(){

    }

    @Override
    public boolean Display() {

        if (list.isEmpty()){
            System.out.println("\n\n   Ops No Student To Display ");
return false;
        }
        else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print("\n\n  The Id : " + list.get(i).getId() + "\n  The Trainer Full Name is " +
                        list.get(i). getFirstName() + " " +  list.get(i).getLastName() + "\n  The Email is : "
                        +  list.get(i).getEmail() + "\n  Phone Number : " +  list.get(i).getPhone() + "\n  The Class Number : "
                        +  list.get(i).getN_Class() + "\n  The Salary : " +  list.get(i).salary + "  The Specialisation : " + list.get(i).sp);
            }
            return true;
        }


    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {
      // its for student only
    }

    @Override
    public void Delete(int Id) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (Id == list.get(i).getId()) {
                Id = i;
                found = true;
            }
        }
        if (found) {
            list.remove(Id);
            System.out.println("\n\n      Deleted With Success");

        } else {
            System.out.println("\n\n      Ops Not Found");
        }

    }

    @Override
    public void Add(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {

    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int Salary,String sp, int N_Class) {
        boolean ishere=false;
        for (int i = 0; i < list.size(); i++) {
            if (Id == list.get(i).getId()) {
                list.add(Id,new Trainer(Id,f,l,Email,Phone,Salary,sp,N_Class));
                ishere=true;
            }

        }

        if (ishere){
            System.out.println("\n\n   Your Student Update With Success");
        }
        else {
            System.out.println("\n\n   Ops Not Found !");

        }

    }

    public static void ass(int id , int Class){
        for (int i=0;i<list.size();i++){
if (id==list.get(i).getId()){
    list.get(i).setN_Class(Class);
}
        }

    }


}
