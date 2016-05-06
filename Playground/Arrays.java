import java.util.Scanner;


public class Arrays {
	
	
	public static void main(String [] args){
	
		
		int[] values;
		
		values = new int[3]; //Giving memory to values
		
		/*Printing*/
		values[0]=19;
		values[1]=12;
		values[2]=1989;
		System.out.println("This is a refular printing"+values[0]);
		
		/*Loops*/
		for (int i=0;i<3;i++){
		System.out.println("This is from loop iteration #"+i+" "+ values[i]);
		
		}
		System.out.println(" ");
		System.out.println("This is the printout of using the length");
		System.out.println(" ");
		for (int i=0;i<values.length;i++){
			System.out.println("This is from loop iteration #"+i+" "+ values[i]);
			
		}
		
		String[] sentence = new String[4];
		sentence[0]="i";
		sentence[1]="want";
		sentence[2]="to";
		sentence[3]="sleep";
		
		System.out.println(" ");
		System.out.println("This is the printout of using the String");
		System.out.println(" ");
		for (int i=0;i<values.length+1;i++){
			System.out.print(sentence[i]+" ");
		
		}
		
		//another way to loop for strings:
		//String[] nums = new String [3];
		System.out.println(" ");
		String nums[] = {"Zero","One","Two"};
		
		for(String counts: nums){
			System.out.println(counts);
		
		}
			
		//MATRIX//
		
		int[][] multi = new int[2][2];
		multi[0][0]=00;
		multi[1][0]=10;
		multi[0][1]=01;
		multi[1][1]=11;
		
		
		int[][] grid = {
				{9,8},
				{7,6},
				{5,4,3}
		};
		System.out.println("");
		System.out.println("This is a multi-dimentional array");
		System.out.println(grid[1][0]);
		
		
		for (int i=0; i<grid.length;i++)
		{
			for (int j=0; j<grid[i].length;j++)
			{
				System.out.println("Printing "+i+" "+j );
				System.out.println(grid[i][j]);
			}
		}
		
		
		
		//Code Challange
		
		Scanner input = new Scanner (System.in);
		int[] nums1 = new int[3];
		
		System.out.println("Hi, Insert 3 numbers below");
		nums1[0]=input.nextInt();
		nums1[1]=input.nextInt();
		nums1[2]=input.nextInt();
		
		int minimum= Arrays.min(nums1[0],nums1[1],nums1[2]);
		
		System.out.println("num[0]: "+ nums1[0]);
		System.out.println("num[1]: "+ nums1[1]);
		System.out.println("num[2]: "+ nums1[2]);
		
		System.out.println("Minimum number is: "+minimum);
		
	}
	
	
	//Function
	
	public static int min(int num1, int num2, int num3)
	{
		//comparison1
		int min=0;
		if ((num1<num2)&&(num1<num3))
		{
			min=num1;
			
		}
		
		else if ((num2<num1)&&(num2<num3))
		{
			min=num2;
		}
		
		else if ((num3<num1)&&(num3<num2))
		{
			min=num3;
		}
		else
		{
			min=-1;
		}
		return min;
	}
	
	

}
