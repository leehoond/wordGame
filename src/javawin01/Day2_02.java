package javawin01;

public class Day2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={34,55,23,56,34,45,34};
		int cnt=0;
		for(int i=0;i<7;i++) {
			if(a[i]>40) {
				cnt++;
			}
		}
		System.out.println(cnt);
		}
	}
