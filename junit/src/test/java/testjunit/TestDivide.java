package testjunit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import testjunitCode.dollarToRupee;

@RunWith(Parameterized.class)
public class TestDivide {

	
	
	private double input;
	private double expectedOutput;
	
	
	public TestDivide(double input, double expectedOutput) {
		super();
		
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<Double[]> testConditions(){
		Double expectedOp[][] = {
				{10.0, 756.5}, 
				{5.0, 378.25},
				{1.0, 72.6}};
		
		return Arrays.asList(expectedOp);
		
	}
	@Test
	public void testDollar() {
		dollarToRupee dr = new dollarToRupee();
		double expected = expectedOutput;
		double actual = dr.dollarToRupees(input);
		
		assertEquals(expected, actual, 0.0001);
	}

}
