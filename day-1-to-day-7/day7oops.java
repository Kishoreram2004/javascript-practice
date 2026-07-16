interface Payment{
    public void pay(double amount);

}

class UpiPayment implements Payment{
    public void pay(double amount){
        System.out.println("UpiPayment: "+ amount);
}}


class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("credit card payment: "+ amount);
    }
}
class NetBankingPayment implements Payment{
    public void pay(double amount){
        System.out.println("NetBankingPayment: "+ amount);
    }
}


class day7oops{
    public static void main(String[] args){
        UpiPayment ob1 = new UpiPayment();
        CreditCardPayment ob2 = new CreditCardPayment();
        NetBankingPayment ob3 = new NetBankingPayment();
        ob1.pay(100);
        ob2.pay(200);
        ob3.pay(5000);
    }
}