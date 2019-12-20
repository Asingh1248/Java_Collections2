/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2collection_jdk1.pkg8;

import java.util.Objects;

/**
 *
 * @author animesh
 */
public class Student {

    private String RegistrationNumber;

    public Student(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }
   
//    Own Implementation of equal
    
    @Override
    public boolean equals(Object obj) {
//        System.out.println("From Map");
        if (obj != null && obj instanceof Student) {
            String regNumber = ((Student) obj).getRegistrationNumber();
            if (regNumber != null && regNumber.equals(this.getRegistrationNumber())) {
                return true;
            }

        }
        return false;
    }
//  Return some unique number for each instance
    
    public int hashCode(){
//        System.out.println("From Map..");
//        System.out.println(this.RegistrationNumber.hashCode());
       return this.RegistrationNumber.hashCode();
//      Each RegistrationNumber String will be Different
// If two Ojects are equal they should return same Number
//    return 3;
//    It's not Unique and constant --Wrong Implementation Time is Increased
    }
}