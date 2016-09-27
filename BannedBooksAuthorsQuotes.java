import java.util.Scanner;
import java.util.Random;

public class BannedBooksAuthorsQuotes {

	static int userSelection;

	static Scanner $userInput = new Scanner(System.in);

	static Random randomNumber = new Random();

	static final String aldousHuxley = "\"You shall know the truth and the truth shall make you mad.\"";
	static final String aynRand = "\"I swear by my life and my love of it that I will never live for the sake of another man, nor ask another man to live for mine.\"";
	static final String charlesDarwin = "\"I am not apt to follow blindly the lead of other men.\"";
	static final String danBrown = "\"Great minds are always feared by lesser minds.\"";
	static final String georgeOrwell = "\"In a time of deceit telling the truth is a revolutionary act.\"";
	static final String jkRowling = "\"It is impossible to live without failing at something, unless you live so cautiously that you might as well not have lived at all - in which case, you fail by default.\"";
	static final String maryShelly = "\"Nothing is so painful to the human mind as a great and sudden change.\"";
	static final String rayBradbury = "\"There is more than one way to burn a book. And the world is full of people running about with lit matches.\"";
	static final String salmanRushdie = "\"What is freedom of expression? Without the freedom to offend, it ceases to exist.\"";
	static final String shirleyJackson = "\"I delight in what I fear.\"";
	static final String suzaneCollins = "\"Stupid people are dangerous.\"";
	static final String thomasPaine = "\"The mind once enlightened cannot again become dark.\"";

	public static void main(String[] args) {

		System.out.println("Welcome to Banned Books Author Quotes!\nCreated in honor of Banned Books Week!");
		System.out.print("How would you like to view the quotes, Randomly or By Author?\n[1] Randomly, [2] By Author: ");

		String rawInput = $userInput.nextLine();
		userSelection = Integer.parseInt(rawInput);

		if (userSelection == 1) {
			randomAuthor();
		} else if (userSelection == 2) {
			System.out.println("\n" + selectAuthor());
		}
	}

	public static void randomAuthor() {
		String authorQuote;

		String authorName = null;

		int authorSelector = randomNumber.nextInt(12) + 1;

		if (authorSelector == 1) {
			authorQuote = aldousHuxley;
			authorName = "Aldous Huxley";
		} else if (authorSelector == 2) {
			authorQuote = aynRand;
			authorName = "Ayn Rand";
		} else if (authorSelector == 3) {
			authorQuote = charlesDarwin;
			authorName = "Charles Darwin";
		} else if (authorSelector == 4) {
			authorQuote = danBrown;
			authorName = "Dan Brown";
		} else if (authorSelector == 5) {
			authorQuote = georgeOrwell;
			authorName = "George Orwell";
		} else if (authorSelector == 6) {
			authorQuote = jkRowling;
			authorName = "J.K. Rowling";
		} else if (authorSelector == 7) {
			authorQuote = maryShelly;
			authorName = "Mary Shelly";
		} else if (authorSelector == 8) {
			authorQuote = rayBradbury;
			authorName = "Ray Bradbury";
		} else if (authorSelector == 9) {
			authorQuote = salmanRushdie;
			authorName = "Salman Rushdie";
		} else if (authorSelector == 10) {
			authorQuote = shirleyJackson;
			authorName = "Shirley Jackson";
		} else if (authorSelector == 11) {
			authorQuote = suzaneCollins;
			authorName = "Suzane Collins";
		} else if (authorSelector == 12) {
			authorQuote = thomasPaine;
			authorName = "Thomas Paine";
		} else {
			authorQuote = "Error! Please type a name from above!";
			authorName = "Error!";
		}

		System.out.println("\n" + authorQuote + " --" + authorName);


	}

	public static String selectAuthor() {
		String authorChoice;
		String authorQuote = null;

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
