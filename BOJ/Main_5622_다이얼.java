import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5622_다이얼 {
	private static String[] DIALS = { "", "", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "0" };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
	
		int seconds = 0;
		for(char ch : input.toCharArray()) {
			for(int i=0;i<DIALS.length;i++) {
				String dial = DIALS[i];
				
				if(dial.contains(String.valueOf(ch))) {
					seconds += i;
					break;
				}
			}
		}
		
		System.out.println(seconds);
	}
}
