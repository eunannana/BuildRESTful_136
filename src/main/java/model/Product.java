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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDisc() {
        return disc;
    }

    public void setDisc(Double disc) {
        this.disc = disc;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}
