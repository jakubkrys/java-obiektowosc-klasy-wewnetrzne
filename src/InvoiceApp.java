import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InvoiceRepo invoiceRepo = new InvoiceRepo(100);
        int option;

        do {
            System.out.println("Invoice App");
            System.out.println("1 - add invoice");
            System.out.println("2 - display all");
            System.out.println("0 - quit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ordinal number: ");
                    int ordinalNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();

                    Invoice invoice = new Invoice(number,ordinalNumber,price);
                    invoiceRepo.add(invoice);
                    break;
                case 2:
                    invoiceRepo.displayAll();
                    break;
            }
        } while (option != 0);
    }
}
