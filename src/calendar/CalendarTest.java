package calendar;

import java.util.*;

public class CalendarTest {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getMaxDay(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("달을 입력하세요.");
			int month = sc.nextInt();
			if (month == -1) {
				System.out.println("종료합니다.");
				break;
			}
			int n=1;
			System.out.println(" 일 월 화 수 목 금 토");
			for (int i=1; i<=getMaxDay(month); i++) {
				if (i%7==0)
					System.out.println();
				System.out.printf("%3d", i);
			}
			System.out.println();
		}
		
		System.out.println("bye!");
		sc.close();
	}
}
