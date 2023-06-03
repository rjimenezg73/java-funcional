package com.java.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo02 {
   public static void main(String[] args) {
      List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
      List<Integer> vehiclesLength = new ArrayList<Integer>();

      // Before Java 8, without stream
      /*for (String name: vehicles) {
         System.out.print(name.length() + "\t");
      }*/

      // Using stream
      /*vehiclesLength = vehicles.stream().map(len -> len.length()).collect(Collectors.toList());
      System.out.println(vehiclesLength);*/

      //vehicles.stream().map(var -> var.length()).forEach(System.out::println);

      vehicles.stream().map(var -> var.length()).forEach(len -> System.out.println(len));



   }
}
