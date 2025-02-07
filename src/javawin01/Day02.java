package javawin01;

import java.util.*;

public class Day02 {
	public static final String red = "\u001B[31m";
	public static final String blue = "\u001B[34m";
	public static final String reset = "\u001B[0m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		int sum = 0; // 점수 총합
		int cnt = 0; // 틀린문제 갯수
		int num = 0;// 연속으로 맞춘갯수
		int bonus = 0;// 보너스 점수
		int[] retun = new int[word.length];

		String[] retry = new String[10];// 틀린 영단어 배열
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("엔터를 누르면 타자 게임프로그램을 시작합니다.");
		s.nextLine();
		while (true) {
			System.out.println("게임을 시작합니다.(문제는 총 10문제이며 1문제당 점수는 10점이며 연속으로 정답일시 보너스점수 1점추가)");

			for (int i = 0; i < 10; i++) {
				int index = r.nextInt(word.length); // 영단어 배열 인덱스를 랜덤으로 뽑음
				String choose = word[index]; // 영단어 랜덤으로 뽑은번호의 인덱스는 choose로 저장
				retun[index]++;

				if (retun[index] > 1) { // 밑에서 한번 뽑은 영단어를 x로 바꿔서 중복으로 뽑히는것을 막음
					i--;
					continue;
				}

				System.out.println(i + 1 + "번: " + choose + "을 쓰시오.");
				String write = s.nextLine();

				if (choose.equals(write)) {
					System.out.println(blue + "정답입니다!" + reset);
					sum += 10;
					num++;
					// num 은 연속으로 정답인지 확인하기 위해 만든 변수이다
				} else {
					System.out.println(red + "틀렸습니다." + reset);
					retry[cnt] = choose;
					cnt++;
					num = 0;

					// num 을 0으로 만들어 연속정답횟수를 끊음
				}
				if (num > 1) {
					System.out.println("연속 정답 보너스점수 1점 추가!");
					sum++;
					bonus++; // 보너스 점수
				}

			}

			System.out.println(word[1] + "" + word[2]);
			System.out.println(
					"영단어 타자게임 종료 총 점수는: " + sum + "점(보너스 점수는 " + bonus + "점)" + "(총10문제중" + cnt + "개 틀리셨습니다. )");
			if (sum > 100) {
				System.out.println("오답이 없어 복습은 안하겠습니다. 게임을 다시 하실거면 아무거나입력 종료하실려면 x를 눌러주세요.");
				String end = s.nextLine();
				if (end.equals("x")) {
					System.out.println("종료하였습니당");
					break;
				} else {
					System.out.println(" 재시작 하겠습니다.");
					retun = new int[10];
				}

			}

			System.out.println();
			System.out.println("틀린문제를 다시 풀어보시오");
			for (int i = 0; i < cnt; i++) {
				System.out.println(retry[i] + "를 쓰시오");
				String re = s.nextLine();
				if (re.equals(retry[i])) {

					System.out.println(blue + "정답입니다! " + reset);
					System.out.println();

				} else { // 틀린문제 복습중 또 틀렸을시 정답일때까지 계속 반복
					System.out.println(red + "틀렸습니다 다시하세요." + reset);
					i--;
					continue;
				}

			}
			System.out.println("틀린문제 복습을 완료하였습니다. ");
			System.out.println(" 종료하시려면 x 재시작하시려면 아무거나 누르시오");
			String The = s.nextLine();
			if (The.equals("x")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("재시작하겠습니다.");
				retun=new int[10];
			}
		}
	}
}