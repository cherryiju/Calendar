package calendar;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAF_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static boolean isLeafDay(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else return false;
	}
	
	public static int getMaxDay(int year, int month) {
		if (isLeafDay(year)) return LEAF_MAX_DAYS[month-1];
		else return MAX_DAYS[month-1];
	}
	
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("  <<%4d년 %3d월>>\n ", year, month);
		System.out.println("SU MO TU WE TH FR SA");
		
		for (int i=0; i < weekday; i++) {
			System.out.print("   ");
		}
		
		for (int j=1; j<=getMaxDay(year,month); j++) {
			if (j+weekday-1 == 0) ;
			else if ((j+weekday-1)%7 == 0)
				System.out.println();
			System.out.printf("%3d", j);
		}
		System.out.println();

	}
}
