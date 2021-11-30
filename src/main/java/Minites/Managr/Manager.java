package Minites.Managr;

import Minites.Student.Student;

import java.util.List;

public interface Manager <T>  {
    List<Student> findAll();

    void add (T t);
    int find (int id);
    void update (int id,T t);
    void delete (int id);
}
