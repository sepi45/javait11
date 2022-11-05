package day03;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String id;
		int password;
		System.out.println("아이디를입력하세요>>>");
		id = scanner.next();
		System.out.println("비밀번호");
		password = scanner.nextInt();
		
		if (!(id.equals("hello"))||!(password==1234)) {
			System.out.println("없는아이디");
		}
			
			}
		}

