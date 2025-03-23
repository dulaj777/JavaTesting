public class new1{
	
	static void rotate()
	{
		int x = arr[arr.length-1],i;
		for(i=arr.length-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=x;
	}
	
     /*Driver program*/

public static void main(String[]args)
	
	{
     System.out.println("Give Array is");
	 System.out.println(Arrays.toString(arr));
	 rotate();
	 System.out.println("Rotated Array is");
	 System.out.println(Arrays.toString(arr));
	 
	}
}