package WarmupTask.javaprg;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotEndingWithNine {
	
	
	public ArrayList<Integer> no9(ArrayList<Integer> input) {
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		int r = 0;
		for(int n : input) {
			if(n>0)
			r = modulus(n);
			if(r>0)
			output.add(r);
			
		}
		System.out.println(output);
		return output;
	}
	
	public int  modulus(int n) {
		if(n%10!=9) 
		return n;
		else
			return 0;
		
		
	}

	@Test
	public void testCase1() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(19);
		ArrayList<Integer> output = no9(input);
		
		Assert.assertTrue(output.size()==2);
		
	}
	
	@Test
	public void testCase2() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(9);
		input.add(19);
		input.add(29);
		input.add(3);
		ArrayList<Integer> output = no9(input);
		
		Assert.assertTrue(input.contains(3));

		
	}
	@Test
	public void testCase3() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(-1);
		input.add(-2);
		input.add(-19);
		ArrayList<Integer> output = no9(input);
		
		Assert.assertTrue(output.size()==0);

		
	}

}
