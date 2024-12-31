package Adapter;

public class ICICIAdapter implements BankAPi{
    @Override
    public void getBalance() {
     ICICIBank bank = new ICICIBank();
     bank.checkBal();
    }
}
