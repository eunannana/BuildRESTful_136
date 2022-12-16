/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// declare model package
package model;

/**
 *
 * @author eunannana
 */
// declare Product class
public class Product {
    // declare varaible "ID" with String data type
    private String id;
    // declare varaible "name" with String data type
    private String name;
    // declare varaible "price" with Double data type
    private Double price;
    // declare varaible "disc" with Double data type
    private Double disc;
    // declare varaible "total" with Double data type
    private Double total;

    // declare getId method
    public String getId() {
        // return for getId
        return id;
    }

    // declare setID method with id variable
    public void setId(String id) {
        // declare the ID
        this.id = id;
    }

    // declare getName method
    public String getName() {
        // return for getName
        return name;
    }

    // declare setName method with name variable
    public void setName(String name) {
        // declare the name
        this.name = name;
    }

    // declare getPrice method 
    public Double getPrice() {
        // return for getPrice
        return price;
    }

    // declare setPrice method with price variable
    public void setPrice(Double price) {
        // declare the price
        this.price = price;
    }

   // declare getDisc method
    public Double getDisc() {
        // return for getDisc
        return disc;
    }

    // declare setDisc method with disc variable 
    public void setDisc(Double disc) {
        // declare the disc
        this.disc = disc;
    }

    // declare getTotal method
    public Double getTotal() {
        // return for getTotal
        return total ;
    }

    // declare setTotal method 
    public void setTotal(Double total) {
        // declare for total and make the calculation using price and discount
        this.total = total;
    }

  


    
}
