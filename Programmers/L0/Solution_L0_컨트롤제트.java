
public class Solution_L0_컨트롤제트 {
	public static int solution(String s) {
		String[] splits = s.split(" ");
		
		int sum = 0;
		for(int i=0;i<splits.length;i++) {
			String split = splits[i];
			
			if("Z".equals(split)) {
				sum -= Integer.parseInt(splits[i - 1]);
			}else {
				sum += Integer.parseInt(split);
			}
		}
		
        return sum;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1 2 Z 3"));
		System.out.println(solution("10 20 30 40"));
		System.out.println(solution("10 Z 20 Z 1"));
		System.out.println(solution("10 Z 20 Z"));
		System.out.println(solution("-1 -2 -3 Z"));
	}
}
