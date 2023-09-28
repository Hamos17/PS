
public class Solution_L0_다항식더하기 {
	public static String solution(String polynomial) {
		String[] splits = polynomial.split(" ");

		int xSum = 0, sum = 0;
		for(String split : splits) {
			if("+".equals(split)) {
				continue;
			}
			
			if(split.contains("x")) {
				String[] temp = split.split("x");
				if(temp.length == 1) {
					xSum += Integer.parseInt(temp[0]);
				}else {
					xSum++;
				}
			}else {
				sum += Integer.parseInt(split);
			}
		}

		String result = "";
		
		if(xSum == 1) {
			result += "x";
		}else if(xSum != 0){
			result += String.valueOf(xSum) + "x";
		}

		if(result.length() != 0) {
			if(sum != 0) {
				result += " + " + String.valueOf(sum);
			}
		}else {
			result = String.valueOf(sum);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution("3x + 7 + x"));
		System.out.println(solution("x + x + x"));
		System.out.println(solution("x"));
		System.out.println(solution("5 + 12"));
	}
}
