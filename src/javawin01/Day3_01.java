package javawin01;

import java.util.Arrays;

public class Day3_01 {
	public static final String red = "\u001B[31m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        String[] word = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        int sum = 0; // 점수 총합
        int cnt = 0; // 틀린문제 갯수
        int num = 1; // 연속으로 맞춘갯수
        String[] retry = new String[10]; // 틀린 영단어 배열
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("엔터를 누르면 타자 게임프로그램을 시작합니다.");
        s.nextLine();

        System.out.println("게임을 시작합니다.(문제는 총 10문제이며 연속으로 정답일시 부분점수 1점추가, 4글자 이상의 단어는 빨간색으로 표시되며 정답시 부분점수 1점 추가)");
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(10); // 영단어 배열 인덱스를 랜덤으로 뽑음
            String choose = word[index]; // 영단어 랜덤으로 뽑은것은 choose
            if (choose.equals("x")) { // 밑에서 한번 뽑은 영단어를 x로 바꿔서 중복으로 뽑히는것을 막음
                i--;
                continue;
            }
            if (choose.length() > 3) {
                choose = red + choose + reset; // 색상 코드 종료
            }

            System.out.println(i + 1 + "번: " + choose + "을 쓰시오.");
            String write = s.nextLine();

            if (choose.equals(write)) {
                System.out.println("정답입니다!");
                sum += 10;
                word[index] = "x";
                num++;
                if (choose.length() > 3) {
                    sum++;
                    System.out.println("4글자 이상 문제 정답 부분점수 1점추가!");
                }
            } else {
                System.out.println("틀렸습니다.");
                retry[cnt] = choose; // 틀린 문제 추가
                cnt++;
                num = 1;
                word[index] = "x";
            }
            if (num >= 2) { // 연속 정답 부분점수 추가
                System.out.println("연속 정답 부분점수 1점 추가!");
                sum++;
            }
        }
        System.out.println("영단어 타자게임 종료 총 점수는: " + sum + "점 (총 " + cnt + "개 틀리셨습니다. )");
        System.out.println();
        if (cnt > 0) { // 틀린 문제가 있을 때만 복습
            System.out.println("틀린문제를 다시 풀어보시오");
            for (int i = 0; i < cnt; i++) {
                System.out.println(retry[i] + "를 쓰시오");
                String re = s.nextLine();
                if (re.equals(retry[i])) {
                    System.out.println("정답입니다! ");
                    System.out.println();
                } else {
                    System.out.println("틀렸습니다 다시하세요.");
                    i--; // 틀리면 다시 풀게 함
                }
            }
        }
        System.out.println("틀린문제 복습을 완료하였습니다. 수고하셨습니다.");
        s.close(); // Scanner 닫기
    }
}
	 
		
		
