package Model;

public class Trainer extends Person {
    private   String salary;
    private   String sp;

    public Trainer(int id, String firstName, String lastName, String email, int phone, int n_Class, String salary, String sp) {
        super(id, firstName, lastName, email, phone, n_Class);
        this.salary = salary;
        this.sp = sp;
    }
    public Trainer(){

    }

    @Override
    public boolean Display() {
        System.out.print(" The Trainer Full Name is "+getFirstName()+" "+getLastName()+"\n The Email is : "
                +getEmail()+"\n Phone Number : "+getPhone()+"\n The Class Number : "
                +getN_Class()+"\n The Salary : "+salary+"The Specialisation : "+sp);
        return true;

    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {

    }

    @Override
    public void Delete(int Id) {

    }

    @Override
    public void Add(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {

    }


}
