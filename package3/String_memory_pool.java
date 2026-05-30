package package3;

public class String_memory_pool {

	public static void main(String[] args) {

   String a= "java";
   String b= "java";
   String c= "java";
   boolean b1= a.equals(b);
   System.out.println(b1);
   System.out.println(a==b);
   
   String d=new String("java");//heap memory
   boolean b2=a.equals(d);
   System.out.println(b2);
   System.out.println(a==d);
   
   String s="Automation";//mutable string
   String s1=s.concat(" testing");
   System.out.println(s1);
   

	}

}
