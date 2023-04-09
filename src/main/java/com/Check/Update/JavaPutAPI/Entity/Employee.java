package com.Check.Update.JavaPutAPI.Entity;

import javax.persistence.*;

@Entity
@Table(name="employeedetails")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="eid")
    int eid;

    @Column(name="Ename")
    String name;

    @Column(name="salary")
    String salary;

    @Column(name="Desination")
    String designation;

    @Column(name="Empemail")
    String empEmail;

    @Column(name="Address")
    String address;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
