package lab5;

public class CheckpointOne {

	public static String whatAreInitials(String s) {
		String initials = "";
		int space = 1;
		for (int i = 0; i < s.length(); i += 1) {
			if (s.charAt(i) == ' ') {
				space = 1;
			} else if (space == 1) {
				space = 0;
				initials += s.charAt(i);
			}
		}
		return initials;
	}

	// Main
	public static void main(String[] args) {
		
		String result = whatAreInitials("Preston David Gaskill");
		System.out.println(result);
	}

}
