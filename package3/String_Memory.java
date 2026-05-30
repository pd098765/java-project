package package3;

public class String_Memory {

	public static void main(String[] args) {


		String a="Java";//string pool area
		String a1=new String("Java");//heap memory
		int[] a2= new int[4];//heap memory
		
		String_Memory s1= new String_Memory();
		boolean b1=a.equals(a1);
		System.out.println(b1);
	}

}
