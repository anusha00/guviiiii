import java.util.Scanner;
 class composite
 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=in.nextInt();
		int count=1;
		for(int i=1;i<=num;i++)
		{  
			if(num%i==1)
			{
				count++;
			}
		}if(count>3)
			{
				System.out.print("yes");
			}else
				System.out.print("no");		
	}
}
