
public class Assignment_03 {

	public static void main(String[] args) {
		int n=14;
		for(int i=0;i<n;i++)
		{ 
			//Space
			 for(int j=0; j<n/2; j++) {
				 System.out.print(" ");
			 }
			 
			for(int j=0;j<n;j++)
			{
				
				if(i+j<=(n-1)/2 || j-i>(n-1)/2 ||  j==0 && i<(n-1) || j==n-1 && i<(n-1) ||
						i==n-1 && j<=n-1
					
					) {
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
