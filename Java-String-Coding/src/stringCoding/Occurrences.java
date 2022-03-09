package stringCoding;

import java.util.ArrayList;

public class Occurrences {
	public static void count() {

		System.out.println("***********Occurrences***********");
		
		int[] nums = {10,10,5,12,3,5};
		ArrayList <Integer> uniqueNums = new ArrayList <Integer> ();
		
		//Finds unique numbers
		for (int i = 0; i < nums.length; i ++) {
			if (!uniqueNums.contains(Integer.valueOf(nums[i]))) {
				uniqueNums.add(Integer.valueOf(nums[i]));
			}
		}
		System.out.print("{");
		
		//counts number of occurrences in original array
		for(int i = 0; i < uniqueNums.size(); i ++) {
			int count = 0;
			for (int j = 0; j < nums.length; j ++) {
				if(uniqueNums.get(i) == Integer.valueOf(nums[j])) {
					count ++;
				}
			}
			if ((count > 0) && (i == uniqueNums.size()-1)) {
				System.out.print(uniqueNums.get(i) + ":" + count + "}");
			}
			else if (count > 0) {
			System.out.print(uniqueNums.get(i) + ":" + count + ", ");
			}
		}
	}

}
