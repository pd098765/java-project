package package3;

import java.util.Date;

public class DateCurrentTime 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*1l));//1l its long data type
		Date d3=new Date(d1.getTime()-(1000*60*60*24*1l));//1l its long data type

		System.out.println(d2);
		System.out.println(d3);
		
		String s1= d2.toString();
		String month= s1.substring(4, 7);
		String date= s1.substring(8, 10);
		String hour= s1.substring(11, 13);
		String min= s1.substring(14, 16);
		String sec= s1.substring(17, 19);
		String year= s1.substring(s1.length()-4);
		
        String format1= date.concat(" Y:").concat(month).concat(year).concat(" H:").concat(hour).concat(" Min:").concat(min);
        System.out.println(format1);
        String format2= date.concat("/").concat(month).concat("/").concat(year);
        System.out.println(format2);

	}
}
	