package module1.programs;
class Moon {
	private static final char X = 0;//without creating this constant I am not able to call C in line no. 11
	Moon(char a){
		
	System.out.println("3rd constructor");	
	}
    
	Moon()
	{
	this(X);
	System.out.println("4th constructor");
}
}

public class FlipKart3 extends Moon{
	FlipKart3(){
		super();
		System.out.println("2nd constructor");
	}

	FlipKart3(int a) {
    this();
    System.out.println("1st constructor");
	}

	public static void main(String[] args) {
     new FlipKart3(100);
	}

}
