package Model;

public class Student {
    private int Id;
    private  String FirstName;
    private  String  LastName;
    private  String  Email;
    private  String  Phone;
    private  int  N_Class;
    private  String  Trainer;

    public Student(int id, String firstName, String lastName, String email, String phone, int n_Class, String trainer) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phone = phone;
        N_Class = n_Class;
        Trainer = trainer;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;

    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getN_Class() {
        return N_Class;
    }

    public void setN_Class(int n_Class) {
        N_Class = n_Class;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    @Override
    public String toString() {

        return "  First Name"+getFirstName()+"\n  Last Name : "+getLastName()
                + "\n  Number phone : "+getPhone()+"\n  Email : "
                +getEmail()+"\n  Trainer : "+getTrainer()+"\n  Class : "+ getN_Class();
    }
}
