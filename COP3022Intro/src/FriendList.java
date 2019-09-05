import java.util.Scanner;

public class FriendList {
	private static final int MAX_FRIENDS = 10;
	private static String[] friends = new String[MAX_FRIENDS];
	private static int friendsSoFar = 0;

	private static String readString(Scanner inp, String prompt) {
		System.out.print(prompt + " > ");
		return inp.nextLine();
	}

	private static void addFriend(String friend) {
		friends[friendsSoFar] = friend;
		friendsSoFar++;
	}

	private static void printFriends() {
		for (int i = 0; i < friendsSoFar; i++) {
			System.out.println(friends[i]);
		}
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String input;
		do {
			input = readString(inp, "Enter a new friend");
			if (!input.contentEquals("END")) {
				addFriend(input);
			}
		} while (!input.equals("END"));

		printFriends();

		System.out.println("Thank you!");
	}
}
