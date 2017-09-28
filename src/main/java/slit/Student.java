package slit;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String name;
    private String address;

    public Student(String name, String addr){
        this.name = name;
        this.address = addr;
        }
}
