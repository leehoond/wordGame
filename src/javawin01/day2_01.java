package javawin01;

public class day2_01 {
	public static final String red = "\u001B[31m";
	public static final String blue     = "\u001B[34m" ;
	public static final String reset = "\u001B[0m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		int sum = 0; // ���� ����
		int cnt = 0; // Ʋ������ ����
		int num = 1;// �������� ���᰹��
		String[] retry = new String[10];// Ʋ�� ���ܾ� �迭
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("���͸� ������ Ÿ�� �������α׷��� �����մϴ�.");
		s.nextLine();
		System.out.println("������ �����մϴ�.(������ �� 10�����̸� 1������ ������ 10���̸� �������� �����Ͻ� ���ʽ����� 1���߰�)");
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(10);// ���ܾ� �迭 �ε����� �������� ����
			String choose = word[index];// ���ܾ� �������� �������� choose
			
			
			if (choose.equals("x")) {// �ؿ��� �ѹ� ���� ���ܾ x�� �ٲ㼭 �ߺ����� �����°��� ����
				i--;
				continue;
			}
			
		
		
			System.out.println(i + 1 + "��: " + choose + "�� ���ÿ�.");
			String write = s.nextLine();

			if (choose.equals(write)) {
				System.out.println(blue+"�����Դϴ�!"+reset);
				sum += 10;
				word[index] = "x";
				num++;
				
			} else {
				System.out.println(red+"Ʋ�Ƚ��ϴ�."+reset);
				retry[cnt] = choose;
				cnt++;
				num = 1;
				word[index] = "x";
			}
			if (num > 2) {
				System.out.println("���� ���� ���ʽ����� 1�� �߰�!");
				sum++;
			}

		}
		System.out.println("���ܾ� Ÿ�ڰ��� ���� �� ������: " + sum + "�� (��10������ " + cnt + "�� Ʋ���̽��ϴ�. )");
		System.out.println();
		System.out.println("Ʋ�������� �ٽ� Ǯ��ÿ�");
		for (int i = 0; i < cnt; i++) {
			System.out.println(retry[i] + "�� ���ÿ�");
			String re = s.nextLine();
			if (re.equals(retry[i])) {

				System.out.println(blue+"�����Դϴ�! "+reset);
				System.out.println();

			} else {
				System.out.println(red+"Ʋ�Ƚ��ϴ� �ٽ��ϼ���."+reset);
				i--;
				continue;
			}

		}
		System.out.println("Ʋ������ ������ �Ϸ��Ͽ����ϴ�. �����ϼ̽��ϴ�.");
	}
}
