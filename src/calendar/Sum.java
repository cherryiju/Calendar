package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			System.out.println(month+"월은 31일까지 있습니다.");
		}else
			System.out.println(month+"월은 30일까지 있습니다.");
		
	}

}
