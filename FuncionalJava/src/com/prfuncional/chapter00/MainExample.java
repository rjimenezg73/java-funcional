package com.prfuncional.chapter00;

public class MainExample implements Operation{

   /**
    *
    * Programación Funcional: Se trabaja con funciones, Qué se hace... (Declarativa) , no el
    * Cómo se hace... (Imperativo), Menos propensa a errores, ya que evita los denominados
    * efectos secundarios (por tanto son funciones puras). Más abstracta.
    *
    * Mayor trabajo para el compilador.
    *
    */

   public MainExample(){
      Operation.interfaceStaticMethod();
      // Para invocar otros métodos de la interface debemos usar implements.
      interfaceDefaultMethod();
   }

   public static void main(String[] args) {
      new MainExample();
   }

   @Override
   public float Operation() {
      return 0;
   }
}
