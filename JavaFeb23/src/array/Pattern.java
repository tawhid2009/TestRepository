package array;

public class Pattern {

	public static void main(String[] args) {
		
		// Pyramid...
		int row = 7;
		
		for(int i = 1; i <= row; i++) {
			for(int j = i+1; j <= row; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < i*2; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("Hurrah!! I have done a pattern/n using nested loop");

		// Stair case...
		for(int l = 1; l <= 6; l++) {
			for(int m = 1; m <= 6; m++) {
				if((l+m) > 6) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
