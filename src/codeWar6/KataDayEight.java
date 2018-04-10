package codeWar6;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

public class KataDayEight {
	
	private static final Logger logger = Logger.getLogger(KataDayEight.class.getName());
	
	public static void main(String[] args) throws UnsupportedEncodingException {
//		System.out.println(listSquared(1, 250));
//		System.out.println(solEquaStr2(90005));
//		System.out.println(toCamelCase("the_stealth_warrior"));
//		System.out.println(toCamelCase("The_Stealth_Warrior"));
		
//		listPosition("QUESTIONQ");
		
//		groupCheck("[[][({})]{}]");
//		base64Test();
//		base64New();
//		streamTest();
		
		List<String> omg = new ArrayList<>();
		omg.add("Hello I am a boy");
		omg.add("Hello I am a girl");
		omg.add("what the hell");
		countWord(omg);
		
	}
	
//	https://www.codewars.com/kata/55aa075506463dac6600010d/train/java
//	https://www.codewars.com/kata/55aa075506463dac6600010d/solutions/java
	public static String listSquared(long m, long n) {
		// your code
		long i = m;
		ArrayList<String> result = new ArrayList<String>();
		do {
			String addVal = getDivisorSqrt(i++, n);
			if(!"".equals(addVal)) result.add(addVal);
		} while(i <= n);
		return "[" + String.join(", ", result) + "]";
	}
	
	private static String getDivisorSqrt(long m, long n) {
		int tempSum = 0;
		String returnVal = "";
		for(int i = 1 ; i <= (int)m ; i++ ) {
			if(m % i == 0) {
				tempSum += Math.pow(i, 2);
			}
		}
		if(tempSum >= 1) {
			if((Math.sqrt(tempSum) * 10) % 10 == 0 && m <= n) {
				returnVal = "["+m+", "+tempSum+"]";
			}
		}
//		System.out.println(returnVal);
		return returnVal;
	}
	
//	sol_equa(90005) -->  [[45003, 22501], [9003, 4499], [981, 467], [309, 37]]
//	https://www.codewars.com/kata/diophantine-equation/train/java
	public static String solEquaStr(long n) {
		// your code
		n = 900000;
		int x = 0, y = 0;
		long temp = 0;
		ArrayList<String> resultList = new ArrayList<String>();
		while( (x*x) <= temp) {
			temp = (int) ((4 * (y * y)) + n);
			if( (Math.sqrt(temp) * 10 ) % 10 == 0.0 ) {
				x = (int) Math.sqrt(temp);
				resultList.add("["+x+", "+y+"]");
			}
			y++;
		}
		
		if(resultList.size() > 0) Collections.reverse(resultList);
//		map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed());
//		Map<Integer, Integer> resultMap = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		return "["+String.join(", ", resultList)+"]";
	}
	
	public static String solEquaStr2(long n) {
		// your code
		n = 900000012;
		
		System.out.println("n : "+n);
		long x = 0, y = 0;
		long temp = 0;
		ArrayList<String> resultList = new ArrayList<String>();
		while( (x*x) <= temp && y <= n && x <= n) {
			temp = (4 * (y * y)) + n;
			if( (Math.sqrt(temp) * 10 ) % 10 == 0.0 ) {
				x = (long) Math.sqrt(temp);
				resultList.add("["+x+", "+y+"]");
			}
			y++;
		}
		
		if(resultList.size() > 0) Collections.reverse(resultList);
		
		return "["+String.join(", ", resultList)+"]";
	}

//	https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
//	https://www.codewars.com/kata/517abf86da9663f1d2000003/solutions/java
	public static String toCamelCase(String s) {
		if(s.length() == 0) return "";
		s = s.replace("_", "-");
		String[] omg = s.split("-");
		String result = omg[0];
		for(int i = 1 ; i < omg.length; i++ ) {
			result += Character.toUpperCase(omg[i].charAt(0)) + omg[i].substring(1, omg[i].length());
		}
//		haha.stream().collect(Collectors.toMap(haha::indexOf, a->a)).forEach((i, o) -> {
//			System.out.println(i +","+ o);
//		});
		
//		IntStream.range(1, omg.length).forEach(idx -> {
//			Character.toUpperCase(haha.get(idx).charAt(0));
//			System.out.println(haha.get(idx));
//		});
		
		return result;
	}
	
//	https://www.codewars.com/kata/esolang-interpreters-number-2-custom-smallfuck-interpreter/train/java
	
//	https://www.codewars.com/kata/53e57dada0cb0400ba000688/train/java
	public static BigInteger listPosition(String word) {
		BigInteger position = BigInteger.ZERO;
		
		ArrayList<Character> chars = new ArrayList<>(word.chars().mapToObj(e -> (char) e).collect(Collectors.toList()));
		ArrayList<Character> charSorted = (ArrayList<Character>) chars.clone();
		Collections.sort(charSorted);
		
		Set<Character> cSet = new LinkedHashSet<>();
		ArrayList<Character> uniqueChars = sortedUniqueChar(charSorted, cSet);
		int i = 0;
		int j = 0;
		
		while(i < chars.size() || j < uniqueChars.size()) {
			if(chars.get(i) == uniqueChars.get(j++)) {
				System.out.println(chars.get(i));
				charSorted.remove(chars.get(i));
				uniqueChars = sortedUniqueChar(charSorted, cSet);
				
//				System.out.println("=== > uniqueChars == >"+uniqueChars.toString());
				
				i++;
				j = 0;
			} else {
				ArrayList<Character> charSorted2 = (ArrayList<Character>) charSorted.clone();
				charSorted2.remove(  chars.get(i) < uniqueChars.get(j-1) ? chars.get(i) : uniqueChars.get(j-1) );
//				System.out.println("--- charSorted2 ==> "+charSorted2.toString());
			}
		}
		
		return BigInteger.ZERO;
	}
	
	private static ArrayList<Character> sortedUniqueChar(ArrayList<Character> sortedChars, Set<Character> cSet) {
		cSet.clear();
		for(char c : sortedChars) {
			cSet.add(c);
		}
		return Collections.list(Collections.enumeration(cSet));
	}

	private static long factorial(int n) {
		return n == 0 ? 1 : factorial(n - 1) * n;
	}
	
	private static BigInteger countAnagrams(ArrayList<Character> c) {
		long numericCnt = factorial(c.size());
		int groupCnt = sortedUniqueChar(c, new HashSet<>()).size();
		
		return null;
	}
	
//	https://www.codewars.com/kata/checking-groups/train/java
	public static boolean groupCheck(String s) {
		boolean returnVal = false;
		char[] charArr = s.toCharArray();
		
		ArrayList cList = new ArrayList<>();
		
		System.out.println(cList.toString());
		
		if(new HashSet<>(Arrays.asList(charArr)).size() % 2 == 0) {
			
			
			for(char c : charArr) {
				
			}
			
			
			
		} else {
			returnVal = false;
		}
		
//		Set<Character> cSet = new LinkedHashSet<>(s.toCharArray());
		
		
		return true;
	}
	
	public static void base64Test() throws UnsupportedEncodingException {
		sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
		
        String strMemNm = "최지혜";
        byte[] b1 = strMemNm.getBytes("UTF-8");
        strMemNm = encoder.encode(b1);
        System.out.println(strMemNm);
        strMemNm = URLEncoder.encode(strMemNm, "utf-8");
        System.out.println(strMemNm);
        
//		userInfo.setMemNmCookie(strMemNm);
	}
	
	public static void base64New() throws UnsupportedEncodingException {
		String strMemNm = "최지혜";
		
//		Base64 decoder = new Base64();
//		byte[] b1 = decoder.decode(strMemNm);
//		Base64 encoder = new Base64();
//		encoder.encodeToString(strMemNm);
		
		byte[] encoded = Base64.encodeBase64(strMemNm.getBytes("UTF-8"));
		System.out.println(new String(encoded, "UTF-8"));
		byte[] result = Base64.decodeBase64(encoded);
		System.out.println(new String(result, "UTF-8"));
		
	}
	
	public static void streamTest() {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("ohmygod");
		
		Stream<String> wordStream = list.stream();
		Stream<Integer> lengthStream = wordStream.map(s->s.length());
//		Iterator<Integer> itr = lengthStream.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		int s = list.stream().map(s1->s1.length())
					.mapToInt(Integer::new)
					.sum();
		
		System.out.println(" s : "+s);
		/*
		for(Iterator<Integer> itr = lengthStream.iterator(); itr.hasNext(); ) {
			System.out.println(itr.next());
		}
		*/
		
//		Optional<Integer> sum = lengthStream.reduce(Integer::sum);
//		Optional<Integer> sum = lengthStream.reduce((x, y) -> x+y);
//		sum.ifPresent(System.out::println);
//		int sum = lengthStream.reduce(0, (x, y) -> x+y);
//		System.out.println(sum);
		
		int s2 = list.stream().reduce(0, (x, y) -> x + y.length(), (x, y) -> x+y);
		System.out.println(s2);
		
		//아래는 stream()에 중복이 있는경우 exception을 발생시킨다. Function.identify()가 중복 제거를 하는건 아닌듯
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), s3->s3.length()));
		System.out.println(map);
		
	}
	
	public static void countWord(List<String> sentences) {
		
		Map<String, Integer> mapCnt = new HashMap<>();
		for(String sentence : sentences) {
			String[] wordArr = sentence.split(" ");
			for(String word : wordArr) {
				if( mapCnt.get(word) != null ) {
					mapCnt.put(word, mapCnt.get(word) + 1);
				} else {
					mapCnt.put(word, 1);
				}
			}
		}
		
		System.out.println(mapCnt.toString());
	}
	
}
