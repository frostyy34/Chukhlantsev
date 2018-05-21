public class Palindrome {
//madam racecar apple kayak song noon
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			if(isPalindrome(args[i]))
				System.out.println("Slovo " + args[i] + " yavlyaetsya palindromom.");
			else
				System.out.println("Slovo " + args[i] + " ne yavlyaetsya palindromom.");
		}
	}

	public static String reverseString(String str) {
		String temp = "";
		for(int i = str.length() - 1; i >= 0; i--)
			temp += str.charAt(i);
		return temp;
	}
	
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}
}
