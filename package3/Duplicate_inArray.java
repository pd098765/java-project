package package3;

public class Duplicate_inArray {

	public static void main(String[] args) {

		int[] no=new int[4];
		no[0]=10;
		no[1]=11;
		no[2]=12;
		no[3]=11;
		
		System.out.println("Checking for duplicates....");
		for(int i=0;i<no.length;i++)
		{
			boolean duplicate=false;
			for(int j=0;j<i;j++) 
			{
				if(no[j]==no[i]) 
				{
					duplicate=true;
					break;
				}
			}
			if(duplicate)continue;
			String position =i+"";
			boolean hasduplicate=false;
			for(int k=i+1;k<no.length;k++) 
			{
				if(no[i]==no[k]) 
				{
					position +=","+k;
					hasduplicate=true;
				}
			}
			if(hasduplicate) 
			{
				System.out.println("Number "+no[i]+" is present multiple times at indices:["+ position+"]");
			}
		}
	}
}
