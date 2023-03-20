import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1253_좋다 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int good = 0;
		for(int i=0;i<N;i++) {
			int value = arr[i], left = 0, right = N-1;
		
			while(left < right) {
				if(left == i) {
					left++;
					continue;
				}
				
				if(right == i) {
					right--;
					continue;
				}
				
				if(arr[left] + arr[right] == value) {
					good++;
					break;
				}else if(arr[left] + arr[right] < value) {
					left++;
				}else {
					right--;
				}
			}
		}
		
		System.out.print(good);
	}
}