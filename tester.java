public class tester {
    public static void main(String[] args) throws Exception {
        ATM bank = new ATM();
        bank.openAccount("hi@gmail.com", 100);
        bank.openAccount("bye@gmail.com", 100);
        bank.transferMoney("bye@gmail.com", "hi@gmail.com", 50);
        System.out.println("hi $$$" + bank.checkBalance("hi@gmail.com"));
        System.out.println("bye $$$" + bank.checkBalance("bye@gmail.com"));

        bank.audit();

    }
}
