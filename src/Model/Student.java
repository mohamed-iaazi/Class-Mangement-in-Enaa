package Model;


import java.util.ArrayList;

public class Student extends Person  {

      private   ArrayList<Double> notes = new ArrayList<>();
      private  Classe Classes;

    public Student(int id, String firstName, String lastName, String email, ArrayList<Double> notes, Classe classes) {
        super(id, firstName, lastName, email);
        this.notes = notes;
        Classes = classes;
    }



    public Student() {
    }


    public  ArrayList<Double> getNotes() {
        return notes;
    }

    public  void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public Classe getClasses() {
        return Classes;
    }

    public void setClasses(Classe classes) {
        Classes = classes;
    }
}