import java.util.Scanner;

public class BannedBooksAuthorsQuotes {
	
	static int userSelection;
	
	static Scanner $userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("Welcome to Banned Books Author Quotes!\nCreated in honor of Banned Books Week!");
		System.out.print("How would you like to view the quotes, Randomly or By Author?\n[1] Randomly, [2] By Author: ");
		
		String rawInput = $userInput.nextLine();
		userSelection = Integer.parseInt(rawInput); 
		
		if (userSelection == 1) {
			System.out.println("Feature not supported yet!");
		} else if (userSelection == 2) {
			System.out.println("\n" + selectAuthor());
		}
	}
	
	public static String selectAuthor() {
		String authorChoice;
		String authorQuote = null;
		
		String aldousHuxley = "\"You shall know the truth and the truth shall make you mad.\"";
		String aynRand = "\"I swear by my life and my love of it that I will never live for the sake of another man, nor ask another man to live for mine.\"";
		String charlesDarwin = "\"I am not apt to follow blindly the lead of other men.\"";
		String danBrown = "\"Great minds are always feared by lesser minds.\"";
		String georgeOrwell = "\"In a time of deceit telling the truth is a revolutionary act.\"";
		String jkRowling = "\"It is impossible to live without failing at something, unless you live so cautiously that you might as well not have lived at all - in which case, you fail by default.\"";
		String maryShelly = "\"Nothing is so painful to the human mind as a great and sudden change.\"";
		String rayBradbury = "\"There is more than one way to burn a book. And the world is full of people running about with lit matches.\"";
		String salmanRushdie = "\"What is freedom of expression? Without the freedom to offend, it ceases to exist.\"";
		String shirleyJackson = "\"I delight in what I fear.\"";
		String suzaneCollins = "\"Stupid people are dangerous.\"";
		String thomasPaine = "\"The mind once enlightened cannot again become dark.\"";
		
		System.out.println("\n\n\nPlease type the name of the Banned Books Author you want to see a quote from, exactly as it is listed below!\n[Aldous Huxley, Ayn Rand, Charles Darwin, Dan Brown,\nGeorge Orwell, J.K. Rowling, Mary Shelly, Ray Bradbury,\nSalman Rushdie, Shirley Jackson, Suzane Collins, Thomas Paine]");
		System.out.print("Please type the authors name: ");
		
		authorChoice = $userInput.nextLine();
		
		if (authorChoice.equalsIgnoreCase("Aldous Huxley")) {
			authorQuote = aldousHuxley;
		} else if (authorChoice.equalsIgnoreCase("Ayn Rand")) {
			authorQuote = aynRand;
		} else if (authorChoice.equalsIgnoreCase("Charles Darwin")) {
			authorQuote = charlesDarwin;
		} else if (authorChoice.equalsIgnoreCase("Dan Brown")) {
			authorQuote = danBrown;
		} else if (authorChoice.equalsIgnoreCase("George Orwell")) {
			authorQuote = georgeOrwell;
		} else if (authorChoice.equalsIgnoreCase("J.K. Rowling")) {
			authorQuote = jkRowling;
		} else if (authorChoice.equalsIgnoreCase("Mary Shelly")) {
			authorQuote = maryShelly;
		} else if (authorChoice.equalsIgnoreCase("Ray Bradbury")) {
			authorQuote = rayBradbury;
		} else if (authorChoice.equalsIgnoreCase("Salman Rushdie")) {
			authorQuote = salmanRushdie;
		} else if (authorChoice.equalsIgnoreCase("Shirley Jackson")) {
			authorQuote = shirleyJackson;
		} else if (authorChoice.equalsIgnoreCase("Suzane Collins")) {
			authorQuote = suzaneCollins;
		} else if (authorChoice.equalsIgnoreCase("Thoman Paine")) {
			authorQuote = thomasPaine;
		} else {
			authorQuote = "Error! Please type a name from above!";
		}
		
		
		return authorQuote;
	}
}