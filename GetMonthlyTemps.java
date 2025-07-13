import java.util.Scanner;

public class GetMonthlyTemps {
    public static void main(String[] args) {
        System.out.println("\n----Aurora Colorado Average Temperatures----");

        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        double[] temps = { 27.2, 29.6, 38.7, 46.5, 55.7, 68, 74.3, 71.5, 63.8, 49.7, 36.9, 26.6 };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--------------------------------------------");

            System.out.println("\nType a month name (e.g. March) to see its avg temp,");
            System.out.println("or type 'year' for the full summary, or 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("\nGoodbye!");
                System.out.println("");
                break;
            }

            if (input.equalsIgnoreCase("year")) {
                double total = 0;
                double highest = temps[0];
                double lowest = temps[0];

                System.out.println("\nYearly temperatures:");
                for (int i = 0; i < months.length; i++) {
                    System.out.println(months[i] + ": " + temps[i] + "\u00B0F");
                    total += temps[i];
                    if (temps[i] > highest)
                        highest = temps[i];
                    if (temps[i] < lowest)
                        lowest = temps[i];
                }

                double average = total / months.length;
                System.out.println("\nYearly average: " + average + "\u00B0F");
                System.out.println("Highest monthly avg: " + highest + "\u00B0F");
                System.out.println("Lowest monthly avg: " + lowest + "\u00B0F");

            } else {
                boolean found = false;
                for (int i = 0; i < months.length; i++) {
                    if (months[i].equalsIgnoreCase(input)) {
                        System.out.println("\n" + months[i] + ": " + temps[i] + "\u00B0F");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("\nInvalid month. Please type January-December, 'year', or 'exit'.");
                }
            }

        }

        scanner.close();
    }
}