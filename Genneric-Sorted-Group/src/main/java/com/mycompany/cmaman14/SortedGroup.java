/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cmaman14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;


/**
 *
 * @author abargel_ido
 */
public class SortedGroup<T extends Comparable<T>>  {
public static final int LOWER=-1,EQUAL = 0, GREATER = 1;

    public ArrayList<T> collection;     //generic collection

    
    public SortedGroup()        //builder
    {
        this.collection = new ArrayList<T>();
    }
    
    //function that adds a new value to the collection
    public void add(T o)   
    {
        int i =0;
        for (T t:collection)    //generic for that checks where to add the attached value
        {
            if(t.compareTo(o)==LOWER)  //o is smaller than t
            {
                this.collection.add(i, o);//add it to the place of t
                return;
            }
            i++;
        }
        this.collection.add(o);// o is the greatest, add is in the end
        
    }
    
    //function that removes the attached item from the collection, could be more than 1 item in the collection
    public int remove(T o)
    {
        
        int i = collection.size();
        Iterator<T> itr = this.iterator();  //create iterator
        
        while (itr.hasNext()) //going throw the collection           
                if(itr.next().toString().equals(o.toString()))  //if equal than remove
                     itr.remove();                
            

        i= i-collection.size();
        
        System.out.println("\n"+i+" items were deleted");
        return i;   //remove the amount of items that were removed
    }
    
    //function that returns the iterator
    public <T> T iterator()
    {
       return (T) collection.iterator();
    }
}
