package pl.pw;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "emp_name", nullable = false, columnDefinition = "VARCHAR(68) NOT NULL")
    private String name;

    @Column(name = "emp_surname", nullable = false, columnDefinition = "VARCHAR(68) NOT NULL")
    private String surname;

    @Column(name = "emp_pesel", unique = true, length = 11)
    private long pesel;

    public Employee(String name, String surname, long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getPesel() == employee.getPesel() &&
                getId().equals(employee.getId()) &&
                getName().equals(employee.getName()) &&
                getSurname().equals(employee.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getPesel());
    }
}
