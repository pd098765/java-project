package package3;

public class StringOnlyConsistOfAlphabet {

	static int countOfAlpha=0;
	public static void main(String[] args) {

		String input="school";
		char[]c1=input.toCharArray();
		for(int i=0;i<input.length();i++) {
			boolean b1=Character.isAlphabetic(c1[i]);
			if(b1==true) {
				countOfAlpha++;
			}
		}
		System.out.println(countOfAlpha);
		if(countOfAlpha==input.length()) {
			System.out.println("String consist of only alphabets");
		}else {
			System.out.println("Not just alphabet");
		}
	}

}
