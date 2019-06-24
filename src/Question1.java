//-----------------------------------------------
//Assignment 3
//Written by Huy Nguyen, student ID: 40023289
//For COMP 248 Section W - Winter 2017
//-----------------------------------------------

import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int i,j;
		for (i=1;i<=5;i++)
		{
			if ( (i==1) || (i==5))
			{
				for (j=1; j<=31; j++)
				{
					if ( (j % 2) ==0)
						System.out.print("0 ");
					else
						System.out.print("= ");
				}
				System.out.println();
			}
			else if (i%2==0)
			{
				for (j=1; j<=58; j++)
				{
					if ( (j==1)|| (j==58))
						System.out.print("= ");
					else if( (j==2)||(j==57))
						System.out.print("0 ");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			else
				System.out.println("= 0        NHL Miniature Hokey Puck Vending Machine       0 =");
		}
		System.out.println();
		
		System.out.print("Hello, what is your first name? ");
		String firstName = input.nextLine();
		System.out.println("Welcome "+ firstName + "! Let's see how much money you need to spend to "
							+ "get all of the pucks.");
		System.out.println();
		
		final int price=2;
		System.out.println("Here is the breakdown of the pucks dispensed: ");
		String [] teamName= {"Montreal Canadians","Boston Bruins","Chicago BlackHawks","Detroit Red Wings","New York Rangers",
							"Buffalo Sabres","Philadelphia Flyers","Winnipeg Jets","Vancouver Canucks","Ottawa Senators"};
		int [] count= new int[10];
		int time=0,countPuck=0,n=0;
		
		for (int position=0; position < teamName.length; position++)
		{
			while(time==0)
			{		
				n= (int) (Math.random()*10);
				if (n==0)
				{
					position-=1;
					break;
				}
				else
				{
					count[n]=n;
					countPuck+=count[n];
					System.out.println(teamName[position]+ ": "+ n);
					time=1;
				}
			}
			time=0;
		}
		
		System.out.println();
		
		System.out.println("Wow "+ firstName + ", you bought a total of "+ countPuck +" pucks at a total cost of "
							+ countPuck*price + " to get a miniature puck of each team.");
		System.out.println("Enjoy them!");
		input.close();
	}

}
