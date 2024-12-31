package Adapter;

public class Client {

    public static void main(String[] args) {
//        BankAPi bank = new ICICIAdapter();
        BankAPi bank = new YesBankAdapter();
        bank.getBalance();
    }
}
