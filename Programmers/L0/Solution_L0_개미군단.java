
public class Solution_L0_개미군단 {
	public static int solution(int hp) {
        int[] ants = new int[3];
		
        ants[0] = hp / 5;
        hp -= (5 * ants[0]);
        
        ants[1] = hp / 3;
        hp -= (3 * ants[1]);
        
        ants[2] = hp / 1;
        hp -= (1 * ants[2]);
        
        return ants[0] + ants[1] + ants[2];
    }
	
	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(24));
		System.out.println(solution(999));
	}
}
