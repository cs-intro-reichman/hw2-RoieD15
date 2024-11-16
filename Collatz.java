// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int count = 0;
		int seed = 1;
		int lastChar = 0;
		for(int i = 0; i < Integer.parseInt(args[0]); i++) {
			System.out.print(seed + " ");
			while(lastChar != 1) {
			if(lastChar % 2 == 0) {
				lastChar = seed / 2;
			} else {
				lastChar = (seed * 3) + 1;
			}
			System.out.print(lastChar + " ");
			count++;
			seed++;
		}
		System.out.println("(" + count + ")");
		}
		System.out.println("Every one of the first " + args[0] + "hailstone sequences reached 1.");
	}
}
