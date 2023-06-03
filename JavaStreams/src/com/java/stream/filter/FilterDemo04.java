package com.java.stream.filter;

import java.util.ArrayList;
import java.util.List;

class Product{
   int id;
   String name;
   double price;

   public Product(int id, String name, double price){
      this.id = id;
      this.name = name;
      this.price = price;
   }
}

public class FilterDemo04 {
   public static void main(String[] args) {

      List<Product> productsList = new ArrayList<Product>();

      productsList.add(new Product(1, "HP Laptop", 25000));
      productsList.add(new Product(2, "Dell Laptop", 30000));
      productsList.add(new Product(3, "Lenova Laptop", 28000));
      productsList.add(new Product(4, "Sony Laptop", 23000));
      productsList.add(new Product(5, "Apple Laptop", 90000));

      // Imprime los precios de aquellos productos superiores a 25000
      productsList.stream()
              .filter(producto -> producto.price > 25000)
              .forEach(precio -> System.out.println(precio.price));


   }
}
