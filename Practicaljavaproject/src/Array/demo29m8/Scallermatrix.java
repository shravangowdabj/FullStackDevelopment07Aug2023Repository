package Array.demo29m8;

public class Scallermatrix {

	public static void main(String[] args) {
		int x[][] = { { 6, 3, 5 }, { 9, 8, 5 } };

		{

			for (int i = 0; i < x.length; i++) {

				for (int j = 0; j < x[i].length; j++) {

					System.out.print(x[i][j] * 2 + " ");

				}

				System.out.println(" ");

			}

		}

	}

}
