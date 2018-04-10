package codeWar6;

import java.util.Arrays;

public class findEvenIndex {

	public static void main(String[] args) {
//		int[] arr = new int[] {1,2,3,4,3,2,1};
//        int[] arr = {1,100,50,-51,1,1};
//        int[] arr = {1,2,3,4,5,6};
//        int[] arr = {20,10,30,10,10,15,35};
//        int[] arr = {-8505, -5130, 1926, -9026};
//        int[] arr = {2824, 1774, -1490, -9084, -9696, 23094};
//        int[] arr = {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};
		
//		System.out.println("resutl :: "+findEvenIndex(arr));
		
//		String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
//        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
//        String[] s1 = new String[]{"gggbb", "iiqwommmmmmmtt", "yyyywwwwff", "wjjjjff", "xxxxkuuuuzrrcccbbi", "rrjjppwsshhbb", "yyhhh", "uu"};
//        String[] s2 = new String[]{"vkkkmmmrrrv"};
//        System.out.println("==== result :: "+mxdiflg(s1, s2));
        
		String[] a = {"az", "toto", "picaro", "zone", "kiwi"};
//		partlist(a);
//		System.out.println(Arrays.toString(a).replaceAll(",", ""));
		
//        int seconds = 0;
//        int seconds = 60;
//        int seconds = 359999;
//        int seconds = 86399;
//        makeReadable(seconds);
		String omg = "9.6";
		String omg2 = "0";
		if(omg != "" && omg != null) {
//			int omg3 = Integer.parseInt(omg) * 10;
			int omg3 = (int)(Double.parseDouble(omg) * 10);
			omg2 = (int)(Double.parseDouble(omg) * 10) + "";
		}
		
		System.out.println(omg2);
	}

	//https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
	//https://www.codewars.com/kata/5679aa472b8f57fb8c000047/solutions/java
	public static int findEvenIndex(int[] arr) {
	    // your code
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.stream(arr).sum());
//		System.out.println(Arrays.stream(arr));
		
		int sum1 = 0;
		int resultIdx = 0;
		boolean isNow = false;
		
		for(int i = 0 ; i < arr.length - 1 ; i++ ) {
			sum1 += arr[i];
			System.out.println("-- sum1 == > "+sum1);
//			resultIdx = compareSum(arr, sum1, i);
			int sum2 = 0;
			int arrLength = arr.length;
			
			while(arrLength > 0) {
				int nowIndex = arrLength -1 ;
				sum2 += arr[nowIndex];
				System.out.println("sum2 :::: "+sum2 + ", i :: "+i +", nowIndex "+nowIndex);
				if( (nowIndex - i == 2)  && sum1 == sum2) {
					System.out.println("---- arrLength  333 :: "+arrLength);
					isNow = true;
					resultIdx = nowIndex - 1;
					break;
				}
				arrLength--;
			}
			if(isNow) break;
		}
		if(!isNow) resultIdx = -1;
		return resultIdx;
	}
	
	
	//https://www.codewars.com/kata/5663f5305102699bad000056/train/java
//https://www.codewars.com/kata/5663f5305102699bad000056/solutions/java
	public static int mxdiflg(String[] a1, String[] a2) {
        // your code
		if(a1.length == 0 || a2.length == 0) {
			return -1;
		}
		
		int max1 = a1[0].length();
		int max2 = a2[0].length();
		int min1 = a1[0].length();
		int min2 = a2[0].length();
		
		for(String str1 : a1) {
			if(str1.length() > max1) {
				max1 = str1.length();
			}
			if(str1.length() < min1) {
				min1 = str1.length();
			}
		}
		
		for(String str2 : a2) {
			System.out.println("-- str2 : "+str2);
			if(str2.length() > max2) {
				max2 = str2.length();
			}
			if(str2.length() < min2) {
				min2 = str2.length();
			}
		}
		System.out.println("max1 :: "+max1+",max2 : "+max2+", min1 : "+min1+", min2 : "+min2);
		int diff1 = Math.abs(max1 - min2);
		int diff2 = Math.abs(max2 - min1);
		System.out.println(" diff1 :: "+diff1 +", diff2 : "+diff2);
		return diff1 - diff2 > 0 ? diff1 : diff2;
    }
	
	//https://www.codewars.com/kata/parts-of-a-list/train/java
	public static String[][] partlist(String[] arr) {
        // your code
		int cnt = 0;
		String elem1 = arr[cnt];
		while( cnt < arr.length ) {
			if(cnt !=0 && cnt != arr.length - 1 ) {
				elem1 += " " + arr[cnt];
			}
			
			String comp = Arrays.toString(arr).replaceAll(",", "");
			comp = "["+ comp.substring(elem1.length() +2, comp.length());
			System.out.println("comp ::"+comp);
			System.out.println("-- elem1 :: "+elem1);
			System.out.println("cnt ::"+cnt);
			cnt ++;
		}
		
		
		
		return null;
    }
	
//	https://www.codewars.com/kata/52685f7382004e774f0001f7/solutions/java
	public static String makeReadable(int seconds) {
	    // Do something
		int hhMax = 99;
		int hh = seconds / 3600;
		int mm = 0;
		int ss = 0;
		if(seconds % 3600 != 0) {
			seconds -= hh * 3600;
			 
			mm = seconds / 60;
			if(seconds % 60 != 0) {
				seconds -= mm * 60;
				ss = seconds;
			}
		} else {
			if(hh > hhMax) hh = 99;
		}
		
		System.out.println(" == > "+hh+" : "+mm+" : "+ss);
	    return (hh < 10 ? "0"+hh : hh)+":"+ (mm < 10 ? "0"+mm : mm)+":"+(ss < 10 ? "0"+ss : ss);
//	    return Integer.toString(seconds);
	}
	
//	https://www.codewars.com/kata/calculate-string-rotation/train/java
	
	
//	https://www.codewars.com/kata/54d7660d2daf68c619000d95/train/java
	public static String convertFrac(long[][] lst) {
	    // your code
		
		return "";
	}
	
}
