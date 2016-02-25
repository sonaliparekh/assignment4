
public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[] arr = new int[15];
			
			for(int i=0;i<10;i++)
			{
				arr[i] = i;
			}
			
			System.out.println("Elements of array are  \n");
			for(int i=0;i<10;i++)
			{
				System.out.println(arr[i]);
			}
			
			
			System.out.println("Reverse of array is \n");
			for(int i=9;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
			
	}

}
