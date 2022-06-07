package assignment_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Product {
    // Data members
    private int productCode;
    private String name;
    private double price;
    private String category;

    // Parameterised constructor
    public Product(int productCode, String name, double price, String category) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters
    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static HashMap<Integer, Product> getProductsList() {
        // Creating user defined Product Hash List

        
        HashMap<Integer, Product> productsList = new HashMap<Integer, Product>();
        Product P1 = new Product(01, "Heated Hair Straightening Brush", 2475.00, "Electronic Gadget");
        Product P2 = new Product(02, "Amazon Prime", 999.00, "Premium Accounts");
        Product P3 = new Product(03, "3D Butterfly", 2999.00, "Home Decor");
        Product P4 = new Product(04, "Carpet", 1559.00, "Furnishing");
        Product P5 = new Product(05, "Food Oil", 6999.00, "Grocery");
        Product P6 = new Product(06, "MAC Foundation", 27999.00, "Beauty Products");
        Product P7 = new Product(07, "UNO", 199.00, "Fun");
        Product P8 = new Product(012, "Refrigerators", 15000.00, "Appliences");
        Product P9 = new Product(013, "Gold Earings", 39007.00, "Jewellery");

        // Adding products to the list
        productsList.put(1,P1);
        productsList.put(2,P2);
        productsList.put(3,P3);
        productsList.put(4,P4);
        productsList.put(5,P5);
        productsList.put(6,P6);
        productsList.put(7,P7);
        productsList.put(8,P8);
        productsList.put(9,P9);
        return productsList;
    }

    public static void main(String[] args) {

        // Creating the object of the product service!
        ProductService productService = new ProductService();

       
        String prodName = productService.findNameByCode(03);
        System.out.println(prodName);

        
        Product product_obj = productService.findMaxPriceProduct("Home Decor");
        System.out.println(product_obj);

        
        ArrayList<Product> products = productService.getProductsByCategory("Home Decor");
        if (products != null) {
            Iterator itr = products.iterator();
            while (itr.hasNext()) {
                Product product = (Product) itr.next();
                System.out.println("[ product code: " + product.getProductCode() + ", product name: "
                        + product.getName() + ", product price: Rs." + product.getPrice() + ", product catagory: "
                        + product.getCategory() + " ]");
            }
        }
    }
}