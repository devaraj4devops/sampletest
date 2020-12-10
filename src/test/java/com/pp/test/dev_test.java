package com.pp.test;

import junit.framework.TestCase;

public class dev_test extends TestCase {
   protected int num1, num2;
   
   // assigning the values
   protected void setUp(){
      num1 = 10;
      num2 = 2;
   }

   // test method to add two values
   public void testAdd5(){
      double result = num1 + num2;
      assertTrue(result == 12);
   }
   public void testsub(){
      double result = num1 - num2;
      assertTrue(result == 8);
   }
      public void testAdd7(){
      double result = num1 * num2;
      assertTrue(result == 20);
   }
   
   
}
