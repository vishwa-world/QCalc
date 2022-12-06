
package com.crio.qcalc;


public class App {


   public static void main(String[] args) {

       System.out.println("Starting QCalc..");


       StandardCalculator calc = new StandardCalculator();

       calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
       
       calc.printResult();
       

   }


}
