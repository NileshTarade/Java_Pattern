package Javabatch.Pattern;

public class NumberPattern
{
	public static void main(String[] args) 
	{
		int n=5;
	
		System.out.println("--------------------------1----------------------------");
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
	  {
		int x=i;	
		for(int j=n;j>=1;j--)
		{
			if(j==n)
			{
				System.out.print(i +" ");
			}
			else 
			{
				System.out.print(x+j+" ");
				x=x+j;
			}
		}
		 		System.out.println();
	  }	
				System.out.println();
				
			System.out.println("--------------------------2----------------------------");
			System.out.println();
			
				//---------------------------- New program----------------------------------//
				
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}System.out.println();
				
				System.out.println("--------------------------3----------------------------");
				System.out.println();
				
				
				//---------------------------- New program----------------------------------//
				
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(j+ " ");
					}
					System.out.println();
				}System.out.println();
				
				System.out.println("--------------------------4----------------------------");
				System.out.println();
				
				
				//---------------------------- New program----------------------------------//

				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(j%2+ " ");
					}
					System.out.println();
				}System.out.println();
				
				System.out.println("--------------------------5----------------------------");
				System.out.println();
				
				
				//---------------------------- New program----------------------------------//
				
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(i%2+ " ");
					}
					System.out.println();
				}System.out.println();
				
				System.out.println("--------------------------6----------------------------");
				System.out.println();
				
				
//---------------------------- New program----------------------------------//
				
				for(int i=1;i<=n;i++) {
					for(int j=i;j>=1;j--) {
						System.out.print(j+ " ");
					}
					System.out.println();
				}System.out.println();
				
				System.out.println("--------------------------7----------------------------");
				System.out.println();
				
				
				
//---------------------------- New program----------------------------------//
				
				for(int i=1;i<=n;i++) {
					int k=n;
					for(int j=1;j<=i;j++) {
						
						System.out.print(k-- + " ");
					}
					System.out.println();
				}System.out.println();
				
				System.out.println("--------------------------8----------------------------");
				System.out.println();
				
				
				//---------------------------- New program----------------------------------//
				int st=1;
				
				for(int i=n;i>=1;i--) {
					int temp=i;
					for(int j=1;j<=st;j++) {
						if(j==1) {
						System.out.print(i
								+ " ");}
						else {
							System.out.print(++temp+" ");
						}
					}st++;
					System.out.println();
					
				}System.out.println();
				
				System.out.println("--------------------------9----------------------------");
				System.out.println();
						
				st=1;
				
				for(int i=1;i<=n;i++) {
					int temp=n;
					for(int j=1;j<=st;j++) {
						
						if(j==1) {
						System.out.print(i
								+ " ");}
						else {
							
							System.out.print(temp+j-1+" ");
							temp=temp+i;
						}
					}st++;
					System.out.println();
					
				}System.out.println();
	}
		
}
