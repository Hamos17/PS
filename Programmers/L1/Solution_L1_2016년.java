
public class Solution_L1_2016년 {
	public static String solution(int a, int b) {
		int[] days = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] weekDays = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		
		int diff = 0;
		for(int i=1;i<a;i++) {
			diff += days[i];
		}
		
		diff += (b - 1);
		
        return weekDays[(5 + diff) % 7];
    }
	
	public static void main(String[] args) {
		System.out.println(solution(1, 31));
		System.out.println(solution(2, 3));
		System.out.println(solution(5, 24));
	}
}