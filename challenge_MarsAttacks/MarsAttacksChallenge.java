/**
 * 
 */
package challenge_MarsAttacks;

/**
 * 
 */
public class MarsAttacksChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The message

		String[] message = { "FBI Report on UFOs", "We believe UFOs do visit our planet.",

		 "Many cows have been abducted in Roswell New Mexico USA", "Several reports of Aliens have been made",

		 "We think they come from Mars", "The FBI are concerned about public panic", "Strictly confidential",

		 "For your eyes only Mr President", "God help us all and God bless America", "End of message..." };


		// the words that will be redacted

		String[] wordsToRedact = { "FBI", "UFO", "UFOs", "Roswell", "Cow", "Cows", "Abducted", "Mars", "Alien",

		 "Aliens", "President", "America" };
		
		// Display full message
		
		System.out.println("Full Version");
		System.out.println();
		for (int i = 0; i <message.length; i++) {
			System.out.println(message[i]);
		}
		
		// Parse sentence into words
		System.out.println();
		System.out.println("Redacted Message");
		for (int i = 0; i < message.length; i++) {
			String[] words = message[i].split(" ");
			for (String word : words) {
				if (isItABannedWord(word, wordsToRedact)){
					for (int j = 0; j < word.length(); j++) {
						System.out.print("\u25A0");
					} 
					System.out.print(" ");
				}
				else {
						System.out.print(word + " ");
					}
				}
				System.out.println();

			}
		}
		
	
	public static boolean isItABannedWord(String wordToCheck, String [] wordsToRedact) {
		
		for (String word : wordsToRedact) {
			if (word.equalsIgnoreCase(wordToCheck)) {
				return true;
			}
		}
		return false;
		
	}

}
