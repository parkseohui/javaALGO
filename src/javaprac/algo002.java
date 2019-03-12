//배열에서 중복되는 것 구하기
package javaprac;
import java.util.Scanner;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int n = array.length;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (i == j)
					continue;
				if (array[i] == array[j]) {
					System.out.printf("%d,%d\n", array[i], array[j]);
				}

			}
		}
	}

}
