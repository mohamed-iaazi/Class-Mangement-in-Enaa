package Model;

import java.util.ArrayList;

public class Class extends Person{


    private  ArrayList<Student> students =new ArrayList<>();
    private String Trainers ;


    @Override
    public boolean Display() {
        return false;
    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {

    }

    @Override
    public void Delete(int Id) {

    }

    @Override
    public void Add(int Id, String f, String l, String Email, int Phone, int N_Class, String Trainer) {


    }

    @Override
    public void Update(int Id, String f, String l, String Email, int Phone, int Salary, String sp, int N_Class) {

    }


}
