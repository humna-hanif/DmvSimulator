import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {

		Random random = new Random();
		int max = 100;
		int min = 1;
		int randomNum = random.nextInt((max - min) + 1) + min;
		System.out.println(
				"Welcome to the DMV. Your queue number is " + randomNum + ". Please wait until your number is called.");
		int userNumber = randomNum;
		for (int i = userNumber + 1; i > userNumber && i <= 100; i++) {
			System.out.println("Number " + i + " please step up to the counter.");
		}
		for (int i = 1; i >= 1 && i <= userNumber; i++) {
			System.out.println("Number " + i + " please step up to the counter.");
		}

		if (randomNum == 1) {
			System.out.println(
					"Thank you for having all of the required paperwork listed on the checklist. You are all set. Have a great day!");
		} else {
			System.out.println("Umm.. you do not have the required paper work. Come back when you do. Bye.");
		}
	}

}