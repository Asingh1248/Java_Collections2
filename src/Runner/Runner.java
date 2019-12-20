/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import java.util.*;

/**
 *
 * @author animesh
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Laptop> laps=new ArrayList<Laptop>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));
        
//       Now we want to sort the values--Integer
//      Just tkae the logic for sort

Comparator<Laptop> con=new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2)
            {
                if(o1.getPrice()>o2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };
Collections.sort(laps,con);
//In this case it won't work--Works on Paramater
//On which Parameter may be on Brand
//implement Comparable in Laptop
//Specify the Logic
        for(Laptop l:laps){
            System.out.println(l);
//            System.out.println(l.getBrand()+ " "+l.getPrice()+ " "+l.getRam());
//Scenario 1:

//        What if Class Laptop doesn't impplements any interface
// in this scenarion we can't sort the value
//When it can Happen:When get this class from other library and you can't change the source code of the library
  
//Scenario 2:Sort on the Price--Multiple 
//Scenario 3:UserDefined Logic for SOrting
        }
    }
    
}
