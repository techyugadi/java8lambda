package com.techyugadi.examples.lambda;

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;

/*
 * Scenario: An ISV sells a service on the cloud.
 * The pricing is based on number of users licensed to access the service.
 * If number of users < 100, the service is priced at $ 100 per user
 * If number of users >= 100 and < 500, the service is priced at $ 80 per user
 * If number of users >= 500, the service is priced at $ 60 per user
 *
 * The total revenue from a deal is calculated as:
 * (Price per user)*(Number of users) + 0.2*(Price per user)*(Number of users)
 * 20 per cent of the licence price is added for Customer Support
 *
 * Using Lambda Expressions, we will calculate the total revenues from given
 * list of deal sizes (in terms of number of licensed users)
 */
public class LambdaExample {

    public static int revenue = 0;
    public static int calculateTotalRevenue(List<Integer> deals) {

	Predicate<Integer> lessThan100 = (n) -> n < 100;
	Predicate<Integer> betn100And500 = (n) -> n >= 100 && n < 500;
	Predicate<Integer> moreThan500 = (n) -> n >= 500;

	deals.stream()
	     .filter(lessThan100)
	     .forEach((n) ->  {revenue += (n*100 + 0.2*n*100);}); 

	deals.stream()
	     .filter(betn100And500)
	     .forEach((n) ->  {revenue += (n*80 + 0.2*n*80);}); 

	deals.stream()
	     .filter(moreThan500)
	     .forEach((n) ->  {revenue += (n*60 + 0.2*n*60);}); 

	return revenue;

    }

    public static void main(String args[]) {
	List<Integer> deals = Arrays.asList(300, 140, 27, 99, 600, 2000, 250, 350, 45);
	int calculatedRevenue = LambdaExample.calculateTotalRevenue(deals);
	System.out.println("Total Revenue (in $): " + calculatedRevenue);

    }
}
