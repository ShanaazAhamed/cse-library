package it.uom.cse;

import java.util.Arrays;


    public class MathOperation {

    public static int sumOfIntegers(int n){
        int sum=0;
        for (int i =0; i<n+1; i++){
            sum+=i;
        };
        return sum;
    };

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }
    public static int sumOfPrimes(n){
	    int i, number, count, sum = 0

			for(number = 1; number <= 100; number++)
			{
				count = 0;
			    for (i = 2; i <= number/2; i++)
			    {
			    	if(number % i == 0)
			    	{
			    		count++;
			    		break;
			    	}
			    }
			    if(count == 0 && number != 1 )
			    {
			    	sum = sum + number;
			    }
			}
             System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
             }
             }

}
