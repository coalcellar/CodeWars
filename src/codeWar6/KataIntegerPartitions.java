/**
 * 
 */
package codeWar6;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 최지혜
 *
 */
public class KataIntegerPartitions {

	public static final Logger logger = LoggerFactory.getLogger(KataIntegerPartitions.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPartitions(5);
	}
	
	private static void getPartitions(int num) {
		
		int temp = num;
		int omg = 0;
		StringBuffer sb = new StringBuffer();
//		List<Integer> tempList = new ArrayList<>();
		while ( (num--) > 0) {
			logger.debug("--");
			System.out.println("--"+(omg++));
//			System.out.println("1 자리 :" + temp);
			
			sb.append(temp);
			sb.append(",");
			System.out.println(sb);
			if(temp > 1) {
				
				getPartitions( temp - 1 );
			}
			
			if(temp != num) {
				System.out.println("============================");
				sb = new StringBuffer();
			}
		}
		
	}

}
