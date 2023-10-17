interface Bank {
    void bank();

    static int balance(int x) {
        return x * x * x;
    }
}

class Account implements Bank {
    public void bank() {
        System.out.println("balance");
    }
}

public class AccountInterfaceStatic {
    public static void main(String args[]) {
        Account d = new Account();
        d.bank();
        System.out.println(Bank.balance(500));
    }
}
