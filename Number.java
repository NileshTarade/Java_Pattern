package Javabatch.Pattern;

public class Number {
	public static void main(String[] args) {
		
	
	int n=5;
	int k=1;
	int z=1;
	int st=n;
	
	System.out.println("--------------------------1----------------------------");
	
	for(int i=n;i>=1;i--) {
		
		for(int j=1;j<=z;j++) {
			if(j==1) {
				System.out.print(k+++" ");
			}
		else {
			System.out.print(i+st + " ");
			st=st+i;}
		}st--;
		z++;
		System.out.println();
	
	}	System.out.println();
	System.out.println("--------------------------2----------------------------");
	st=1;
	
	int temp=1;
for(int i=1;i<=n;i++) {
	z=n-1;
		for(int j=1;j<=st;j++) {
			if(j==1) {
				System.out.print(temp++ +" ");
			}
		else {
			z=z+i;
			System.out.print(z + " ");
			
			}
		};
		
		System.out.println();
		st++;
	}	
System.out.println();
	
		

System.out.println("--------------------------3----------------------------");

int rows = 5;

// Initialize the first number
int number = 1;

for (int i = 0; i < rows; i++) {
    // Print each row
    for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        number++;
    }
    System.out.println();
}

}
}





