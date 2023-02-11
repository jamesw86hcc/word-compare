import java.util.Scanner;
public class WordCompare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        String word1, word2;

        do {
            System.out.println("Please enter a word:");
            word1 = input.nextLine();
            word1 = word1.trim();

            System.out.println("Please enter a second word:");
            word2 = input.nextLine();
            word2 = word2.trim();

            int comparison = word1.compareToIgnoreCase(word2);

            if (comparison < 0)
            {
                System.out.println(word1 + " comes before " + word2 + ".");
            } else if (comparison == 0)
            {
                System.out.println(word1 + " and "+ word2 + " are equal.");
            } else
            {
                System.out.println(word2 + " comes before " + word1 + ".");
            }
            boolean badResponse = false;
            do {
                System.out.println("Would you like to compare another set of words? (Yes/No)");
                String response = input.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    stop = false;
                    badResponse = false;
                } else if (response.equalsIgnoreCase("no")) {
                    stop = true;
                    badResponse = false;
                } else {
                    System.out.println("Sorry, I didn't understand " + response +". Please write 'yes' or 'no'. ");
                    badResponse = true;
                }
            } while (badResponse);
        } while (!stop);

        System.out.println("Goodbye.");
    }
}
