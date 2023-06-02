package com.java.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo03 {
   public static void main(String[] args) {
      List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre");

      // Lo que se desea es remover los nulls de la coleccion
      List<String> wordsWithoutNulls = new ArrayList<String>();

      wordsWithoutNulls = words.stream().filter(str -> str != null).collect(Collectors.toList());
      System.out.println(wordsWithoutNulls);
   }
}
