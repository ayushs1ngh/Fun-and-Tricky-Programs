public class AlternateCapitalise {

	public static void main(String[] args) {
		String[] result = capitalise("thisisatest");
		
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

	public static String[] capitalise(String s) {
		String odds = "";
		String evens = "";

		for (int i = 0; i < s.length(); i++) {
			String letter = s.substring(i, i + 1);
			
			if (i % 2 == 0) {
				odds += letter.toUpperCase();
				evens += letter.toLowerCase();
			} else {
				odds += letter.toLowerCase();
				evens += letter.toUpperCase();
			}
		}

		return new String[] { odds, evens };
	}
}
