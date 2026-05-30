package package3;

public class String_Buffer_Program {

	public static void main(String[] args) {

	  StringBuffer s1=new StringBuffer("Manual Testing");
      s1.replace(0, 6, " Automation");
      System.out.println(s1);
      
      s1.insert(0, " API");
      System.out.println(s1);
      
      s1.delete(0, 2);
      System.out.println(s1);
      
      System.out.println(s1.substring(0,12));
      
      System.out.println(s1.reverse());
      
      
	}

}
