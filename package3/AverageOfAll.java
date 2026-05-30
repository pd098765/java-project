package package3;

public class AverageOfAll {

	public static void main(String[] args) {
		// average of a
		double []array=new double[4];
		array[0]=20;
		array[1]=31;
		array[2]=30;
		array[3]=20;
		
        double sum=0;
        for(int i=0;i<array.length;i++) {
        	sum=sum+array[i];
        	
        }
        System.out.println(sum);
        double average = sum/array.length;
        System.out.println("The average of all the given array is:"+average);

		
	}

}
