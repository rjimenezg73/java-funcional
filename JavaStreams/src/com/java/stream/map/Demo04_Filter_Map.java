package com.java.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
   int id;
   String empName;
   int salary;

   Employee(int id, String empName, int salary){
      this.id = id;
      this.empName = empName;
      this.salary = salary;
   }
}

public class Demo04_Filter_Map {
   public static void main(String[] args) {

      /*
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(101,"Juan",10000));
      employeesList.add(new Employee(101,"Juan",10000));
      employeesList.add(new Employee(101,"Juan",10000));*/

      List<Employee> employeeList = Arrays.asList(
              new Employee(101,"Juan",10000),
              new Employee(102,"Peter",15000),
              new Employee(103,"Alex",10000),
              new Employee(104,"Brian",20000),
              new Employee(105,"Charles",30000),
              new Employee(106,"David",40000),
              new Employee(107,"Edward",50000)
      );

      // Combine filter and map
      // Collection ---> stream ---> filter ---> map ---> collect
      List<Integer> empSalaryList = employeeList.stream()
              .filter(obj -> obj.salary > 15000 && obj.salary < 40000)
              .map(e -> e.salary)
              .collect(Collectors.toList());

      System.out.println(empSalaryList);

   }
}
