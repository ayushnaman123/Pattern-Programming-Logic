
public class Assignment_01 {

	public static void main(String[] args) {
           
		   int n=11;
		   
		   for(int i=0; i<n; i++) {
			
			   //Space
			   for(int j=0; j<n/4; j++) {
					System.out.print(" ");
				}   
			//I
			for(int j=0; j<n; j++) {
				if(i==0 && j<=(n-1) ||
						j==(n-1)/2 && i<(n-1) ||
						i==(n-1) && j<=(n-1)) {
					System.out.print("O");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			 //Space
			for(int j=0; j<n/5; j++) {
				System.out.print(" ");
			}
			//N
			for(int j=0; j<n; j++) {
				if(j==0 && i<n ||
						j==n-1 && i<n ||
						i==j && j<(n-1)) {
					System.out.print("O");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			 //Space
			for(int j=0; j<n/5; j++) {
				System.out.print(" ");
			}
			//E
			for(int j=0; j<n; j++) {
				if(i==0 && j<(n-1) ||
						i==(n-1) && j<n-1 ||
						i==(n-1)/2 && j<n-2 ||
						j==0 && i<(n-1)) {
					System.out.print("O");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			 //Space
			for(int j=0; j<n/5; j++) {
				System.out.print(" ");
			}
			//U
			for(int j=0; j<n; j++) {
				if(i<n-1 && j==0|| 
						j==n-1 && i<n-1 || 
						i==n-1 && j>0 && j<n-1){
					System.out.print("O");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			
			 //Space
			for(int j=0; j<n/5; j++) {
				System.out.print(" ");
			}
			//R
			for(int j=0; j<n; j++) {
				if(i==0 && j<(n-2) ||
						 i==(n-1)/2 && j<n-2 ||
						j==0 && i<(n) ||
						 j==(n-2) && i!=0 && i<(n-1)/2 ||
						i==j  && j>=(n-1)/2 && j<=n-1  ) {
					System.out.print("O");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			//Space
			for(int j=0; j<n/5; j++) {
				System.out.print(" ");
			}
			//o
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j<n-1 ||
						j==0 && i!=0 && i<n-1 ||
						i==n-1 && j>0 && j<n-1 ||
						j==n-1 && i!=0 && i<(n-1)) {
					System.out.print("O");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			//Space
			for(int j=0; j<n/5; j++) {
				System.out.print(" ");
			}
			//N
			for(int j=0; j<n; j++) {
				if(j==0 && i<n ||
						j==n-1 && i<n ||
						i==j && j<(n-1)) {
					System.out.print("O");
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
