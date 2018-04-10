package codeWar6;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

//http://www.codewars.com/kata/decode-the-morse-code-advanced

//Decode the Morse code
//https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
public class CodeWar6 {
	
	final static Logger logger = Logger.getLogger(CodeWar6.class.getName());
	
	final static String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",".",",","?", " "};
	final static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-"
			,"..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.",".-.-.-","--..--","..--..", "|" };
	
	public static void main(String[] args) {
		
		String result = CodeWar6.decode(".... . -.--   .--- ..- -.. .");
		System.out.println(result);
	}
	
	public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
		Map<String, String> morseMap = new HashMap<String, String>();
		for(int i = 0 ; i < alpha.length ; i++ ) {
			morseMap.put(morse[i], alpha[i]);
		}
		String letter = "";
		String space = "";
		for(String nowWord : morseCode.split("  ")) {
//			System.out.println("nowWord :: "+nowWord);
			if(morseMap.get(nowWord) != null) letter += morseMap.get(nowWord);
		}
		
		
		return letter;
    }
	
	

}
