package problems.easy;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
		
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

		int[] abc = new int[2];
		Integer match = new Integer(target);

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == match - nums[i]) {
					int total = nums[i] + nums[j];
					System.out.println(total);
					if (match.equals(total)) {
						abc[0] = i;
						abc[1] = j;
						break;
					}
				}
			}

		}
		return abc;
	}
}
