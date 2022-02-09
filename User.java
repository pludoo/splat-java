enum AccountType { BASE, SYSADMIN }

public class User {

    // initialize private vars
    private String username;
    private AccountType accountType;

    private int totalSolved;
    private int totalUnsolved;

    // initialize public vars
    public Bug WIP;
    public int identifier;

    // getters
    public String getUsername() { return username; }
    public AccountType getAccountType() { return accountType; }

    // constructor
    public User(String _username, AccountType _accountType) {
        username = _username; // setting username var to parameter
        accountType = _accountType;
        identifier = username.hashCode(); // generate identifier by hashcode
        System.out.println("Added New User: " + username + " { " + identifier + " }"); // debugging
    }
}
