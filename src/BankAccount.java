public class BankAccount {

    private String name;
    private Card card;

    public BankAccount(String name, int ordinalNumber, int lastFourDigits, String validDate) {
        this.name = name;
        card = new Card(ordinalNumber,lastFourDigits,validDate);
    }

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Ordinal number: "+card.ordinalNumber);
        System.out.println("Last four digits of card number: "+"****"+" "+"****"+" "+"****"+" "+card.lastFourDigits);
        System.out.println("Valid date: "+card.validDate);
    }

    private class Card{
        private int ordinalNumber;
        private int lastFourDigits;
        private String validDate;

        public Card(int ordinalNumber, int lastFourDigits, String validDate) {
            this.ordinalNumber = ordinalNumber;
            this.lastFourDigits = lastFourDigits;
            this.validDate = validDate;
        }
    }
}
