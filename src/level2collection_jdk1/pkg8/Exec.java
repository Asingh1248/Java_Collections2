/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2collection_jdk1.pkg8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author animesh
 */
public class Exec {
    public static void main(String[] args) {
        Student s=new Student("H234");
        Student s2=new Student("H234");
//        java9's
        System.out.println(s.equals(s2));
//       Run implicit def of equals provided by Oject class

//How it Effects Collection

Map<Student,ReportCard>studentsReport=new HashMap<Student,ReportCard>();
studentsReport.put(s,new ReportCard());
studentsReport.put(s2,new ReportCard());

//s and s2 represent only one student--"H234" and hence only one Report Card should be there

        System.out.println(studentsReport.size());
//    Just to check how many key value pairs are there
//check first O/P:and then second 

//Equals and HashCOde--Helping Collection to avoid any duplicate coming in DataStructure
//and help retrieve object as soon as possibe

//Why hashCode
//COllection uses specific startegy to reach out obeject as soon as possible
 

//10 ojects --3 Bucket
//1-5 6-10 11-15 
//1 6 7 9 11 14 15 --Collection please store this object in DS
//Collection store in individual buckets
//object 13 do not check this 2 bucket

//Part 2:How HashCode Improve Performance

        
        Set<Student>studentSet=new HashSet<Student>();
        for(int i=0;i<100;i++){
            studentSet.add(new Student("H" + i));
            
        }
        System.out.println(studentSet.size()); 
//        
//        Retrieve Object
        long startTime=System.nanoTime();
        System.out.println(studentSet.contains(new Student("H4")));
        System.out.println("Elapsed time "+(System.nanoTime()-startTime));
        
        Student s4=new Student("H234");
        System.out.println(s.equals(s));
        System.out.println(s.equals(s2)+ "---"+s2.equals(s));
        System.out.println(s.equals(s2)+ "---"+s2.equals(s4) + "---"+s.equals(s4));
        System.out.println(s.equals(null));
        
// V.imp last      if Objects are equals then hashCode should be equal(Threfore Provide own Implementation)
        
//        Check Whether H4 is present or not
//        Return Constant from HashCode Time is More 3x
//        Right Implementation of Equals and HashCode

//    Usuage and Importance in Project
//  Application:Student Table PK,Name,Age--Server1
//   JavaApp--Each Row ka Object--Server2
// Network Call(Avoid Network) ORM--Hibernate --Collection of Object
// Row .Equals and HashCode--Java Collection
// People working ORM

    }
     
    
}
