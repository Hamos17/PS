import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12891_DNA비밀번호 {
	private static int[] count;
	private static int[] window;
	
	public static boolean compare() {
		for(int i=0;i<4;i++) {
			if(count[i] > window[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		char[] arr = br.readLine().toCharArray();
		count = new int[4];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<4;i++) {
			count[i] = Integer.parseInt(st.nextToken());
		}

		int password = 0;
		window = new int[4];
		
		// 초기 P 부분 문자열 처리
		for(int i=0;i<P;i++) {
			if(arr[i] == 'A') {
				window[0]++;
			}else if(arr[i] == 'C') {
				window[1]++;
			}else if(arr[i] == 'G') {
				window[2]++;
			}else {
				window[3]++;
			}
		}
	
		if(compare()) {
			password++;
		}
		
		// 슬라이딩 윈도우
		for(int i=P;i<S;i++) {
			int j = i - P;
			
			// j 인덱스 문자 제거
			if(arr[j] == 'A') {
				window[0]--;
			}else if(arr[j] == 'C') {
				window[1]--;
			}else if(arr[j] == 'G') {
				window[2]--;
			}else {
				window[3]--;
			}
			
			// i 인덱스 문자 추가
			if(arr[i] == 'A') {
				window[0]++;
			}else if(arr[i] == 'C') {
				window[1]++;
			}else if(arr[i] == 'G') {
				window[2]++;
			}else {
				window[3]++;
			}
			
			if(compare()) {
				password++;
			}
		}
		
		System.out.print(password);
	}
}