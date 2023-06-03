package com.java.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo03 {
   public static void main(String[] args) {
      List<Integer> numbersList = Arrays.asList(2,3,4,5);
      List<Integer> multipliedList = new ArrayList<Integer>();

      multipliedList = numbersList.stream().map(n -> n*3).collect(Collectors.toList());
      System.out.println(multipliedList);
   }
}
