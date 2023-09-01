
public class Solution_L0_조건에맞게수열변환하기2 {
	public static int solution(int[] arr) {
		int result = 0;
		while(true) {
			result++;
			
			int[] copyArr = arr.clone();

			for(int i=0;i<arr.length;i++) {
				if(arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] /= 2;
				}else if(arr[i] < 50 && arr[i] % 2 == 1) {
					arr[i] *= 2;
					arr[i] += 1;
				}
			}
			
			boolean isSame = true;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] != copyArr[i]) {
					isSame = false;
					break;
				}
			}
			
			if(isSame) {
				break;
			}
		}
		
        return result - 1;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 100, 99, 98 }));
	}
}
