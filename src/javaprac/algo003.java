//하나씩 밀린 배열 
package javaprac;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		int[] num=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			num[i]=input.nextInt();
		}

		int n=num.length;
		int tmp=num[n-1];

		for(int i=n-2;i>=0;i--) {
			num[i+1]=num[i];
		}
		num[0]=tmp;

		for(int i=0;i<num.length;i++)
		System.out.println(num[i]);

		}

}
