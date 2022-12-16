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
    // declare varaible "price" with int data type
    private int price;
    // declare varaible "disc" with int data type
    private int disc;
    // declare varaible "total" with int data type
    private int total;

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
    
}
