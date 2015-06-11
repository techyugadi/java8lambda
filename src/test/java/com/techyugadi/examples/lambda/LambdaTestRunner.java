package com.techyugadi.examples.lambda;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class LambdaTestRunner {
   public static void main(String args[]) {
      Result result = JUnitCore.runClasses(LambdaTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}  	
