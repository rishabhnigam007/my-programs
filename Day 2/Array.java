import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array element :");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Array element is :");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}