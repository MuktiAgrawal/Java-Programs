interface BankApplication { 
    void getBalance();
    void deposit(double amount); 
    void withdraw(double amount);
}

class AxisBank implements BankApplication { 
    double balance;
    String name;
    AxisBank(String name) { 
        this.name = name;
        balance = 0;
    }
    public void getBalance() {
        System.out.println("Balance of customer " + name + " in Axis Bank: " + balance);
    }
    public void deposit(double amount) { 
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}

class HDFC implements BankApplication { 
    double balance;
    String name;
    HDFC(String name) { 
        this.name = name; 
        balance = 0;
    }

    public void getBalance() {
        System.out.println("Balance of customer " + name + " in HDFC Bank: " + balance);
    }
    public void deposit(double amount) { 
        balance += amount;
    }
    public void withdraw(double amount) { 
        balance -= amount;
    }
}

public class Bank {
    public static void main(String[] args) { 
        AxisBank axis = new AxisBank("Harry"); 
        HDFC hdfc = new HDFC("Mosh");
        axis.deposit(5000); 
        hdfc.deposit(3000); 
        axis.withdraw(500);
        axis.getBalance();
        hdfc.getBalance();
    }
}
