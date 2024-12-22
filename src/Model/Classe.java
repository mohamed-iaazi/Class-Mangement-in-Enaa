package Model;

import java.util.ArrayList;

public class Classe {

    private ArrayList<Student> students;
    private Trainer Trainers;
    private String ClassName;
    private int Id;

    public Classe(int id, String className,ArrayList<Student> students,Trainer trainer) {
        Id = id;
        ClassName = className;
        this.students=students;
        this.Trainers=trainer;
    }

    public  Classe(){

    }

    public  ArrayList<Student> getStudents() {
        return students;
    }

    public  void setStudents(ArrayList<Student> students) {
        students = students;
    }


    public Trainer getTrainers() {
        return Trainers;
    }

    public void setTrainers(Trainer trainers) {
        Trainers = trainers;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
