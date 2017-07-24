package com.kgfsl.santosh;
import java.util.ArrayList;
import java.util.List;
//import com.kgfsl.predicate.Student;
public class Department {
private String name;
private List<Student> students;
Department(String name,List<Student> students)
{
 this.name=name;
 this.students=students;
}
public String getName()
{
    return name;
}
public List<Student> getStudent()
{

    return students;
}
public String toString()
{
    return "Dept Name: " +name+  "student:"+students;
}
}