package library.MethodOverloading;

public interface USBank {

    // variables are by default are static in interface
    int minBalance = 10;

    public void Credit();
    public void Debit();
    public void transferMoney();
}
