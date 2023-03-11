package array;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] my2DArray = new int[2][3];
		my2DArray[0][0] = 5;
		my2DArray[0][1] = 6;
		my2DArray[0][2] = 7;
		
		my2DArray[1][0] = 8;
		my2DArray[1][1] = 8;
		my2DArray[1][2] = 3;
		
		for(int i = 0; i < my2DArray.length; i++) {
			
			for(int j = 0; j < my2DArray[0].length; j++) {
				
				System.out.println(my2DArray[i][j]);
			}
		}
		System.out.println("The compiler is out of the nested loop");

	}

}
