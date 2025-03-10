package com.edu.seu.librarymanagementsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "student")
public class Student implements Serializable {
    @Id
    private String id;
    @Indexed(unique = true)
    private int studentId;
    private String name;
    private String department;
    private String phoneNumber;
    @Indexed(unique = true)
    private String email;
    private String presentAdress;
    private String permanentAdress;

    public Student() {
    }

    public Student(String id, int studentId, String name, String department, String phoneNumber, String email, String presentAdress, String permanentAdress) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.presentAdress = presentAdress;
        this.permanentAdress = permanentAdress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPresentAdress() {
        return presentAdress;
    }

    public void setPresentAdress(String presentAdress) {
        this.presentAdress = presentAdress;
    }

    public String getPermanentAdress() {
        return permanentAdress;
    }

    public void setPermanentAdress(String permanentAdress) {
        this.permanentAdress = permanentAdress;
    }
}
