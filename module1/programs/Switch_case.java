package module1.programs;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		//int input =20; //this input should come at run time
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter 1 for Chrome");
		System.out.println("Please enter 2 for Firefox");
		System.out.println("Please enter 3 for Edge");
        
		int value = s1.nextInt();

		switch(value){
		case 1:System.out.println("Chrome browser");//launch chrome browser
		break;
		case 2:System.out.println("Firefox browser");//launch firefox browser
		break;
		case 3:System.out.println("Edge browser");//launch edge browser
		break;
		default:
			System.out.println("Your input is wrong");
			s1.close();
				
		} // 'C' for Chrome, 'F' for Firefox, 'E' for Edge  
		switch("Chrome") {
            case "Chrome":
                System.out.println("Chrome browser"); // launch chrome browser
                break;
            case "Firefox":
                System.out.println("Firefox browser"); // launch firefox browser
                break;
            case "Egde":
                System.out.println("Edge browser"); // launch edge browser
                break;
            default:
                System.out.println("Your input is wrong");
        }
		switch('C') {
        case 'A':
            System.out.println("Chrome browser"); // launch chrome browser
            break;
        case 'B':
            System.out.println("Firefox browser"); // launch firefox browser
            break;
        case 'C':
            System.out.println("Edge browser"); // launch edge browser
            break;
        default:
            System.out.println("Your input is wrong");
    }
		
    }	 
		
		}
	


