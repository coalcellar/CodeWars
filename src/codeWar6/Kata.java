package codeWar6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

	public static void main(String[] args) {
//		System.out.println(expandedForm(70320));
		
//		System.out.println(josephusPermutation(Arrays.asList(new Object[]{1, 2, 3, 4, 5, 6, 7}), 3).toString());
		
//		testMe();
		
//		System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		
//		System.out.println("evalutate :: " +evaluate("10000 123 +"));
//		System.out.println("evalutate :: " +evaluate("5 1 2 + 4 * + 3 -"));
//		System.out.println("evalutate :: " +evaluate2("5 1 2 + 4 * + 3 -"));
		
		String omg = ".";
		System.out.println(omg == ".");
	}
	
//	https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
//	https://www.codewars.com/kata/5842df8ccbd22792a4000245/solutions/java
	public static String expandedForm(int num) {
		// your code here
		List<Object> arr = new ArrayList<Object>();
		String returnStr = "";
		
		int num2 = num;
		int num3 = 0;
		int omg = 1;
		
		while(num2 > 0 ) {
			num2 = num2 / 10;
			num3 = num % (int) Math.pow(10, omg++);
			if( num3 > 0 ) arr.add(num3);
			num -= num3;
		}
		
		for(int i = (arr.size() ) ; i > 0 ; i--) {
			if(returnStr == "" ) returnStr += arr.get(i-1);
			else returnStr += " + " + arr.get(i-1);
		}
		
		return returnStr;
    }

//	https://www.codewars.com/kata/josephus-permutation/train/java
//	https://www.codewars.com/kata/5550d638a99ddb113e0000a2/solutions/java
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		
		List<T> items2 = new LinkedList<T>();
		List<T> itemsNew = new LinkedList<T>(items);
		
		int idx = 0;
		while(itemsNew.size() > 0 ){
			
			idx += k-1;
			if(idx >= itemsNew.size()) {
				idx = idx % itemsNew.size();
			}
			items2.add((T) itemsNew.remove(idx));
		}
		return items2;
	}
	
	public static void testMe() {
		List<Object> omg = new ArrayList<>();
		Map<String, Object> omgMap = new HashMap<>();
		omg.add(omgMap);
		System.out.println(omg.size());
		
		for(Object haha : omg) {
			Map<String, Object> omgMap1 = (Map<String, Object>) haha;
			System.out.println("----111 "+omgMap1.get("map1"));
		}
		
		omgMap.put("map1", 1);
		System.out.println(omg.size());

		for(Object haha : omg) {
			Map<String, Object> omgMap1 = (Map<String, Object>) haha;
			omgMap1.get("map1");
			System.out.println("----2222 "+omgMap1.get("map1"));
		}
	}
	
//	https://www.codewars.com/kata/create-phone-number/train/java
	public static String createPhoneNumber(int[] numbers) {
	    // Your code here!
		
		List<Object> intList = new ArrayList<Object>();
		for (int i = 0; i < numbers.length; i++) {
		    intList.add(numbers[i]);
		}
		
		int addIdx = 0;
		intList.add(addIdx, "(");
		addIdx += 3;
		intList.add(addIdx, ") ");
		
		int idx = 0;
		while(idx < intList.size() + 1) {
			if(idx % 3 == 2) {
				System.out.println(intList.get(idx));
			}
			idx++;
		}
		
		return "";
	}
	
//	https://www.codewars.com/kata/braking-well/train/java
	
	
//	https://www.codewars.com/kata/magnet-particules-in-boxes/train/java

	
//	https://www.codewars.com/kata/52f78966747862fc9a0009ae/train/java
//	https://www.codewars.com/kata/52f78966747862fc9a0009ae/solutions/java
	public static double evaluate(String expr) {
		// TODO: Your awesome code here
		System.out.println("expr 11 start: "+expr);
		
		double resultNum = 0;
		if(expr != null && expr != "") {
			Pattern pattern = Pattern.compile("(\\w{1,9} \\w{1,9} [+|\\-|*|/])");
			Matcher matcher = pattern.matcher(expr);
			
			if(matcher.find()) {
				int resultNow = 0;
				String nowMatcher = matcher.group();
				String[] nowArr = nowMatcher.split(" ");
				String operStr = nowArr[2];
				int firstNumb = Integer.parseInt(nowArr[0]);
				int secondNumb = Integer.parseInt(nowArr[1]);
//				System.out.println(" nowMatcher : "+nowMatcher+", operStr : "+operStr+", firstNumb : "+firstNumb+", secondNumb : "+secondNumb);
				if(operStr.equals("+")) {
					resultNow = firstNumb + secondNumb;
				} else if (operStr.equals("-")) {
					resultNow = firstNumb - secondNumb;
				} else if (operStr.equals("*")) {
					resultNow = firstNumb * secondNumb;
				} else if (operStr.equals("/")) {
					resultNow = firstNumb / secondNumb;
				}
				
				expr = expr.replace(nowMatcher, resultNow + "");
				if(pattern.matcher(expr).find()) {
					resultNum = evaluate(expr);
				} else {
					resultNum = new Double(expr);
				}
			} else {
				if(expr.indexOf(" ") > 0 ) {
					String[] last = expr.split(" ");
					resultNum = new Double(last[last.length-1]);
				} else {
					System.out.println("22~");
					resultNum = new Double(expr);
				}
			}
		}
		return resultNum;
	}
	
	public static double evaluate2(String expr) {
	    if (expr.equals("")) {
	      return 0;
	    }
	  
	    Stack<Double> stack = new Stack<Double>();
	    String[] atoms = expr.split(" ");
	    
	    for (String atom: atoms) {
	      Double a, b;
	      System.out.println(atom);
	      switch (atom) {
	        case "+": stack.push(stack.pop() + stack.pop()); break;
	        case "-": b = stack.pop(); a = stack.pop(); stack.push(a - b); break;
	        case "*": stack.push(stack.pop() * stack.pop()); break;
	        case "/": b = stack.pop(); a = stack.pop(); stack.push(a / b); break;
	        default:
	          stack.push(Double.parseDouble(atom));
	      }
	    }
	    
	    return stack.pop();
	  }
	
	
	
//	https://www.codewars.com/kata/ranking-poker-hands/train/java
	
	
//	https://www.codewars.com/kata/scramblies/train/java
	public static boolean scramble(String str1, String str2) {
        // your code
		
		
		while(str2.length() >= 0) {
			
		}
		
		return true;
    }
	
}