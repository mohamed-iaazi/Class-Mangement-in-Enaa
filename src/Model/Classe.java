package Model;

import java.util.ArrayList;

public class Classe {


    private static   ArrayList<Student> students =new ArrayList<>();
    private String Trainers ;
    private  String ClassName;
    private  int Id;



    public Classe(ArrayList<Student> students, String trainers, String className, int id) {
        this.students = students;
        Trainers = trainers;
        ClassName = className;
        Id = id;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        Classe.students = students;
    }

    public String getTrainers() {
        return Trainers;
    }

    public void setTrainers(String trainers) {
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
