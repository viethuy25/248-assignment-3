//-----------------------------------------------
//Assignment 3
//Written by Huy Nguyen, student ID: 40023289
//For COMP 248 Section W - Winter 2017
//-----------------------------------------------
public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=1;i<=3;i++)
		{
			System.out.print("|");
			if ((i==1)|| (i==3))
				for (j=1;j<=27;j++)
					System.out.print("-");
			else 
				System.out.print("    Locksmith Program      ");
			System.out.println("|");
		}
		System.out.println();
		
		CombinationLock lock1 = new CombinationLock();
		lock1.setCombination(0,0,0);
		
		System.out.print("Combination for lock 1 is: " + lock1);
		
		public String toString () {
			return ( 13 + "\t" + 7 + "\t" + 11 );
		}
		
	}
	
	public static class CombinationLock {
		private int num1,num2,num3;
		private boolean status;
		
		public CombinationLock() {
			num1=0;
			num2=0;
			num3=0;
			status = false;
		}
		
		public CombinationLock(int m, int n, int j) {
			m= num1;
			n= num2;
			j= num3;
			status= true;
		}
		
		public boolean setCombination(int m, int n, int j){
			if (status = true)
				return false;
			else
			{
				num1 = m;
				num2 = n;
				num3 = j;
				return true;
			}
		}
		
		public void closeLock(){
			status = false;
		}
		
		public boolean isOpenLock() {
				return status;
		}
		
		public boolean openLock(int m,int n, int k) {
			if (num1==m && num2==n && num3==k)
			{
				status=true;
				return true;
			}
			else
				return false;
		}
		
		public int HowmManyIsOpen(int count1,int count2, int count3){
			int count=0;
			if (count1== num1)
				count+=1;
			if (count2== num2)
				count+=1;
			if (count3== num3)
				count+=1;
			
			return count;
		}
		
		public String toString() {
			return "Clockwise " + num1 + " - " + num2 + " - " + num3;
		}
		
		public void equal(CombinationLock c) {
			if ( (c.num1==num1)&&(c.num2==num2)&&(c.num3==num3) ){
				System.out.println("Combination of both locks is the same");
			}
			else
				System.out.println("Combination of both clock is NOT the same");
		}
	}


}
