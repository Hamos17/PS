
public class Solution_L0_날짜비교하기 {
	public static int solution(int[] date1, int[] date2) {
		String str1 = "", str2 = "";
		for(int i=0;i<3;i++) {
			str1 += date1[i];
			str2 += date2[i];
		}
		
		if(Integer.parseInt(str1) < Integer.parseInt(str2)) {
			return 1;
		}else {
			return 0;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2021, 12, 28 }, new int[] { 2021, 12, 29 }));
		System.out.println(solution(new int[] { 1024, 10, 24 }, new int[] { 1024, 10, 24 }));
	}
}
