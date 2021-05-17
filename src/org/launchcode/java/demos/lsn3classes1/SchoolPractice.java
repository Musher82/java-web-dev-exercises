package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student = new Student ();
        student.setName("Micah");
        student.setNumberOfCredits(1);
        student.setGpa(4.0);
    }
}

class Course{
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;
}

class Teacher{
 private String firstName;
 private String lastName;
 private String subject;
 private int yearsTeaching = 0;

 public void setFirstName(String firstName){
     this.firstName = firstName;
    }

 public void setLastName(String lastName){
     this.lastName = lastName;
 }

 public void setSubject(String subject){
     this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching){
     this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName(){
     return firstName;
    }

    public String getLastName(){
     return lastName;
    }

    private int getYearsTeaching(){
     return yearsTeaching;
    }
}
