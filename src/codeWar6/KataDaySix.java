package codeWar6;

import java.util.Stack;


public class KataDaySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		code(""); 
		
//		System.out.println(dec2FactString(8150835199999999l));
		System.out.println(factString2Dec("2DCAA5842344512200"));
//		System.out.println(factString2Dec("A0000000000"));
	}

	
	
//	https://www.codewars.com/kata/56fcc393c5957c666900024d/train/java
	public static String code(String s) {
        // your code
		
		String omg = "What";
		
		String omg2 = "tahW";
		
		for(int i = 0 ; i < omg2.length() ; i++ ) {
			Character c = (char)omg2.indexOf(i);
			System.out.println("c :: "+(char)omg2.indexOf(i));
		}
		
		return "";
    }
    public static String decode(String s) {
        // your code
    	
    	
    	return "";
    }
    
//    https://www.codewars.com/kata/54e320dcebe1e583250008fd/train/java
//    https://www.codewars.com/kata/decimal-to-factorial-and-back/solutions/java
	public static String dec2FactString(long nb) {
		int divideNum = 1;
		long rest = 0;
		Stack<String> returnStr = new Stack<String>();
		String returnMsg = "";
		while (nb > 0) {
			rest = (long) (nb / divideNum);
			int pushNum = (int) (nb % (divideNum++));
			String pushVal = String.valueOf(pushNum);
			if(pushNum > 9) {
				Object omg = (char)((pushNum - 9) + 64);
				pushVal = omg.toString();
			}
			returnStr.push(pushVal);
			if(rest >= 0) nb = rest;
		}
		
		while(!returnStr.empty()) {
			returnMsg += returnStr.pop();
		}
	    return returnMsg;
	}

//	341010
	public static long factString2Dec(String str) {
		int placeVal = str.length() - 1;
		long now = 0;
		if(Character.isAlphabetic(str.charAt(0))) {
			now = Integer.parseInt(String.valueOf(Character.toLowerCase(str.charAt(0)) - 'a' + 1)) + 9;
		} else {
			now = Integer.parseInt(String.valueOf(str.charAt(0)));
		}
		int next = 0;
		for(int i = 1 ; i < str.length() ; i++ ) {
			System.out.println(String.valueOf(str.charAt(i)));
			if( i + 1 < str.length() ) {
				if(Character.isAlphabetic(str.charAt(i))) {
					next = Integer.parseInt(String.valueOf(Character.toLowerCase(str.charAt(i)) - 'a' + 1)) + 9;
				} else {
					next = Integer.parseInt(String.valueOf(str.charAt(i)));
				}
				System.out.println("next :: "+next+", now : "+now);
				now = (now * placeVal) + next;
			}
			placeVal--;
		}
		return (long) now;
	}
    /*
    private static String digt="0123456789ABCDEFGHIZKLMNOPQRSTUVWXYZ";
    
    public static String dec2FactString(long nb) {
      System.out.println("d2s:" + nb);
      long v = nb;
      int i=1;
      StringBuffer s = new StringBuffer();
      while ( v != 0 ){
        s.append( (String.valueOf(digt.charAt((int)(v%i%37)))));
        v =  v / i++;
      }
       return s.reverse().toString();
    }
    public static long factString2Dec(String str) {
     System.out.println("f2d:"+str);
     //((((3¡¿5 + 4)¡¿4 + 1)¡¿3 + 0)¡¿2 + 1)¡¿1 + 0
     //(n x i + n-1) x i +n
     int fv = str.length()-1;
     int i=0;
     long rv = digt.indexOf(str.charAt(0)); 
     //System.out.println(str);
     while ( fv > 0 ){
       int nv = digt.indexOf(str.charAt(i+1));
       System.out.println("nv : "+nv);
      rv = (rv * fv + nv);
      //System.out.println(rv +"="+rv + "*" + fv + "+"+ nv);
      fv--; i++;
     }
     rv += digt.indexOf(str.charAt(str.length()-1));
     return rv;
    }
    */
//	https://www.codewars.com/kata/product-of-consecutive-fib-numbers/train/java
    
}