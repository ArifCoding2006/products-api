package uk.ac.westminster.products_api;

public class Product {

    public Long id; //this is what sets the ID variable and the "Long" allows the variable entered to be long and have several numbers/letters
    public String name; //this is what sets the name variable and the name is a "String" which allows the data to be text entered from the user
    public double price; //this is what sets the price variable and the "double" allows the price to have decimal numbers e.g. 24.99

    public Product (Long id, String name, double price) {
        this.id = id;
        this .name = name;
        this.price = price;
//the code above is a contrusctor for the Product class.
//this sets the products' id, name, and price when a new product is created.
//The constructor takes three values: an ID of type Long, a name of type String, and a price of type double.
//It assigns these values to the object’s fields. The keyword this refers to the current object, so this.id = id sets the object’s ID to the ID passed into the constructor.




    }



}
