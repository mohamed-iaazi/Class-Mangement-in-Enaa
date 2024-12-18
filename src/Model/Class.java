package Model;

import java.util.ArrayList;

public class Class {


    private  ArrayList<Student> students =new ArrayList<>();
    private String Trainers ;
    private  String ClassName;
    private  int Id;


    public Class(ArrayList<Student> students, String trainers, String className, int id) {
        this.students = students;
        Trainers = trainers;
        ClassName = className;
        Id = id;
    }


}
