package DoWhile;

public class Cube {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int cube=i*i*i;
			i++;
			System.out.println(cube);
		}
		while(i<=10);

	}

}
