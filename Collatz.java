// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int top = Integer.parseInt(args[0]);
		int seed = 1;
		int count = 0;
		int lastNum = 0;
		for(int i = 1; i < top+1; i++)
		{
			System.out.print(i + " ");
			while(lastNum != 1) {
				count++;
				if(seed % 2 ==0) {
					seed = seed / 2;
					lastNum = seed;
					System.out.println(seed);
				} else {
					seed = (seed * 3) + 1;
					lastNum = seed;
					System.out.println(seed);
				}
			}		
			System.out.println("(" + count + ")");
			System.out.print("Every one of the first " + top + " hailstone sequences reached 1.");	
		}
	}	
	
	}
	
	
