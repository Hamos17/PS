
public class Solution_L0_옷가게할인받기 {
	public static int solution(int price) {
		if(price >= 500000) {
			return (int)(price * 0.8);
		}else if(price >= 300000) {
			return (int)(price * 0.9);
		}else if(price >= 100000) {
			return (int)(price * 0.95);
		}else {
			return price;
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(150000));
		System.out.println(solution(580000));
	}
}