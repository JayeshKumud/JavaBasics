package library.MethodOverloading;

public class HSBCBank implements USBank, BrazilBank {

    // overriding from USBank
    public void Credit(){
        System.out.println("HSBC Credit");
    }

    // overriding from USBank
    public void Debit(){
        System.out.println("HSBC Debit");
    }

    // overriding from USBank
    public void transferMoney(){
        System.out.println("HSBC transferMoney");
    }

    // overriding from brazil bank
    public void MutualFunds(){
        System.out.println("HSBC Mutual Funds");
    }

    public void CarLoan(){
        System.out.println("HSBC CarLoan");
    }

    public void EducationLoan(){
        System.out.println("HSBC EducationLoan");
    }

}
