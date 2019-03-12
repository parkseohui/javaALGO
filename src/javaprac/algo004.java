//버블정렬
package javaprac;
public class algo004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5,3,1,2};
		int n=array.length;
		bubblesort(n,array);

		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}
	public static void bubblesort(int n,int[] array) {
		for(int i=n-1;i>0;i--) {
			int tmp;
			for(int j=0;j<n-1;j++) {
				if(array[j]>array[j+1])
				{
					tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}


			}
		}
	}
}
