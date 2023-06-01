package com.prfuncional.chapter00;

@FunctionalInterface
public interface Operation {

   float Operation(); // Se crea ésto abstracto para que no marque error @FunctionalInterface
   // Ya que una interfaz necesita un método abstracto (Solo uno)

   private void interfacePrivateMethod(){
      System.out.println("Llamando al método privado de una interfaz");
      interfaceStaticMethod();
   }

   static void interfaceStaticMethod(){
      System.out.println("Llamando al método estático de una interfaz");
   }

   default void interfaceDefaultMethod(){
      interfacePrivateMethod();
      interfaceStaticMethod();
      System.out.println("Llamando al método default de una interfaz");
   }

}
