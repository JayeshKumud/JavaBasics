package library.MethodOverloading;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args){

        // static or compile time polymorphism
        // common, overridden and child method can be called.
        BMW bmw = new BMW();
        bmw.start();
        bmw.theftSefety();
        bmw.stop();

        // only parent or base method will be called
        Car car = new Car();
        car.start();
        car.stop();

        // dynamic or run time polymorphism
        // only common or overridden method can be called
        Car bmwCar = new BMW();
        bmwCar.start();
        bmwCar.stop();

        // Static polymorphism
        HSBCBank hsbcBank = new HSBCBank();
        hsbcBank.Credit();
        hsbcBank.Debit();
        hsbcBank.transferMoney();
        hsbcBank.CarLoan();
        hsbcBank.EducationLoan();

        // Dynamic polymorphism
        USBank usBank = new HSBCBank();
        usBank.Credit();
        usBank.Debit();
        usBank.transferMoney();

        // interface variable static in nature and cant be changed
        // USBank.minBalance = 12;
        System.out.println(USBank.minBalance);

        // only overridden method can be called
        // so EducationLoan and CarLoan method can not be called directly
        // ((HSBCBank) usBank).EducationLoan();
//        try {
//            Method method = bmwCar.getClass().getMethod("", Class.forName(""));
//            method.setAccessible(true);
//        }catch (NoSuchMethodException e){
//            System.out.println(e.getMessage());
//        }catch (ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
    }

}
