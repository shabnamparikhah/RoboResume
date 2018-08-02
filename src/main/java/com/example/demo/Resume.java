package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String emailaddress;

    @NotNull
    private String educationalachievements;

    @NotNull
    private String workexperiences;

    @NotNull
    private String skills;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getEducationalachievements() {
        return educationalachievements;
    }

    public void setEducationalachievements(String educationalachievements) {
        this.educationalachievements = educationalachievements;
    }

    public String getWorkexperiences() {
        return workexperiences;
    }

    public void setWorkexperiences(String workexperiences) {
        this.workexperiences = workexperiences;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
