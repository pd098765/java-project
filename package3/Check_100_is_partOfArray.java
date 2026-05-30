package package3;

public class Check_100_is_partOfArray {

	public static void main(String[] args) {
    int[] rollno=new int[4];
    
    rollno[0]=45;
    rollno[1]=100;
    rollno[2]=40;
    rollno[3]=30;
    int A=100;
    boolean isPresent=false;
     
     for(int i=0;i<rollno.length;i++) 
     {
    	 if(rollno[i]==A) 
    	 {
    		 isPresent=true;
    		 break;
    	 }
     }
    	 if(isPresent) 
    	 {
    		 System.out.println(A +" is a part of the array");
    	 }else {
    		 System.out.println(A+" is not in the array");
    	 }
     }
	}


