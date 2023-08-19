
public class Solution_L0_주사위게임3 {
	public static int solution(int a, int b, int c, int d) {
		if(a == b && b == c && c == d && d == a) {
			return 1111 * a;
		}
		
		int[] dice = new int[7];
		dice[a]++; dice[b]++; dice[c]++; dice[d]++;
		
		for(int i=1;i<=6;i++) {
			if(dice[i] == 4) {
				return i * 4;
			}else if(dice[i] == 3) {
				int p = i;
				for(int j=1;j<=6;j++) {
					if(dice[j] == 1) {
						int q = j;
						return (int) Math.pow((10 * p) + q, 2);
					}
				}
			}else if(dice[i] == 2) {
				int p = i;
				for(int j=1;j<=6;j++) {
					if(i != j) {
						if(dice[j] == 2) {
							int q = j;
							return (p + q) * Math.abs(p - q);
						}
					}
				}
				
				int q = 0, r = 0;
				for(int j=1;j<=6;j++) {
					if(dice[j] == 1) {
						q = j;
						break;
					}
				}
				
				for(int j=1;j<=6;j++) {
					if(j != q && dice[j] == 1) {
						r = j;
						break;
					}
				}
				
				return q * r;
			}
		}
		
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }
	
	public static void main(String[] args) {
		System.out.println(solution(2, 2, 2, 2));
		System.out.println(solution(4, 1, 4, 4));
		System.out.println(solution(6, 3, 3, 6));
		System.out.println(solution(2, 5, 2, 6));
		System.out.println(solution(6, 4, 2, 5));
	}
}
