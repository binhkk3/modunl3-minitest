package Minites.Managr;

import Minites.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentIPLMManager implements Manager {
List<Student> students;
public StudentIPLMManager(){
students = new ArrayList<>();
students.add(new Student(1,"lươn van leo",4,6,3));
students.add(new Student(2,"lươn van leo",6,9,6));
students.add(new Student(3,"lươn van leo",8,3,4));
students.add(new Student(4,"lươn van leo",6,5,6));
students.add(new Student(5,"lươn van leo",3,6,8));
students.add(new Student(6,"lươn van leo",2,10,8));
}

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public int find(int id) {
        return 0;
    }

    @Override
    public void update(int id, Object o) {

    }

    @Override
    public void delete(int id) {

    }
}
