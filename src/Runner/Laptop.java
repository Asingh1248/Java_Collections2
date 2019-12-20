/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

/**
 *
 * @author animesh
 */
//public class Laptop implements  Comparable<Laptop>{
public class Laptop {
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + brand + ", ram=" + ram + ", price=" + price + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    @Override
//    public int compareTo(Laptop o) {
////        When to swap and when not to swap
////Passing one Object+compareTo to 
////     if first object > second object return 1 else -1
//    if(this.getRam()>o.getRam())
//        return 1;
//    else
//        return -1;
//             
//       
//    }
    
}
