package WarmupTask.javaprg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Make2Numbers {
	
	public int[] make2(int[] a,int[] b) {
		
		int []result = new int[2];
		
		int len = a.length;
		
		if(len>=2) {
			for(int j=0;j<2;j++)
			result[j] = a[j];
		}else if(len==1) {
		
				result[0] = a[0];
				result[1]=b[0];
		}else {
			for(int j=0;j<2;j++) {
				result[j]=b[j];
			}
		}
		for(int i=0;i<2;i++) {
			System.out.println(result[i]);
		}
	return result;		
	}
	
	
	
	
	@Test
	public void testCase1() {
		int[] a= {};
		int[] b= {1,2};
		
		int[] output = make2(a,b);
		int[] expected = {1,2};
		Assert.assertEquals(output, expected);
	}
	
	@Test
	public void testCase2() {
		int[] a= {4,5};
		int[] b= {1,2,3};
		
		int[] output = make2(a,b);
		int[] expected = {4,5};
		Assert.assertEquals(output, expected);
	}
	
	@Test
	public void testCase3() {
		int[] a= {4};
		int[] b= {1,2,3};
		
		int[] output = make2(a,b);
		int[] expected = {4,1};
		Assert.assertEquals(output, expected);
	}
	@Test
	public void testCase4() {
		int[] a= {1};
		int[] b= {};
		
		int[] output = make2(a,b);
		int[] expected = {};
		Assert.assertEquals(output, expected);
	}

}
