
public class Assignment_05 {

	public static void main(String[] args) {
		
		int n=15;
		for(int i=0; i<n; i++) {
			
			//Space
			 for(int j=0; j<n/2; j++) {
				 System.out.print(" ");
			 }
			 
			for(int j=0; j<n; j++) {
				if(i+j<=(n-1)/2 || i==0 && j<n-1 || i-j>=(n-1)/2 || i==(n-1) && j<n-1) {
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
