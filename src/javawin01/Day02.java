package javawin01;

import java.util.*;

public class Day02 {
	public static final String red = "\u001B[31m";
	public static final String blue = "\u001B[34m";
	public static final String reset = "\u001B[0m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		int sum = 0; // ���� ����
		int cnt = 0; // Ʋ������ ����
		int num = 0;// �������� ���᰹��
		int bonus = 0;// ���ʽ� ����
		int[] retun = new int[word.length];

		String[] retry = new String[10];// Ʋ�� ���ܾ� �迭
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("���͸� ������ Ÿ�� �������α׷��� �����մϴ�.");
		s.nextLine();
		while (true) {
			System.out.println("������ �����մϴ�.(������ �� 10�����̸� 1������ ������ 10���̸� �������� �����Ͻ� ���ʽ����� 1���߰�)");

			for (int i = 0; i < 10; i++) {
				int index = r.nextInt(word.length); // ���ܾ� �迭 �ε����� �������� ����
				String choose = word[index]; // ���ܾ� �������� ������ȣ�� �ε����� choose�� ����
				retun[index]++;

				if (retun[index] > 1) { // �ؿ��� �ѹ� ���� ���ܾ x�� �ٲ㼭 �ߺ����� �����°��� ����
					i--;
					continue;
				}

				System.out.println(i + 1 + "��: " + choose + "�� ���ÿ�.");
				String write = s.nextLine();

				if (choose.equals(write)) {
					System.out.println(blue + "�����Դϴ�!" + reset);
					sum += 10;
					num++;
					// num �� �������� �������� Ȯ���ϱ� ���� ���� �����̴�
				} else {
					System.out.println(red + "Ʋ�Ƚ��ϴ�." + reset);
					retry[cnt] = choose;
					cnt++;
					num = 0;

					// num �� 0���� ����� ��������Ƚ���� ����
				}
				if (num > 1) {
					System.out.println("���� ���� ���ʽ����� 1�� �߰�!");
					sum++;
					bonus++; // ���ʽ� ����
				}

			}

			System.out.println(word[1] + "" + word[2]);
			System.out.println(
					"���ܾ� Ÿ�ڰ��� ���� �� ������: " + sum + "��(���ʽ� ������ " + bonus + "��)" + "(��10������" + cnt + "�� Ʋ���̽��ϴ�. )");
			if (sum > 100) {
				System.out.println("������ ���� ������ ���ϰڽ��ϴ�. ������ �ٽ� �ϽǰŸ� �ƹ��ų��Է� �����ϽǷ��� x�� �����ּ���.");
				String end = s.nextLine();
				if (end.equals("x")) {
					System.out.println("�����Ͽ����ϴ�");
					break;
				} else {
					System.out.println(" ����� �ϰڽ��ϴ�.");
					retun = new int[10];
				}

			}

			System.out.println();
			System.out.println("Ʋ�������� �ٽ� Ǯ��ÿ�");
			for (int i = 0; i < cnt; i++) {
				System.out.println(retry[i] + "�� ���ÿ�");
				String re = s.nextLine();
				if (re.equals(retry[i])) {

					System.out.println(blue + "�����Դϴ�! " + reset);
					System.out.println();

				} else { // Ʋ������ ������ �� Ʋ������ �����϶����� ��� �ݺ�
					System.out.println(red + "Ʋ�Ƚ��ϴ� �ٽ��ϼ���." + reset);
					i--;
					continue;
				}

			}
			System.out.println("Ʋ������ ������ �Ϸ��Ͽ����ϴ�. ");
			System.out.println(" �����Ͻ÷��� x ������Ͻ÷��� �ƹ��ų� �����ÿ�");
			String The = s.nextLine();
			if (The.equals("x")) {
				System.out.println("����");
				break;
			} else {
				System.out.println("������ϰڽ��ϴ�.");
				retun=new int[10];
			}
		}
	}
}