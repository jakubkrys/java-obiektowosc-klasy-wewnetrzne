import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccountRepo bankAccountRepo = new BankAccountRepo(10);
        int option;

        do {
            System.out.println("----- Bank Account App -----");
            System.out.println("1 - add card");
            System.out.println("2 - display all cards");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Card name: ");
                    String name = scanner.nextLine();
                    System.out.print("Card ordinal number: ");
                    int ordinalNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Last four digits of card number: ");
                    int lastFourDigits = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Valid date (MM/YY): ");
                    String validDate = scanner.nextLine();

                    BankAccount bankAccount = new BankAccount(name,ordinalNumber,lastFourDigits,validDate);

                    bankAccountRepo.add(bankAccount);
                    break;
                case 2:
                    bankAccountRepo.displayAll();
                    break;
            }
        } while (option != 0);
    }
}
