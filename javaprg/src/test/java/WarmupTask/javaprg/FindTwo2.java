package WarmupTask.javaprg;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindTwo2 {
	
	public ArrayList<Integer> two2(ArrayList<Integer> al) {
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		int res=0;
		for(int n : al) {
			res = n*2;
			if(res%10!=2) {
				output.add(res);
				
			}
		}
		System.out.println(output);
		return output;
	}
	
	
	@Test
	public void testCase1() {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(0);
		al.add(66);
		al.add(1);
		ArrayList<Integer> expected = two2(al);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual.add(0);
		Assert.assertEquals(actual, expected);
	}

}
