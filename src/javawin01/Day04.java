package javawin01;

import java.util.Random;
import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] name = new String[5];
		System.out.println("5���� �������� ����Ͻÿ�.");
		for (int i = 0; i < 5; i++) {
			name[i] = s.nextLine();
		}
		System.out.println("��ϵ� ��������");
		for (int i = 0; i < 5; i++) {
			System.out.print(" " + name[i] + " ");
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("��� �������� �˻��غ�����");

		for (int i = 0; true ; i++) {
			String ser = s.nextLine();
			if (ser=="����") {
				break;
			}
			if (name[0].equals(ser) || name[1].equals(ser) || name[2].equals(ser) || name[3].equals(ser)
					|| name[4].equals(ser)) {
				System.out.println("�˻��Ͻ� ������:" + ser+"(�˻��� �����ϽǶ�� ���� �ƴϽø� ��� �˻��ϼ���.)" );
			} else {
				System.out.println("���� ������ �Դϴ�. �ٽ� �����ϼ���");
		

			}
		}
		System.out.println(" �˻��� �����Ͽ����ϴ�.");

	}

}
