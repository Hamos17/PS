import java.util.HashMap;

public class Solution_L0_모스부호1 {
	public static String solution(String letter) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put(".-", "a");   hashMap.put("-...", "b"); hashMap.put("-.-.", "c");
		hashMap.put("-..", "d");  hashMap.put(".", "e");    hashMap.put("..-.", "f");
		hashMap.put("--.", "g");  hashMap.put("....", "h"); hashMap.put("..", "i");
		hashMap.put(".---", "j"); hashMap.put("-.-", "k");  hashMap.put(".-..", "l");
		hashMap.put("--", "m");   hashMap.put("-.", "n");   hashMap.put("---", "o");
		hashMap.put(".--.", "p"); hashMap.put("--.-", "q"); hashMap.put(".-.", "r");
		hashMap.put("...", "s");  hashMap.put("-", "t");    hashMap.put("..-", "u");
		hashMap.put("...-", "v"); hashMap.put(".--", "w");  hashMap.put("-..-", "x");
		hashMap.put("-.--", "y"); hashMap.put("--..", "z");

		String[] morses = letter.split(" ");
		String result = "";

		for(String morse : morses) {
			result += hashMap.get(morse);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(".... . .-.. .-.. ---"));
		System.out.println(solution(".--. -.-- - .... --- -."));
	}
}
