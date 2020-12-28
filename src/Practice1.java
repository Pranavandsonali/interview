import java.util.Arrays;
import java.util.HashMap;
public class Practice1 {

	public static void main(String[] args) 
	{
		
		String data="Pranav Chavan";
		String a[]=data.split("\\s");
		String outputString = "";
		for (int i = a.length-1; i >= 0; i--)
		{
		outputString = outputString + a[i] + " ";
		}
		System.out.println(outputString);
		/*char a[]=data.toCharArray();
		String output="";
		for(int i=0;i<a.length;i++)
		{
			if(Character.isDigit(a[i]))
			{
				
			}
			else
			{
				output=output+a[i];
			}
		}
		System.out.println(output);
		/*for(int i=0;i<data.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(Character.toUpperCase(data.charAt(i)));
			}
			else
			{
				System.out.print(Character.toLowerCase(data.charAt(i)));
			}
		}*/
		
		
	
		// TODO Auto-generated method stub
		/*int a[]= {9,3,6,8,4,7,10};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		/*System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("After Sorting");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}*/
		/*String[] a = {"One","Two","Three","Four"};
		for(int i=0;i<a.length;i=i+2)
		{
		System.out.println(a[i]);
		}*/
	}

}
