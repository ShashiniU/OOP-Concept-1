/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.io.PrintStream;

class Product{
    //attributed section
    int pid;
    String name;
    int price;
    
    
    //constructor section
    
    Product(){
        System.out.println("product");
    }
    //methods
    
    void setProductDetails(String name, int pid, int price)
    {
        this.name = name;
        this.pid = pid;
        this.price= price;
    }
    //to read data from product
    
    void showProductDetails(){
        System.out.println("******Product id: " +pid+"******");
        System.out.println("******Product name: " +name+"******");
        System.out.println("******Product price: " +price+"******");
        System.out.println("*********************");
    }

   
}

class Product2{
     int pid;
    String name;
    int price;
    String brandname;
    
    Product2(){
        System.out.println("product");
    }
    //methods
    
    void setProductDetails(String name, int pid, int price, String brandname)
    {
        this.name = name;
        this.pid = pid;
        this.price= price;
        this.brandname = brandname;
    }
    //to read data from product
    
    void showProductDetails(){
        System.out.println("******Product id: " +pid+"******");
        System.out.println("******Product name: " +name+"******");
        System.out.println("******Product price: " +price+"******");
         System.out.println("******Product price: " +brandname+"******");
        System.out.println("*********************");
    }
    
}

public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//create an object(product)
Product product1 = new Product();
//output the product
System.out.println("Product is : "+product1+"****");
//writiing data in object
product1.setProductDetails("IPhone   ", 101, 2500);
product1.showProductDetails();


Product product2 = new Product();
//output the product
System.out.println("Product is : "+product2+"****");
//writiing data in object
product2.setProductDetails("tv   ", 102, 3500);
product2.showProductDetails();

Product2 product3 = new Product2();
product3.setProductDetails("tv", 105, 50000, "sony");
product3.showProductDetails();//output the product

//writiing data in object



    }
    
}
