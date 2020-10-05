package bo.edu.ucb.demo.Backend.model;
// ORM: Mapeo Objeto Relacional
// POJO: Plain Old Java Object

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    @Column(name = "student_id")
    @Basic(optional = false)
    private Integer studentId;
    @Column(name = "full_name")
    @Basic(optional = false)
    private String fullName;

    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer contactId) {
        this.studentId = contactId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName) {
        this.fullName = firstName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                '}';
    }

}