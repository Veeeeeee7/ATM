import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.security.MessageDigest;

public class ATM {
    private HashMap<String, Double> accounts;

    public ATM() {
        accounts = new HashMap<String, Double>();
    }

    public void openAccount(String email, double deposit) throws Exception {
        if (accounts.containsKey(email)) {
            throw new Exception("account already exists");
        }
        accounts.put(email, deposit);
    }

    public void closeAccount(String email) throws Exception {
        if (accounts.containsKey(email)) {
            if (accounts.get(email) > 0) {
                throw new Exception("need to withdraw $$$ before closing");
            } else {
                accounts.remove(email);
            }
        }
    }

    public double checkBalance(String email) throws Exception {
        if (accounts.containsKey(email)) {
            return accounts.get(email);
        } else {
            throw new Exception("no account is found");
        }
    }

    public void depositMoney(String email, double deposit) throws Exception {
        if (accounts.containsKey(email)) {
            if (deposit > 0) {
                accounts.put(email, accounts.get(email) + deposit);
            } else {
                throw new Exception("cant deposit debt *******");
            }
        } else {
            throw new Exception("broke AF");
        }
    }

    public void withdrawMoney(String email, double amount) throws Exception {
        if (accounts.containsKey(email)) {
            if (amount > 0) {
                if (accounts.get(email) >= amount) {
                    accounts.put(email, accounts.get(email) - amount);
                } else {
                    throw new Exception("broke AFFFFF");
                }
            } else {
                throw new Exception("cant withdraw debt *******");
            }
        } else {
            throw new Exception("broke AF");
        }
    }

}
