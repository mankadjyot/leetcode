package problems.easy;

//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321
//
//Note:
//The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.


		
public class IntegerReverseAvoidOverflow {
	public int reverse(int x) {

		int rev = 0;
		long rev1 = 0;
		while (x != 0) {
			if (rev1 * 10 > Integer.MAX_VALUE || rev1 * 10 < Integer.MIN_VALUE) {
				rev = 0;
				break;
			}

			rev = rev * 10 + x % 10;
			x = x / 10;
			rev1 = rev;
		}
		return rev;

	}
}
