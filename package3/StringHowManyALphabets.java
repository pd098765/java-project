package package3;

public class StringHowManyALphabets {
	static int countOfALpha=0;

	public static void main(String[] args) {
     String input="kv no 2 banglore";
     char[]c1=input.toCharArray();
     for(int i=0;i<input.length();i++) {
    	 boolean b1=Character.isAlphabetic(c1[i]);
    	 if(b1==true) {
    		 countOfALpha++;
    	 }
     }
     System.out.println("Length of the total given String: "+input.length());
	 System.out.println("Count of the Total alphabets: "+countOfALpha);
	}

}
