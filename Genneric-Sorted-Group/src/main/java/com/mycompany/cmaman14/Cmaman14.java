/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cmaman14;

import java.util.Iterator;

/**
 *
 * @author abargel_ido
 */
public class Cmaman14 {
    
public static final int LOWER=-1,EQUAL = 0, GREATER = 1;

    public static void main(String[] args) {
        
        SortedGroup<Student> stdg = new SortedGroup<Student>();   // create a new SortedGroup of Students
        SortedGroup<Student> stdg2 = new SortedGroup<Student>();  // it will include the second list
        
        addStudents(stdg);  //adding several students
        printStudents(stdg);    //print the student toString

        System.out.println("\nThe Student collection with higher grade:\n");     
        stdg2 = reduce(stdg,new Student("ido",331,63));   //reduce function
        printStudents(stdg2);
        
        stdg2.remove(new Student("Liron",1238,66)); //remove the student
        System.out.println("The Student collection after removing:\n");     
        printStudents(stdg2);
        
    }
    
    //function that return a new sortedGroup that has only the greater values than the attached variable
    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup,T t)
    {
        SortedGroup<T> str = new SortedGroup<T>();
        
        for (T o:sGroup.collection)
        {            
            if (o.compareTo(t)!=LOWER) //t is greater than o
                continue;
            str.add(o);     //adding the rest because the 
        }
        
        return str;
    }
    
    //function that adds students to the collection
    public static void addStudents(SortedGroup<Student> stdg)
    {
        stdg.add(new Student("Adi",123,70));
        stdg.add(new Student("Slomi",1234,60));
        stdg.add(new Student("Haim",1235,55));
        stdg.add(new Student("Moshe",1236,66));
        stdg.add(new Student("David",1237,35));
        stdg.add(new Student("Liron",1238,66));
         stdg.add(new Student("Liron",1238,66));
          stdg.add(new Student("Liron",1238,66));
    }
    
    // a function that prints the collection toString
    public static void printStudents(SortedGroup<Student> stdg)
    {
        Iterator<Student> itr = stdg.iterator();
        
        while (itr.hasNext())
            System.out.println(itr.next().toString());
    }
    
}