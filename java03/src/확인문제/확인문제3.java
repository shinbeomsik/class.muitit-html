package 확인문제;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값입력");
		int num = sc.nextInt();
		System.out.print("종료값입력");
		int num2 = sc.nextInt();
		
		for (int i = num; i <= num2 ; i++) {
		 if (num != num2) {
			num = num + 1;
		}
		 System.out.println(num);
		}
		sc.close();
		

	}

}
