package Model;

public class Student extends Person {
    private static   String  Trainer;

    public Student(int id, String firstName, String lastName, String email, int phone, int n_Class,String trainer) {
        super(id, firstName, lastName, email, phone, n_Class);
        this.Trainer=trainer;
    }



    @Override
    public void Display() {

        System.out.print( "  First Name : "+getFirstName()+"\n  Last Name : "+getLastName()
                + "\n  Number phone : "+getPhone()+"\n  Email : "
                +getEmail()+"\n  Trainer : "+Trainer+"\n  Class : "+ getN_Class());
    }
}
