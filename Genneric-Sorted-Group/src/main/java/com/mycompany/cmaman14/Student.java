/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cmaman14;

/**
 * a class of students
 * @author abargel_ido
 */
public class Student implements Comparable<Student> {
public static final int LOWER=-1,EQUAL = 0, GREATER = 1;
    
    private String name;
    private int id;
    private int grade;
    
    
    //builder
    public Student(String name,int id,int grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {   //function that copare between two students grades
        
        if (o.grade<this.grade)
            return LOWER;
        if (o.grade==this.grade)
            return EQUAL;
        
        return GREATER;
    }
    
    @Override
    public String toString()    //toString function
    {
        return "Student Name: "+name+",\t Student ID: "+id+", "
                + "\tStudent Grade: "+ grade;
                
    }
    
    
}
