package Git_Uploaded_Problems;
import java.util.*;

public class Two_Sum_Problem {

	public static void main(String[] args) {
		int target = 17;
		int[] arr = {11,3,7,9,14,2};
		int[] ans = new int[2];
		//HashMap 
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			int sno = (target - arr[i]);
			if (map.containsKey(sno)) {
			ans[0] = map.get(sno);
			ans[1] = (i);
			break;
			}
			map.put(arr[i], i);
		
		}
		System.out.println(ans[0] + " " + ans[1]);
	}

}
