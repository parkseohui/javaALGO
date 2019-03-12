package javaprac;

//100까지의 소수구하기
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2);

		boolean is=true;
		int i;
		for (i = 3; i <= 100; i++) {
			is=true;
			for (int j = 2; j <i; j++) {
				 if (i % j == 0) {
					 is=false;
					 break;
				}
			}

			if(is) {
				System.out.println(i);
			}
		}
	}
}
