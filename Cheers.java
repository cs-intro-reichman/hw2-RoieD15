// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            String specialLettes = "AEFHILMNORSX";
            for(int i = 0 ; i < word.length() ; i++){
                char letter = word.charAt(i);
                for(int j = 0; j < specialLettes.length(); j++) {
                        if(specialLettes.charAt(j) == letter){
                                System.out.println("Give me an " + letter + ":" + letter + "!");
                        } else {
                                System.out.println("Give me a " + letter + ":" + letter + "!");
                        }
                }
                
            }
        }
}
