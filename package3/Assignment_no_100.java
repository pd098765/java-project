package package3;

public class Assignment_no_100 {

	public static void main(String[] args) {

		String input="10 March 2026 20 53 46";
		String[] s1=input.split(" ");
		String[] s2= {"Todays date is: ", "Month is: ", "Year is: ", "Hour is: ", "Min is: ", "Sec is: "};
		
		 for(int i=0; i<s1.length;i++)
		 {
			 System.out.println(s2[i]+s1[i]);
		 }
	}

}
