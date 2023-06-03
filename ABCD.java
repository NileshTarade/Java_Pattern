package Javabatch.Pattern;

public class ABCD 
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		char alpha='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(alpha++ +" ");
			}
			System.out.println();
			 alpha='A';
		}
		System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(102-i)+" ");
			}
			System.out.println();
	}
		System.out.println(); 
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(k>8) {
					k=0;
				}
				System.out.print(++k +" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(m%2+" ");
				m++;
			}
			System.out.println();
		}System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||j==n||i==n) {
					System.out.print("# ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}System.out.println();
		
		//---------------------------- New program----------------------------------//
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}System.out.println();
		
		//---------------------------- New program----------------------------------//
	
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
		
		//---------------------------- New program----------------------------------//
		}
	}

