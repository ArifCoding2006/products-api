package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping; //Connects an HTTP GET request, such as fetching products, to a method.
import org.springframework.web.bind.annotation.PathVariable; //Takes a value from the URL and passes it into a method parameter
import org.springframework.web.bind.annotation.RequestMapping; //Sets the URL path for a controller or method
import org.springframework.web.bind.annotation.RestController; //Marks a class as a controller whose methods return data to the response body

@RestController //Tells Spring this class handles web requests and returns data in JSON
@RequestMapping("/products") //Sets base URL for controller to /products
public class ProductController{ //Declares controller class

    @GetMapping("/{id}") //Handles GET requests to /products/id
    public Product getById(@PathVariable Long id){ // Takes the ID from the URL and puts it into the id parameter and declares method named getById that returns Product object
        return new Product (id, "Laptop",999.99); //Creates and returns a product with an ID, the name "Laptop" and a price of 999.99

//the code above defines a controller that handles requests for products




    }


}