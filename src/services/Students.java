package services;

import Model.Person;
import Model.Student;
import Utils.Input;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Students {

    static ArrayList<Student> list = new ArrayList<>();


    public static void AddSt(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {

        list.add(new Student(Id, f, l, Email, Phone, N_Class, Trainer));
    }

    public static boolean display() {
        if (list.isEmpty()) {
            System.out.println("\n\n   Ops No Student To Display ");
            return false;
        } else {
            for (Student s : list) {
                s.Display();
            }
            return true;
        }
    }

    public static void delete(int id) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                id = i;
                found = true;
            }
        }
        if (found) {
            list.remove(id);
            System.out.println("\n\n      Deleted With Success");

        } else {
            System.out.println("\n\n      Ops Not Found");
        }
    }

    public static void Update(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {
        boolean ishere=false;
        for (int i = 0; i < list.size(); i++) {
            if (Id == list.get(i).getId()) {
                list.add(Id,new Student(Id, f, l, Email, Phone, N_Class, Trainer));
                ishere=true;
            }

        }

        if (ishere){
            System.out.println("\n\n   Your Student Update With Success");
        }
        else {
            System.out.println("\n\n   Ops Not Found !");

        }
    }
}

