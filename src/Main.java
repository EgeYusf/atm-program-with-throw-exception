 public class Main {

    public static void main(String[] args) {
        BankManager manager = new BankManager();
        System.out.println("Hesap bakiyesi = "+manager.getBalance());
        manager.deposit(200);
        System.out.println("Hesap bakiyesi = "+manager.getBalance());
        try {
            manager.withdraw(250); // İstisna fırlatabilir
            System.out.println("Hesap bakiyesi = " + manager.getBalance());
        } catch (Exception m) {
            System.out.println(m.getMessage()); // İstisna yakalandığında burası çalışır
        }

        System.out.println("Hesap bakiyesi = "+manager.getBalance());






        }
    }
