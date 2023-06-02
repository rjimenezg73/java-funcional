package com.java.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Collection - To represent a group of data/objects as simple entity.
 *
 * Stream - To process the data from collection we use streams concepts
 */

public class FilterDemo01 {
   public static void main(String[] args) {

      /*ArrayList<Integer> numberList = new ArrayList<Integer>();

      numberList.add(10);
      numberList.add(15);
      numberList.add(20);
      numberList.add(25);
      numberList.add(30);*/

      List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
      List<Integer> evenNumberList = new ArrayList<Integer>();

      // Without using Streams
      /*for (int n:numberList) {
         if(n % 2 == 0){
            evenNumberList.add(n);
         }
      }
      */

      // With Streams
      evenNumberList = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
      System.out.println(evenNumberList);
   }
}
