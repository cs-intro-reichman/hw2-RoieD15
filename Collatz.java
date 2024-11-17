// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int top = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		if(mode == 'v') {
			for(int i = 1; i < top+1; i++) {
			System.out.print(i + " ");
			int seed = i;
			int count = 1;
			int lastNum = 0;
			while(lastNum != 1) {
				if(seed % 2 ==0) {
					seed = seed / 2;
					lastNum = seed;
					count++;
					System.out.print(seed + " ");
				} else {
					seed = (seed * 3) + 1;
					lastNum = seed;
					count++;
					System.out.print(seed + " ");
				}
			}		
			System.out.println("(" + count + ")");	
		}
		System.out.print("Every one of the first " + top + " hailstone sequences reached 1.");
		} else {
			System.out.print("Every one of the first " + top + " hailstone sequences reached 1.");
		}
	}
}	
	
	
	
	
