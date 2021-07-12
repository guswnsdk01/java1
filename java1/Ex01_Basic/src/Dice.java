
public class Dice {

	public static void main(String[] args) {
		for(int a = 1; a<=6; a++) {
			for(int b = 1; b<=6; b++) {
				if(a + b == 6) {
					System.out.printf("%d %d \n", a, b);
				}
			}
		}

	}

}
