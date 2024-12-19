package Model;

public  abstract  class Person {

    private  int Id;
    private  String FirstName;
    private  String  LastName;
    private  String  Email;

    public Person(int id, String firstName, String lastName, String email) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public int getId() {
        return Id;
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

    public Person(){

    }



    public void setId(int id) {
        Id = id;
    }

}
