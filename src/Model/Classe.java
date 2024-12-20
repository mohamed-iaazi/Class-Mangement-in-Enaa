package Model;

import java.util.ArrayList;

public class Classe {


    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Classe> classes=new ArrayList<>();
    private Trainer Trainers;
    private String ClassName;
    private int Id;

    public Classe(int id, String className) {
        Id = id;
        ClassName = className;
    }

    public  Classe(){

    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        Classe.students = students;
    }

    public static ArrayList<Classe> getClasses() {
        return classes;
    }

    public static void setClasses(ArrayList<Classe> classes) {
        Classe.classes = classes;
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
