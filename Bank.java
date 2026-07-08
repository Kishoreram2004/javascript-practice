public class Bank {
    int accountNo;
    String name;
    int balance;
    Bank(int accNo, String name, int balance){
        this.accountNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    void deposit(int n){
        balance+=n;
        System.out.println("amount deposited successfully");
    }   

    void withdraw(int n){
        if(balance>=n){
            balance-=n;
            System.out.println(n + " amount withdraw");
        }else{
            System.out.println("insufficient balance");
        }

    }
    void checkBalance(){
        System.out.println("balance: " +balance );
    }

    void display(){
        System.out.println(name);
        System.out.println(accountNo);
        System.out.println(balance);
    }
    public static void main(String[] args){
        Bank obj = new Bank(12533, "kishore", 100000);
        obj.display();
        obj.deposit(100000);
        obj.checkBalance();
        obj.withdraw(200000);
        obj.checkBalance();
    }
}
