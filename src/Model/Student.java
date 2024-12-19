package Model;


import java.util.ArrayList;

public class Student extends Person  {
    private  ArrayList<Student> Studentlist;
    static ArrayList<Double> notes = new ArrayList<>();
    private Classe Classes;

    public Student(int id, String firstName, String lastName, String email,ArrayList<Student> studentlist) {
        super(id, firstName, lastName, email);
        this.Studentlist=studentlist;
    }

    public Student() {

    }

    public  ArrayList<Student> getStudentlist() {
        return Studentlist;
    }

    public  void setStudentlist(ArrayList<Student> studentlist) {
        Studentlist = studentlist;
    }

    public  ArrayList<Double> getNotes() {
        return notes;
    }

    public  void setNotes(ArrayList<Double> notes) {
        Student.notes = notes;
    }

    public Classe getClasses() {
        return Classes;
    }

    public void setClasses(Classe classes) {
        Classes = classes;
    }
}