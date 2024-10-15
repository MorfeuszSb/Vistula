public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu Account
        Account myAccount = new Account("Jan Kowalski", 1000, "123456789");

        try {
            myAccount.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił inny błąd: " + e.getMessage());
        } finally {
            System.out.println("Aktualny stan konta: " + myAccount.getBalance() + " zł.");
        }
    }
}
