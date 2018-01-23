package gitPractice;

import java.util.Scanner;

public class girPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("안녕");
		System.out.println("요시!!");
		
		//입력
		System.out.println("숫자를 입력하세요");
		int left = sc.nextInt();
		System.out.println("숫자를 또 입력하세요");
		int right = sc.nextInt();
		
		//출력
		System.out.println("입력한 숫자"+left+","+right);
	}
}
