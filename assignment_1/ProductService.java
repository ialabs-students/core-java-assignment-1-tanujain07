package assignment_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductService {
   
    Product product;
    public static HashMap<Integer, Product> productsList = Product.getProductsList();
    String prodName;
    double temp = 0.00;
    Product product_object, temp_obj;

   
    ArrayList<Product> newList = new ArrayList<>();

    public String findNameByCode(int productCode) {
         try {
            for(Map.Entry<Integer, Product> entry:productsList.entrySet()){    
                int key=entry.getKey();  
                Product b=entry.getValue();  
                if (productCode == b.getProductCode()) {
                    prodName = b.getName();
                } 
            }    }
             catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
            return ("Product Name: " + prodName);
    }


    public Product findMaxPriceProduct(String catagory) {

        try {
            for(Map.Entry<Integer, Product> entry:productsList.entrySet()){    
                int key=entry.getKey();  
                Product b=entry.getValue();  
                if (catagory == b.getCategory()) {
                                    product_object = b;
                                    if (temp < b.getPrice()) {
                                        temp = b.getPrice();
                                        temp_obj = b;
                                    }
                                } else {
                                    product_object = null;
                                }
            }    }
             catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
            return (temp_obj);

    }

    
    public ArrayList<Product> getProductsByCategory(String catagory) {
        try {
            for(Map.Entry<Integer, Product> entry:productsList.entrySet()){    
                int key=entry.getKey();  
                Product b=entry.getValue();  
                if (catagory == b.getCategory()) {
                                    newList.add(b);
                                } else {
                                    product_object = null;
                                }
            }    
        }
             catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
            return newList;
    }
}
