package Model;

import java.util.ArrayList;

public class Trainer extends Person {
    private   int salary;
    private   String sp;
    private  Classe Classe;
   private   static ArrayList<Trainer> TrainersList=new ArrayList<>();

    public Trainer(int id, String firstName, String lastName, String email,int salary, String sp) {
        super(id, firstName, lastName, email);
        this.salary = salary;
        this.sp = sp;
    }
    public Trainer(){

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }


    public Classe getClasse() {
        return Classe;
    }

    public void setClasse(Classe classe) {
        Classe = classe;
    }

    public static ArrayList<Trainer> getTrainersList() {
        return TrainersList;
    }

    public static void setTrainersList(ArrayList<Trainer> trainersList) {
        TrainersList = trainersList;
    }
}
