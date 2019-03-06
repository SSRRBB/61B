public class DrawTriangle{
    public static void drawTriangle(int n) {
	    int row = 0;
		int size = n;
		while(row < size) {
		int col = 0;
		while(col <= row) {
		    System.out.print('*');
			col++;
		}
		System.out.println();
		row++;
		}
	}
	
    public static void main(String[] args) {
    drawTriangle(5);  //    drawTriangle(Integer.parseInt(args[0]));    
    }
}


// public class DrawTriangle{
	// public static void draw(int n)
	// {
		// for(int i=1;i<=n;++i)
		// {
			// for(int j=0;j<i;++j)
			// {
				// System.out.print('*');
			// }
			// System.out.println();
		// }
	// }

	// public static void main(String[] args) 
	// {
		// draw(5); //    drawTriangle(Integer.parseInt(args[0])); 
	// }
// }