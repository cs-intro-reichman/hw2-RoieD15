// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int top = Integer.parseInt(args[0]);
		int count = 0;
		int seed = 0;
		for(int i = 0; i < top; i++) {
			System.out.print(i + " ");
			while(seed != 1) {
				seed = i;
				if(seed % 2 == 0) {
					seed = seed / 2;
					System.out.println("(" + seed + ")");
					count++;
				} else {
					seed = (seed * 3) + 1;
					System.out.println("(" + seed + ")");
					count++;
				}
			}
			System.out.println("(" + count + ")");
			seed++;
		}
		System.out.println("Every one of the first " + top + " hailstone sequences reached 1.");
	
	}
	}
	
