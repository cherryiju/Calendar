package calendar;

import java.util.*;

public class CalendarTest {
	
	public static int parseDay(String week) {
		if (week == "su") return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("we")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int weekday = 0;
		while(true) {
			System.out.println("년을 입력하세요.");
			int year = sc.nextInt();
				
			System.out.println("달을 입력하세요.");
			int month = sc.nextInt();
			if (month == -1) {
				System.out.println("종료합니다.");
				break;
			}
			if (month > 12)
				continue;
			
			System.out.println("요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
			String str_weekday = sc.next();
			weekday = parseDay(str_weekday);
			cal.printCalendar(year, month, weekday);
		}	
		
		System.out.println("bye!");
		sc.close();
	}

}
