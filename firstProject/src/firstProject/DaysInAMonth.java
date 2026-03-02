package firstProject;

public class DaysInAMonth {

	public static void main(String[] args) {
		int month = 3;
		int year = 2000;
		int days = 0;
		switch(month){
			case 1: 
			case 3:  
			case 5: 
			case 7: 
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if((year%400==0) || (year%4==0 && year%100!=0)) {
					days = 29;
				}else {
					days = 28;
				}
			default:
				System.out.println("You entered a wrong input");
				break;
			
		}
		System.out.println("Number of Days = " + days);
			
	}

}
