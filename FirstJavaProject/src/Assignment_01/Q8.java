package Assignment_01;

public class Q8 {
public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = a.length;
		
		array obj = new array();
		n=obj.delete(a, n, 3);
		obj.print_array(a, n);
		
	}

}

class array 
{
	int i;
	int delete(int []a, int n, int index)
	{
		
		for(i = index; i < n-1; i++)
		{
			a[i] = a[i+1];
		}
		a[n - 1] = 0;
		return n-1;
	}
	
	void print_array(int []a ,int n)
	{
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}