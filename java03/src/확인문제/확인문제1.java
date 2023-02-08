package 확인문제;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요");
		String id = sc.next();
		System.out.print("비밀번호를 입력해주세요");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}
		
		
		sc.close();

	}

}
