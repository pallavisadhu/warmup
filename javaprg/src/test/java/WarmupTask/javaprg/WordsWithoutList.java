package WarmupTask.javaprg;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordsWithoutList {
	
	public ArrayList<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<words.length;i++) {
			if(words[i].length()!=len) {
				al.add(words[i]);
			}
		}
		return al;
	}
	
	
	
	@Test
	public void testCase1() {
		String[] words = {"a","bb","b","ccc"};
		int len=1;
		ArrayList<String> output = wordsWithoutList(words,len);
		Assert.assertTrue(output.contains("bb"));
	}
	
	@Test
	public void testCase2() {
		String[] words = {"a","bb","b","ccc"};
		int len=3;
		ArrayList<String> output = wordsWithoutList(words,len);
		Assert.assertFalse(output.contains("ccc"));
	}

}
