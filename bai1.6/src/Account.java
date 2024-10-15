public class Account {
    String id;
    String name;
    int balance;
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        return balance + amount;
    }
    public int debit(int amount){
        if (amount <= balance) {
            balance -= amount;
        }else {
            System.out.println("Amount exceeds balance");
        }
        return balance;
    }
    public int  transfer(Account another, int amount){
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Not transfer...amout > balance!");
        }
        return balance;

        }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}




