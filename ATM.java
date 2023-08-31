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

}
