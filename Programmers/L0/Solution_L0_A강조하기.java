
public class Solution_L0_A강조하기 {
	 public static String solution(String myString) {
		 String result = "";
		 for(Character ch : myString.toCharArray()) {
			 if(ch == 'a') {
				 result += 'A';
			 }else if('B' <= ch && ch <= 'Z') {
				 result += (char)(ch + 32);
			 }else {
				 result += ch;
			 }
		 }
	 
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(solution("abstract algebra"));
		System.out.println(solution("PrOgRaMmErS"));
	}
}
