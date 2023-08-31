public class tester {
    public static void main(String[] args) throws Exception {
        ATM bank = new ATM();
        bank.openAccount("hi@gmail.com", 0);
        bank.depositMoney("hi@gmail.com", 100);
        System.out.println("$$$" + bank.checkBalance("hi@gmail.com"));
        bank.withdrawMoney("hi@gmail.com", 200);
        bank.closeAccount("hi@gmail.com");
    }
}
