package javawin01;

import java.util.Random;
import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] name = new String[5];
		System.out.println("5개의 기차명을 등록하시오.");
		for (int i = 0; i < 5; i++) {
			name[i] = s.nextLine();
		}
		System.out.println("등록된 기차명은");
		for (int i = 0; i < 5; i++) {
			System.out.print(" " + name[i] + " ");
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("모든 기차명을 검색해보세요");

		for (int i = 0; true ; i++) {
			String ser = s.nextLine();
			if (ser=="종료") {
				break;
			}
			if (name[0].equals(ser) || name[1].equals(ser) || name[2].equals(ser) || name[3].equals(ser)
					|| name[4].equals(ser)) {
				System.out.println("검색하신 기차는:" + ser+"(검색을 종료하실라면 종료 아니시면 계속 검색하세요.)" );
			} else {
				System.out.println("없는 기차명 입니다. 다시 선택하세요");
		

			}
		}
		System.out.println(" 검색을 종료하였습니다.");

	}

}
