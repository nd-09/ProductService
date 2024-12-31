package Adapter;

public class YesBankAdapter implements BankAPi{
    @Override
    public void getBalance() {
    YesBank yesBank = new YesBank();
    yesBank.checkBalance();
    }
}
