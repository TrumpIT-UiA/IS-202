package slit;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private int student_id;
    private String name;
    private String address;

    public Student(int id, String name, String addr){
        this.student_id = id;
        this.name = name;
        this.address = addr;
        }
}
