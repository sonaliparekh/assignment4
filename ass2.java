
public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sorting of array
		
		int[] arr = {9,23,4,6,1,5,3,11};
		int temp;
		//System.out.println("element " + arr[0]);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j]= temp;
				}
			}
		}
		
		System.out.println("Value of sorted Array is \n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	
		int length = arr.length;
		
		int[] arr2 =new int[length+1];
		for(int i=0;i<length;i++)
		{
			arr2[i] = arr[i];
		}
		arr2[length] = 77;
		
		
		System.out.println("Values after inserting an element\n ");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}	
	}
	
	
	

	
}


