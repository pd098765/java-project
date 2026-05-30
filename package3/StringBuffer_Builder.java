package package3;

public class StringBuffer_Builder {

	public static void main(String[] args) {
		
    StringBuffer b=new StringBuffer("java");//mutable and heap memory
    b.append(" selenium");
    System.out.println(b);
    
    StringBuilder s=new StringBuilder("python");
    s.append(" selenium");
    System.out.println(s);
    
    
	}

}
