package com.techyugadi.examples.lambda;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;

public class LambdaTest {
	
   @Test
   public void testCalculateRevenue() {
      List<Integer> deals = Arrays.asList(300);
      assertEquals(28800,LambdaExample.calculateTotalRevenue(deals));
   }
}
