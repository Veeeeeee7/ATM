public class tester {
    public static void main(String[] args) throws Exception {
        ATM bank = new ATM();
        bank.openAccount("hi@gmail.com", 0);

        bank.closeAccount("hi@gmail.com");
    }
}
