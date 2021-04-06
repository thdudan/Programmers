import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class lessons12922 {
	Solution solution;
	
	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void test() {
		equals(solution.solution(3));
		equals(solution.solution(4));
	}
	/*
	 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	 */
	static class Solution {
	    public String solution(int n) {
	        String answer = "";
	        for (int i = 1; i <= n; i++) {
				if(i % 2 == 1) {
					answer += "수";
				} else {
					answer += "박";
				}
			}
	        return answer;
	    }
	}
}
