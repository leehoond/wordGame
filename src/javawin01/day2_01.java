package javawin01;

public class day2_01 {
	public static final String red = "\u001B[31m";
	public static final String blue     = "\u001B[34m" ;
	public static final String reset = "\u001B[0m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		int sum = 0; // 점수 총합
		int cnt = 0; // 틀린문제 갯수
		int num = 1;// 연속으로 맞춘갯수
		String[] retry = new String[10];// 틀린 영단어 배열
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("엔터를 누르면 타자 게임프로그램을 시작합니다.");
		s.nextLine();
		System.out.println("게임을 시작합니다.(문제는 총 10문제이며 1문제당 점수는 10점이며 연속으로 정답일시 보너스점수 1점추가)");
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(10);// 영단어 배열 인덱스를 랜덤으로 뽑음
			String choose = word[index];// 영단어 랜덤으로 뽑은것은 choose
			
			
			if (choose.equals("x")) {// 밑에서 한번 뽑은 영단어를 x로 바꿔서 중복으로 뽑히는것을 막음
				i--;
				continue;
			}
			
		
		
			System.out.println(i + 1 + "번: " + choose + "을 쓰시오.");
			String write = s.nextLine();

			if (choose.equals(write)) {
				System.out.println(blue+"정답입니다!"+reset);
				sum += 10;
				word[index] = "x";
				num++;
				
			} else {
				System.out.println(red+"틀렸습니다."+reset);
				retry[cnt] = choose;
				cnt++;
				num = 1;
				word[index] = "x";
			}
			if (num > 2) {
				System.out.println("연속 정답 보너스점수 1점 추가!");
				sum++;
			}

		}
		System.out.println("영단어 타자게임 종료 총 점수는: " + sum + "점 (총10문제중 " + cnt + "개 틀리셨습니다. )");
		System.out.println();
		System.out.println("틀린문제를 다시 풀어보시오");
		for (int i = 0; i < cnt; i++) {
			System.out.println(retry[i] + "를 쓰시오");
			String re = s.nextLine();
			if (re.equals(retry[i])) {

				System.out.println(blue+"정답입니다! "+reset);
				System.out.println();

			} else {
				System.out.println(red+"틀렸습니다 다시하세요."+reset);
				i--;
				continue;
			}

		}
		System.out.println("틀린문제 복습을 완료하였습니다. 수고하셨습니다.");
	}
}
