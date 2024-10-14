package pac1;

public class AccBal {
    String name;
    double bal;

    public static void main(String[] args) {
        AccBal account = new AccBal("John Doe", 1000.00);
        account.show();
    }

    
    public AccBal(String n, double b) {
        name = n;
        bal = b;
    }

   
    public void show() {
        if (bal > 0) {
            System.out.println("Balance of " + name + " is: $" + bal);
        }
    }

   
}
