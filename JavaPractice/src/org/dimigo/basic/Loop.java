/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Loop
 *
 * 1. 개요 : 초간단 게임프로그램
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author : 송혜민
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice, attack=100;
		
		do{
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------");
			System.out.println("메뉴 입력 => ");
			
			choice = scanner.nextInt();
					
			switch(choice) {
			case 1:
				attack+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+attack);
				break;
			case 2:
				attack-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+attack);
				break;
			case 3:
				String[] cha = {"마법사", "영주", "기사", "농민"};
		        int c=new Random().nextInt(3);
				System.out.println(cha[c]+"(으)로 설정 되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
				break;
			}

	}while(choice!=9);}}
