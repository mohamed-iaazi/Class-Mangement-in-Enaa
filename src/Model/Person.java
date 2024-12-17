package Model;

public  abstract  class Person {

    private  int Id;
    private  String FirstName;
    private  String  LastName;
    private  String  Email;
    private  int  Phone;
    private static   int  N_Class;

    public Person(){

    }

    public Person(int id, String firstName, String lastName, String email, int phone, int n_Class) {

        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phone = phone;
        N_Class = n_Class;
    }


    public int getN_Class() {
        return N_Class;
    }

    public void setN_Class(int n_Class) {
        N_Class = n_Class;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public   abstract boolean Display();
    public   abstract void Update(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer);
    public   abstract void Delete(int Id);
    public   abstract void Add(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer);
    public   abstract void Update(int Id, String f, String l, String Email, int Phone,int Salary,String sp,int N_Class);


}
