package com.java.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo02 {
   public static void main(String[] args) {
      List<String> names = Arrays.asList("Peter Pan", "Piolín", "Pedrito Pica Cu", "Yamada Alan", "Gaviota");
      List<String> longNames = new ArrayList<String>();

      /*longNames = names.stream().filter(str -> str.length() > 7).collect(Collectors.toList());
      System.out.println(longNames);*/

      // Otra forma
      /*names.stream().filter(str -> str.length() > 7).forEach(s -> System.out.println(s));*/

      // Algo parecido a lo anterior
      names.stream().filter(s -> s.length() > 7).forEach(System.out::println);
   }
}
