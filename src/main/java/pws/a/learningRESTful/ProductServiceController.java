/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// declare package
package pws.a.learningRESTful;

// declare import
import model.Product;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eunannana
 */
// declare the controller with name RestController
@RestController
// declare ProductServiceController class
public class ProductServiceController {

    // declare the static method for the first data
    private static Map<String, Product> productRepo = new HashMap<>();

    static {
        // declare data 1
        Product honey = new Product();
        // set ID data 1
        honey.setId("1");
        // set name data 1
        honey.setName("Honey");
        // declare data value
        productRepo.put(honey.getId(), honey);

        // declare data 2
        Product almond = new Product();
        // set ID data 2
        almond.setId("2");
        // set name data 2
        almond.setName("Almond");
        // declare data value 
        productRepo.put(almond.getId(), almond);
    }

    // declare RequestMapping for URL
    @RequestMapping(value = "/products")
    // declare getProducts class
    public ResponseEntity<Object> getProducts() {
        // return method for getProducts with value and HttpStatus
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    // declare RequestMapping for URL and POSTMETHOD
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    // declare createProduct class 
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        // adding if condition when adding the already exist product
        if (productRepo.containsKey(product.getId())) {
            // return method for createProduct that already exist with message and HttpStatus
            return new ResponseEntity<>("Product is already exist, please make a new one", HttpStatus.CONFLICT);
        }
        // declare data value
        productRepo.put(product.getId(), product);
        // return method for Success createProduct with message and HttpStatus
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    // declare RequestMapping for URL and PUT METHOD
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    // declare updateProduct class
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        // adding if condition when the product is not found to be updated
        if (!productRepo.containsKey(id)) {
            // return method for updateProduct that is not found with message and HttpStatus
            return new ResponseEntity<>("Product is not found", HttpStatus.NOT_FOUND);
        }
        // remove data by ID
        productRepo.remove(id);
        // declare data value
        product.setId(id);
        productRepo.put(id, product);
        // return method for Success updateProduct with message and Status
        return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    }

    // declare RequestMapping for URL and DELETE METHOD
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    // declare deleteProduct class
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id) {
        // delete data by ID
        productRepo.remove(id);
        // return method for Success deleteProduct
        return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
    }
}
