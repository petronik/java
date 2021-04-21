
public class Drawing {

	public static void main(String[] args) {
		
		
		// Rectangle !!
		Rectangle(5, 12, false); // isFilled

	}
	
	public static void Rectangle(int h, int w, boolean isFilled) {
		
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				/*
				if( y == 0 || y == h - 1 || x == 0 || x == w - 1)
					System.out.print('*');
				else 
					System.out.print(' ');
				*/
				boolean b = (y == 0 || y == h - 1 || x == 0 || x == w - 1);
				System.out.print(!isFilled ? (b ? '*' : ' ') : (b ? '*' : '*'));
			}
			System.out.println();
		}
	}
}
