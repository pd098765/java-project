package package3;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {

    String a="    ";
    String b="mango";
    boolean a1= a.isEmpty();// if length=0
    boolean a2=  a.isBlank();//if length=0 or if it only consist of space or tabs
    
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(b.indexOf('o'));//its o not zero
    System.out.println(b.lastIndexOf('o'));
    
    String b1="my name is pooja deshmukh";
    String[]s1=b1.split(" ");
    System.out.println(Arrays.toString(s1));
    
    String C= "Java,python,JavaScript,Ruby";
    String [] s2=C.split(",");
    System.out.println(Arrays.toString(s2));
    
    String d="10 March 2026 20 53 46";
    String [] dateformat=d.split(" ");
    System.out.println(Arrays.toString(dateformat));
    
    }

}
