package codeWar6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class LexicographicalOrderTest {

	public static void main(String[] args) {
		
		String a[] = new String[] {"tarp", "mice", "bull"};
		String b[] = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
		String r[] = new String[] {};
//		LexicographicalOrderTest.inArray(a, b);
		
		nbYear(1500000, 0.001, -10000, 2000000);
//		nbYear(1500000, 0.0, 10000, 2000000);
//		nbYear(1500, 5, 100, 5000);
		
//		autocorrect("I miss you!");
	}

	public static String[] inArray(String[] array1, String[] array2) {
		System.out.println(" array1 :: "+Arrays.deepToString(array1));
		System.out.println(" array2 :: "+Arrays.deepToString(array2));
		//중복 방지를 위해서.. 다른 방법이 있는지 생각하기
		Set<String> strSet = new LinkedHashSet<>();
		
		for(String commpStr1 : array1) {
			for(String commpStr2 : array2) {
				if(commpStr2.contains(commpStr1)) {
					strSet.add(commpStr1);
				}
			}
		}
		
		String[] returnVal = new String[strSet.size()];
		
		System.out.println("strSet.size :: "+strSet.size());
		System.out.println(returnVal.toString());
		
		Iterator<String> itr = strSet.iterator();
		int i = 0;
		while(itr.hasNext()) {
			String now = itr.next();
			System.out.println("now :: "+now);
			returnVal[i] = now;
			i++;
		}
		
		System.out.println("returnVal length : "+returnVal.length);
		System.out.println(" returnVal :: "+Arrays.deepToString(returnVal));
		Arrays.sort(returnVal);
		System.out.println(" returnVal :: "+Arrays.deepToString(returnVal));
		return returnVal;
	}
	
	//growth of population
	//https://www.codewars.com/kata/growth-of-a-population/solutions/java
	public static int nbYear(int p0, double percent, int aug, int p) {
		
		int start = p0;
		int result = 0;
		int i = 0;
		
		do {
			result = start + (int)(start * percent/100) + aug;
			start = result;
			i++;
		} while(p > result);
		System.out.println("year :: "+i);
		return i;
	}
	
	//Evil Autocorrect Prank
	public static String autocorrect(String input) {
		System.out.println("input : "+input);
		input = input.toLowerCase();
		String cdTxt = "your sister";
		String result = "";
		
		for(String now : input.split(" ")) {
			if(now.equals("you") || now.equals("u")) {
				now = cdTxt;
			}
			if(now.contains("you")) {
//				int youIdx = now.indexOf("you");
//				System.out.println(now.substring(now.indexOf("you")+3, now.length()));
				Pattern pattern = Pattern.compile(now);
				pattern.matcher("you");
			}
			System.out.println("now :: "+now);
			result += now + " ";
		}
		result = result.substring(0, result.lastIndexOf(" "));
		
		return result; // "corrected" input
	}
	
	//Buying a car
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		// your code
		return null;
	}
}
