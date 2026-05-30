package myCodes;

public class Fibonacci_Series {

	public static void main(String[] args) {
    int n=5;
    int firstTerm=0;
    int SecondTerm=1;
    
    System.out.println("Fibonacci series up to "+ n +" terms:");
    
    for(int i=1;i<=n;i++) 
    {
    	System.out.println(firstTerm+" ");
    	
    	//calculate next term
    	int nextTerm=firstTerm+SecondTerm;
    	firstTerm=SecondTerm;
    	SecondTerm=nextTerm;		
    }
	}
}
