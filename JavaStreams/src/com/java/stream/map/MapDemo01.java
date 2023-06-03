package com.java.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**}
 * Map transforma los datos u objetos, mientras que Filter filtra los datos en base a una condición
 */

public class MapDemo01 {
   public static void main(String[] args) {
      List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
      List<String> vehiclesListinUpperCase = new ArrayList<String>();

      // Before java 8, without using streams
      /*
      for (String name: vehicles) {
         vehiclesListinUpperCase.add(name.toUpperCase());
      }*/

      // Using stream - map
      vehiclesListinUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

      System.out.println(vehiclesListinUpperCase);
   }
}
