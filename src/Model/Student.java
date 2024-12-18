package Model;


import java.util.ArrayList;

public class Student extends Person {
    private String  Trainer;

    static ArrayList<Student> list = new ArrayList<>();


    public Student(){

    }

    public Student(int id, String firstName, String lastName, String email, int phone, int n_Class, String trainer) {
        super(id, firstName, lastName, email, phone, n_Class);
        Trainer=trainer;

    }



    @Override
    public boolean Display() {

        if (list.isEmpty()){
            System.out.println("\n\n   Ops No Student To Display ");
            return false;
        }
        else {
            for (int i=0;i< list.size();i++) {
                System.out.print( "\n\n  The Id : "+list.get(i).getId()+"\n  First Name : "+list.get(i).getFirstName()+"\n  Last Name : "+list.get(i).getLastName()
                        + "\n  Number phone : "+getPhone()+"\n  Email : "
                        +list.get(i).getEmail()+"\n  Trainer : "+ list.get(i).Trainer+"\n  Class : "+list.get(i).getN_Class());
            }

            return true;
        }

    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {

        boolean ishere=false;

        for (int i = 0; i < list.size(); i++) {
            if (Id == list.get(i).getId()) {
                list.add(Id,new Student(Id, f, l, Email, Phone, N_Class, Trainer));
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

    @Override
    public void Delete(int id) {

        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                id = i;
                found = true;
            }
        }
        if (found) {
            list.remove(id);
            System.out.println("\n\n      Deleted With Success");

        } else {
            System.out.println("\n\n      Ops Not Found");
        }
    }

    @Override
    public  void Add(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {
        list.add(new Student(Id, f, l, Email, Phone, N_Class, Trainer));
    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int Salary, String sp, int N_Class) {

    }


}
