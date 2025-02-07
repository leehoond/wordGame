package javawin01;

import java.util.Arrays;

public class Day3_01 {
	public static final String red = "\u001B[31m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        String[] word = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        int sum = 0; // ���� ����
        int cnt = 0; // Ʋ������ ����
        int num = 1; // �������� ���᰹��
        String[] retry = new String[10]; // Ʋ�� ���ܾ� �迭
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("���͸� ������ Ÿ�� �������α׷��� �����մϴ�.");
        s.nextLine();

        System.out.println("������ �����մϴ�.(������ �� 10�����̸� �������� �����Ͻ� �κ����� 1���߰�, 4���� �̻��� �ܾ�� ���������� ǥ�õǸ� ����� �κ����� 1�� �߰�)");
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(10); // ���ܾ� �迭 �ε����� �������� ����
            String choose = word[index]; // ���ܾ� �������� �������� choose
            if (choose.equals("x")) { // �ؿ��� �ѹ� ���� ���ܾ x�� �ٲ㼭 �ߺ����� �����°��� ����
                i--;
                continue;
            }
            if (choose.length() > 3) {
                choose = red + choose + reset; // ���� �ڵ� ����
            }

            System.out.println(i + 1 + "��: " + choose + "�� ���ÿ�.");
            String write = s.nextLine();

            if (choose.equals(write)) {
                System.out.println("�����Դϴ�!");
                sum += 10;
                word[index] = "x";
                num++;
                if (choose.length() > 3) {
                    sum++;
                    System.out.println("4���� �̻� ���� ���� �κ����� 1���߰�!");
                }
            } else {
                System.out.println("Ʋ�Ƚ��ϴ�.");
                retry[cnt] = choose; // Ʋ�� ���� �߰�
                cnt++;
                num = 1;
                word[index] = "x";
            }
            if (num >= 2) { // ���� ���� �κ����� �߰�
                System.out.println("���� ���� �κ����� 1�� �߰�!");
                sum++;
            }
        }
        System.out.println("���ܾ� Ÿ�ڰ��� ���� �� ������: " + sum + "�� (�� " + cnt + "�� Ʋ���̽��ϴ�. )");
        System.out.println();
        if (cnt > 0) { // Ʋ�� ������ ���� ���� ����
            System.out.println("Ʋ�������� �ٽ� Ǯ��ÿ�");
            for (int i = 0; i < cnt; i++) {
                System.out.println(retry[i] + "�� ���ÿ�");
                String re = s.nextLine();
                if (re.equals(retry[i])) {
                    System.out.println("�����Դϴ�! ");
                    System.out.println();
                } else {
                    System.out.println("Ʋ�Ƚ��ϴ� �ٽ��ϼ���.");
                    i--; // Ʋ���� �ٽ� Ǯ�� ��
                }
            }
        }
        System.out.println("Ʋ������ ������ �Ϸ��Ͽ����ϴ�. �����ϼ̽��ϴ�.");
        s.close(); // Scanner �ݱ�
    }
}
	 
		
		
