package calendar;

import java.util.*;

public class CalendarTest {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getMaxDay(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요.");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("달을 입력하세요.");
			int month = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.", month, getMaxDay(month));
		}
	}
}
