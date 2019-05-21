package ir.maktab.model.dao;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "teacher_code", nullable = false, unique = true)
    private String teacherCode;

    @Column(name = "salary",nullable = false)
    private double salary;

    @Column(name = "birth_day")
    private LocalDate birthDay;
    // constructor
    public Teacher(String firstName, String last_name, String teacherCode, double salary, LocalDate birthDay) {
        this.firstName = firstName;
        this.last_name = last_name;
        this.teacherCode = teacherCode;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    public Teacher() {
    }

    // setter and getter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

        // Override toString
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", last_name='" + last_name + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                ", salary=" + salary +
                ", birthDay=" + birthDay +
                '}';
    }
}
