package flyweight;

import java.util.Random;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;

	public static void main( String[] args ) {
		/**Rows are intrinsic state and columns/colors are extrinsic states**/

		//Object of Abstract factory to access Flyweight objects
		PixelFactory new_Pixel = new PixelFactory();
		//To generate Random Color
		Random rand =new Random();
		//Object to access setter functions for column and color
		ExtrinsicObj ex_state = new ExtrinsicObj();

		//Iteration over rows and columns
		for(int i=0;i<ROWS;i++)
		{
			for(int j=0;j<COLS;j++)
			{
				PixelInterface Row = new_Pixel.getRow(i);
				ex_state.setState(j,rand.nextInt() % 128 + 128);
				//Passing extrinsic state to Flyweight
				Row.Report(ex_state);
			}
			System.out.print("\n");
	    }
		//To verify that 6 objects are added to the map
		//new_Pixel.ShowList();
    }
}
