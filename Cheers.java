// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String word = args[0].toUpperCase();
        String specialLettes = "AEFHILMNORSX";
        for(int i = 0 ; i < word.length() ; i++) {
                char letter = word.charAt(i);
                if(specialLettes.indexOf(letter) != -1) {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                } else {
                        System.out.println("Give me a  " + letter + ": " + letter + "!");
                }
                }
        System.out.println("What does that spell?");
        for(int m = 0; m < Integer.parseInt(args[1]); m++) {
                System.out.println(word + "!");
        }
            
        }
}

