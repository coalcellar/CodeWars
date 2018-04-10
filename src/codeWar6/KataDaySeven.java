package codeWar6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class KataDaySeven {

	public static void main(String[] args) {
//		System.out.println(nextSmaller(12345678));
//		long[][] lst = new long[][] { {77, 130}, {84, 131}, {3, 4} }; //34060
//		System.out.println(convertFrac(lst));
		
		
//		generate_bc("mysite.com/pictures/holidays.html", " : ").equals( '<a href="/">HOME</a> : <a href="/pictures/">PICTURES</a> : <span class="active">HOLIDAYS</span>' );
//		generate_bc("pippi.pi/from-a-and-for-biotechnology-uber-immunity/giacomo-sorbi.php?source=utm_pippi", " / ");
//		generate_bc("www.codewars.com/users/GiacomoSorbi", " / ");
//		generate_bc("mysite.com/very-long-url-to-make-a-silly-yet-meaningful-example/example.asp", " . ");
//		generate_bc("www.microsoft.com/docs/index.htm", " * ");
		
//		pascal(5);
		
//		System.out.println(order("is2"));
//		System.out.println(order("is2 Thi1s T4est 3a"));
		
//		System.out.println(longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv", "itvayloxrp", "vweqilsfytihvrzlaodfixoyxvyuyvgpck", "ingoqmwleojt", "wkppqsztdkmvcuwvereiupccauycnjutlv"}, 2));
//		System.out.println(longestConsec(new String[] {"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2));
//		System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
//		System.out.println(longestConsec(new String[] {"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
		System.out.println(longestConsec(new String[] {"fqqqxx"," mmmdddtqqqbb"," oooto"," vvggjllggyy"," ttsswwlllmm"," zzcmmwwdmmm"
				," pppkkhppddvvrrruuue"," cckeeggd"," zbaammmx"," zzaaaffo"," syyccdddr"," oam"," vvvvvzyl"," ppmmhuyyjjb"," xxnoaa"," gggqjrreeeeezzzkk"
				," hhwwrd"," mmooqqz"," jjhsswkkp"," dttllluu"," wnyydvv"," wfffvvimmm"," ttmmxxyynnuuu"," hhhhhqehhh"," rrsxx"," iiffaaeekzz"," mmmaryyy"," uupllln"
				," oozzjjjuxccee"," bbnnbbbtttdhkk"," gnuuwwwaa"," kycccsssdddjj"," psssqqooottl"," sssrjjz"," ttggrbmmmuuuq"," hqqqyyyssggffsff"," uuxy"," eessnucncff"
				," ssjyyvvv"," oovmmmvvk"," kkkbccah"," ccggkkkttrwvvaaax"," jjjiip"," wwvvvocqq"," lhhvvoos"," pyyerrwww"," cciiieekkymmii"," trriiiiipp"," uymllr"
				," eejennwjjzzu"," jjjpppnnn"," rhhttt"," xmmrruungg"," aaahhhllnnu"," ccclliillddzz"," sssuvvvvvd"," hhhppfeehahhoof"," sshhheeeppf"," byyccft"," xxxvuuu"
				," urrrnnhhhmm"," auukqq"," kkkllnnnpkk"," ttddmmxxzz"," tffffttuuuzzwee"," aaabd"," zzzhhozzccchhj"," pvvhhnqqqpx"," ooiiz"," ppuunttdvvv"," dddjjjuee"
				," ssxxssvrvvf"," cxxxoorrasssooo"," qiillt"," uuttcccvvlxdd"," wwllg"," aarrgggff"," rrroorrhhhbbb"," kkjjxxxjwppp"," jjaghhhh"," ewwfkkrroollp"," ppuummmkk"
				," bbbttttgaa"," mmhhhnnnrrnnka"," kkgggaggrrrkrrc"," beeeaann"," rrqqggqqwwoo"," lllmmssseejjhhunn"," aaaeeccp"," cccsgoo"," xxgmtoo"," yyaarrghhoool"
				," vvuurrmmommm"," llkkrrud"," swwwmmssg"," yyvckk"," qwi"," aanggaqqqqm"," bbqqqhhrrkddd"," jxyyytty"," teggcffyy"," rruiiiiio"," aattteetnnddkkf"
				," mmmgwwiyxx"," kvvaaq"," egupqqeeevv"," mmeeekqu"," ovvvuurr"," hvvxxqzzhhh"," zzfffqj"," ppqqqiinnnffftt"," qcvvnnnmmm"," piiddggsssg"," vwwwaaq"
				," ccffooaa"," eekkkkkkm"," prwww"," pputtnnnb"," oozzkksxxpppkkkddq"," yyiwwsss"," zzcctaff"," zzzhhiifffw"," paappxxeehhzz"," lllcggof"," klkv"," tttuutxx"
				," xxmmiiiwwiimmyyyhh"," yeeuuuhaa"," ppppppiirrryym"," kkwwwww"," aappsmmnn"," qqqwwwllhooo"," rrbss"," yyyeeellsssppaaa"}, 93));
//		System.out.println(convertFloat(34.12f));
		
//		System.out.println("ixoyx3452zzzzzzzzzzzz".length());
//		System.out.println("wkppvixoyxzzzzzzzzzzzz".length());
	}

	//https://www.codewars.com/kata/5659c6d896bc135c4c00021e/train/java
	public static long nextSmaller(long n) {
		
		Stack stack = new Stack();
		int digits = (int) Math.log10(n);
		int compVal = (int) (n % digits);
		System.out.println((int) Math.pow(10, digits));
		for (int i = (int) Math.pow(10, digits); i > 0; i /= 10) {
		    System.out.println(n / i);
//		    stack.push(n%=i);
		    n %= i;
		    if(n > compVal) {
		    	
		    }
		}
		
	    return n;
	}
	
//	https://www.codewars.com/kata/54d7660d2daf68c619000d95/train/java
//	https://www.codewars.com/kata/54d7660d2daf68c619000d95/solutions/java
	public static String convertFrac(long[][] lst) {
		long denominator = 0l;
		String returnVal = "";
		ArrayList<Long> tempDenom = new ArrayList<Long>();
		if(lst.length == 0) return "";
		for(int i = 0; i < lst.length ; i++) {
			tempDenom.add(lst[i][1]);
		}
		denominator = getLCM(tempDenom);
		
		for(long[] omg : lst) {
			returnVal += String.format("(%s,%s)", omg[0] * (denominator / omg[1]), denominator);
		}
		return returnVal;
	}
	
    /**
     * 1. 가장 큰 수를 정수배로 곱한다 </br>
     * 2. 곱할때마다 다른 숫자들과 비교.</br>
     * 3. 곱한 숫자를 다른 숫자들 모두로 나누어 떨어지면 최소공배수이다.
     * @return 최소공배수 반환
     */
	public static long getLCM(ArrayList<Long> arrList) {
		long lcm = 0l;
		long num = Collections.max(arrList); // 제일 큰 수 반환

		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			boolean result = true; // 모두 나누어지는지 판단
			for (long j : arrList) {
				if ((num * i) % j != 0) {
					result = false; // 하나라도 나누어떨어지지 않으면 false
					break;
				}
			}
			if (result) {
				lcm = num * i;
				break;
			}
		} // end for
		return lcm;
	}//end getLCM()
	
	// 약수 반환 메서드
    public static ArrayList getDivisor(long num) {
//        System.out.println("최대약수 : "+num);
        ArrayList divisorList = new ArrayList<>();
       
        for(long i = num; i > 0; i--) {
            if(num%i==0)   
//                System.out.println("약수등록 : "+ i);
                divisorList.add(i);        //나누어떨어지면 약수 등록(내림차순등록)
        }
        return divisorList;
    }
   
    /**
     * 1. 제일 작은 수의 약수를 구한다.</br>
     * 2. 구한 약수 중 큰값부터 다른 숫자들과 나누어 떨어지는지 비교한다.</br>
     * 3. 모두 나누어 떨어지면 그 수가 최대 공약수이다.
     * @return 최대공약수 반환
     */
	public static long getGCM(ArrayList<Long> arrList) {
		long gcm = 0l; // 최대공약수
		ArrayList<Long> divisorList = getDivisor(Collections.min(arrList)); // 제일작은수의약수리스트 반환
		
		for (long i : divisorList) {
			// System.out.println("약수 : "+i);
			boolean result = true; // 모두 나누어지는지 판단
			for (long j : arrList) {
				// System.out.println("나누는 수 :"+j);
				if (j % i != 0) {
					result = false; // 하나라도 나누어떨어지지 않으면 false
					break;
				}
			}
			if (result) {
				gcm = i;
				break;
			}
		} // end i
		System.out.println("최대공약수 : " + gcm);

		return gcm;
	}//end getGCM()
    
	
	public String floatToStr(float num) {
		if(num == 0f) return "0";
		Math.floor(2);
		return "";
	}
	
//	https://www.codewars.com/kata/breadcrumb-generator/train/java
	public static String generate_bc(String url, String separator) {
		if(url.length() == 0) return "";
		String[] ignore = {"the","of","in","from","by","with","and", "or", "for", "to", "at", "a"};
		String home = "<a href=\"/\">HOME</a>";
		String[] urlArr = url.split("/");
//		LinkedList<String> urlList = new LinkedList<String>(Arrays.asList(url.split("/")));
		
		System.out.println(Arrays.toString(ignore));
		/*
		for(Iterator<String> itr = urlList.iterator(); itr.hasNext(); ) {
			String breadCrumb = itr.next().toString();
			if(!"".equals(breadCrumb)) {
				if(breadCrumb.contains(".")) breadCrumb = breadCrumb.substring(0, breadCrumb.indexOf("."));
//				boolean spanActive = false;
				if(!( breadCrumb.startsWith("http") || "index".equals(breadCrumb) ) ) {
					if(breadCrumb.contains("-")) {
						LinkedList<String> withDash = new LinkedList<String>(Arrays.asList(breadCrumb.split("-")));
						char newChar = 0;
						String newStr = "";
						for(String ig : ignore ) {
							breadCrumb.replace(ig, "");
						}
						newStr += newChar;
						System.out.println(breadCrumb);
						breadCrumb = newStr.toUpperCase();
					}
					if(itr.hasNext()) {
						home += separator + "<a href=\"/"+breadCrumb+"/\">"+breadCrumb.toUpperCase()+"</a>";
					} else {
						//span active
						home += separator + "<span class=\"active\">";
						//do something
						
						home += "</span>";
					}
				}
			}
			//contain - and contain ignore 
		}
		*/
		if(urlArr.length == 1) {
			return home;
		} else {
			
			int whileInt = 1;
			List<String> urlList = Arrays.asList(urlArr);
			while(whileInt <= urlArr.length - 1) {
				String breadCrumb = urlArr[whileInt++];
				
				if(whileInt == urlArr.length) {
					if(breadCrumb.contains(".")) breadCrumb = breadCrumb.substring(0, breadCrumb.indexOf("."));
					
					if(!breadCrumb.equals("index")) {
						
						for(String ig : ignore) {
							List<String> strL =  urlList.stream().filter(e -> !e.equals(ig)).collect(Collectors.toList());
//							System.out.println(Arrays.toString(strL));
						}
						
						home += separator + "<span class=\"active\">";
						for(int i = 0 ; i < breadCrumb.length() ; i++ ) {
							Character now = breadCrumb.charAt(i);
	//						System.out.println(now.toUpperCase(now));
							if( i != 0 && Character.isUpperCase(now)) {
								home += " ";
							}
							home += now.toUpperCase(now);
						}
						home += "</span>";
					}
				} else {
					home += separator + "<a href=\"/"+breadCrumb+"/\">"+breadCrumb.toUpperCase()+"</a>";
				}
			}
		}
		System.out.println(home);
		return home;
	}
	
//	Expected : <a href="/">HOME</a> . <a href="/from-a-and-for-biotechnology-uber-immunity/">BUI</a> . <span class="active">GIACOMO SORBI</span>
//	Actual :   <a href="/">HOME</a> . <a href="/from-a-and-for-biotechnology-uber-immunity/">FROM-A-AND-FOR-BIOTECHNOLOGY-UBER-IMMUNITY</a> . <span class="active">GIACOMO-SORBI</span>
	/*
	Test with : https://www.linkedin.com/in/giacomosorbi
		 
		The one used in the above test was my LinkedIn Profile; if you solved the kata this far and manage to get it, feel free to add me as a contact, message me about the language that you used and I will be glad to endorse you in that skill and possibly many others :)
		 
		https://www.linkedin.com/in/giacomosorbi
		Expected : <a href="/">HOME</a> * <a href="/in/">IN</a> * <span class="active">GIACOMOSORBI</span>
		Actual :   <a href="/">HOME</a> * <a href="//"></a> * <a href="/www.linkedin.com/">WWW.LINKEDIN.COM</a> * <a href="/in/">IN</a> * <span class="active">GIACOMOSORBI</span>
		*/
	
	
//	https://www.codewars.com/kata/52945ce49bb38560fe0001d9/train/java
	public static int[][] pascal(int depth) {
		// Your code here...
		depth = 1;
		int[][] result = new int[depth][];
		int[] now = {1};
		
		if(depth >= 1) {
			result[0] = now;
			int cnt = 1;
			while(cnt < depth) {
				
				now = new int[cnt+1];
				now[0] = 1; now[cnt] = 1;
				for(int i = 1 ; i < cnt ; i++ ) {
					now[i] = result[cnt-1][i-1] + result[cnt-1][i];
				}
				result[cnt++] = now;
			}
		}
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		return result;
	}
	
	public static String convertFloat(float num) {
		String returnVal = Float.toString(num);
		
//		BigDecimal roundfinalPrice = new BigDecimal(num.floatValue()).setScale(2,BigDecimal.ROUND_HALF_UP);

//        System.out.println("f1 --> "+num);
//        String s1 = roundfinalPrice.toPlainString();
//        System.out.println("s1 "+s1);
		
		return returnVal;
	}
	
//	https://www.codewars.com/kata/your-order-please/train/java
//	https://www.codewars.com/kata/55c45be3b2079eccff00010f/solutions/java
	public static String order(String words) {
		Pattern pattern = Pattern.compile("[0-9]");
		if(words.length() > 0) {
			String[] wordArr = words.split(" ");
			String[] newArr = new String[wordArr.length];
			for(String word : wordArr) {
				Matcher matcher = pattern.matcher(word);
				if(matcher.find()) {
					if(wordArr.length > 1 ) newArr[Integer.parseInt(matcher.group()) - 1] = word;
					else newArr[0] = word;
				}
			}
			return String.join(" ", wordArr);
		} else {
			return words;
		}
	}
	
//	https://www.codewars.com/kata/consecutive-strings/train/java
	public static String longestConsec(String[] strarr, int k) {
        // your code
		if(strarr.length > 0 && k > 0 && k <= strarr.length) {
			Comparator<String> firstOne = (s1, s2) -> Integer.compare(s2.length(), s1.length());
			List<String> strList = Arrays.asList(strarr).parallelStream().distinct().collect(Collectors.toList());
			System.out.println(strList.toString());
			
//		List<String> strList2 = strList.stream().sorted(firstOne.thenComparing( (s1, s2) -> Integer.compare(strList.indexOf(s1), strList.indexOf(s2))   ))
//			.filter(s1 -> strList.indexOf(s1) < k).collect(Collectors.toList());
			
			List<String> strList2 = strList.stream().sorted(firstOne)
					.collect(Collectors.toList());
			System.out.println(strList2.toString());
			List<String> strList3 = strList2.subList(0, k).stream().sorted( (s1, s2) -> Integer.compare(strList.indexOf(s1), strList.indexOf(s2)) )
						.collect(Collectors.toList());
//			List<String> strList3 = strList.stream().sorted( (s1, s2) -> Integer.compare(strList.indexOf(s1), strList.indexOf(s2)) )
//					.collect(Collectors.toList());
			
		System.out.println(strList3.toString());
			return String.join("", strList3);
		} else {
			return "";
		}
    }
	
}
