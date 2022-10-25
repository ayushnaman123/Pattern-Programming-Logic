
public class Assignment_02 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1; i<=n; i++) {
			
			//Space
			 for(int j=0; j<n/2; j++) {
				 System.out.print(" ");
			 }
			
			for(int j=1; j<=n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
