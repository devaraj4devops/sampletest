package com.pp.test;

import junit.framework.TestCase;

public class MyTest extends TestCase {
   protected int value1, value2;
      protected int num1, num2;
   
   // assigning the values
   protected void setUp(){
      value1 = 3;
      value2 = 3;
	  
	  num1 = 10;
      num2 = 2;
   }

   // test method to add two numbers
   public void testAdd(){
      double result = value1 + value2;
      assertTrue(result == 6);
   }
   // test method to multiply two numbers
   public void testAdd1(){
      double result = value1 * value2;
      assertTrue(result == 9);
   }
   // test method to substract two numbers
   public void testAdd2(){
      double result = num1 - num2;
      assertTrue(result == 8);
   }
   // test method to divizen two numbers
   public void testAdd3(){
      double result = num1 / num2;
      assertTrue(result == 5);
   }
   
}
