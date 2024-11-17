// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    System.out.println("pi according to Java: " + Math.PI);
		int terms = Integer.parseInt(args[0]);
		double approximatePi = 1.0;
		double divider = 3.0;
		for(int i = 0; i < terms-1; i++) {
			if(i % 2 == 0) {
				approximatePi = approximatePi - (1.0 / divider);
			} else {
				approximatePi = approximatePi + (1.0 / divider);
			}
			divider = divider + 2;
		}
		System.out.println("pi, approximated:     " + approximatePi * 4.0);
	}
}
