package lab5;

public class CheckpointOneP2 {

	public static int index(String s) {

		int i = 0;

		while (i < s.length()) {
			if ("aeiouAEIOU".indexOf(s.charAt(i)) >= 0) {
				return i;
			}
			i++;
		}

		return -1;
	}

	// Main
	public static void main(String[] args) {

		int result = index("Preston");
		System.out.println(result);
	}

}
