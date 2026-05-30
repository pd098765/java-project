package package3;

public class String_Matches_Replace {

	public static void main(String[] args) {

     String a="manual";
     // to check if your string starts with A or not
     boolean b1=a.matches("m(.*)");//checking if the name starts with a or not
     System.out.println(b1);
     
     //to check if the string end with m
     boolean b2=a.matches("(.*)l");
     System.out.println(b2);
     
     // to check if the string starts with https or not
     //https://www.google.com/
     String url="https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_1tmvcmz30t_e&adgrpid=1329311168025487&hvadid=83082214468070&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=156919&hvtargid=kwd-83082829756950:loc-90&hydadcr=5650_2377261&mcid=6233a7c588f136ff9af0c63d9f6745bc&msclkid=bfdc543ba2801161309f3d8bfa57622a";
     boolean b3=url.matches("https(.*)");//starts with https
     System.out.println(b3);
     
     String url1="https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
     boolean b4=url1.matches("(.*)cart");//ends with cart
     System.out.println(b4);
     
     //Replace
     String newanswer= a.replace('m', 'M');
     System.out.println(newanswer);
     
     String B="manual testing";
     String h1= B.replace("manual", "Automation");
     System.out.println(h1);
     
     String c="Manual";//remove all the smaller letters
     String h2=c.replaceAll("[a-z]", "");//remove all smaller letters
     System.out.println(h2);
     String h3=c.replaceAll("[A-Z]", "");//remove all capital letters
     System.out.println(h3);
     String h4="Kv no 2";
     String d1=h4.replaceAll("[0-9]", "");
     System.out.println(d1);
     
     
     
     
     
     
     
     
     
     
  
     
     
     
	}

}
