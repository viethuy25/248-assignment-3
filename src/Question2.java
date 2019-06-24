//-----------------------------------------------
//Assignment 3
//Written by Huy Nguyen, student ID: 40023289
//For COMP 248 Section W - Winter 2017
//-----------------------------------------------
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int i,j;
		for (i=1;i<=3;i++)
		{
			System.out.print("[");
			if ((i==1)|| (i==3))
				for (j=1;j<=23;j++)
					System.out.print("-");
			else 
				System.out.print("      Array Pattern    ");
			System.out.println("]");
		}
		System.out.println();
		
		int countNum=0,num1,countLoop=0;
		do
		{
			if (countLoop>=1)
				System.out.println("Let's try this again ....");
			System.out.println("How many rows/colums do you want your array "+
								"to have? (Must be at least 3):");
			int num= input.nextInt();
			System.out.println();
			num1=num;
			if (num>=3)
				countNum=1;
			countLoop+=1;
		}
		while (countNum==0);
		int [][]array1= new int[num1][num1];
		
		int count=1;
		System.out.println("Pattern 1:");
		int row=0;
		while (row<num1)
		{
			if (row % 2==0)
        	{
				for (int col=0; col<num1; col++) 
				{
	            	array1[row][col]=count;
	                System.out.printf("%4d", array1[row][col]);
	                count+=1;
            	}
				count+=num1-1;
        	} 	
        	else
        	{
        		for (int col=0; col<num1; col++) 
				{
		    		array1[row][col]=count;
		            System.out.printf("%4d", array1[row][col]);
		            count-=1;
				}
        		count+=num1+1;
        	}
            System.out.println();
           row++;
        }
        System.out.println();
        
        
        count=1;
        row=0;
        int count2=0;
		System.out.println("Pattern 2:");
		while( row<num1) 
		{
			if (row == 0)
        	{
				for (int col=0; col<num1; col++) 
				{
	            	array1[row][col]=count;
	                System.out.printf("%4d", array1[row][col]);
	                count+=1;
            	}
				count-=1;
        	} 	
        	else
        	{
        		for (count2=0;count2<row;count2++)
        		{
        			if (count2==0)
        			{
	        			array1[row][count2]=count+num1;
	        			System.out.printf("%4d", array1[row][count2]);
        			}
        			else
        			{
        				array1[row][count2]=array1[row][count2-1]+1;
        				System.out.printf("%4d", array1[row][count2]);
        			}
        				
        		}
        		for (int col=row; col<num1; col++) 
				{
		    		array1[row][col]=count+count2;
		            System.out.printf("%4d", array1[row][col]);
		            count+=1;
				}
        		count=array1[row][num1-1];
        	}
            System.out.println();
           row++;
        }
        System.out.println();
        
		
		System.out.println("All done!!!!");
		
		input.close();
	}

}
