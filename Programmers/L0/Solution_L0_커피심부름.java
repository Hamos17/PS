
public class Solution_L0_커피심부름 {
	public static int solution(String[] order) {
		int price = 0;
		for(String beverage : order) {
			if(beverage.contains("americano")){
				price += 4500;
			}else if(beverage.contains("cafelatte")) {
				price += 5000;
			}else {
				price += 4500;
			}
		}

		return price;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] { "cafelatte", "americanoice", "hotcafelatte", "anything" }));
		System.out.println(solution(new String[] { "americanoice", "americano", "iceamericano" }));
	}
}
