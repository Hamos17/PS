
public class Solution_L1_문자열내p와y의개수 {
	public static boolean solution(String s) {
		int pCnt = 0;
		int yCnt = 0;
		
		s = s.toUpperCase();
		for(Character ch : s.toCharArray()) {
			if(ch == 'P') pCnt++;
			if(ch == 'Y') yCnt++;
		}

        return pCnt == yCnt ? true : false;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
}