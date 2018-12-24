package library.opps;

public class Car_ClassAndObjects {

    int wheels;
    int mod;

    public static void main(String[] args){

        Car_ClassAndObjects a = new Car_ClassAndObjects();
        Car_ClassAndObjects b = new Car_ClassAndObjects();
        Car_ClassAndObjects c = new Car_ClassAndObjects();

        a.mod = 2014;
        a.wheels = 4;

        b.mod = 2015;
        b.wheels = 5;

        c.mod = 2016;
        c.wheels = 6;

        System.out.println("before assigning references");

        System.out.println(a.mod);
        System.out.println(a.wheels);

        System.out.println(b.mod);
        System.out.println(b.wheels);

        System.out.println(c.mod);
        System.out.println(c.wheels);

        a=b;
        b=c;
        c=a;

        System.out.println("after assigning references");

        System.out.println(a.mod);
        System.out.println(a.wheels);

        System.out.println(b.mod);
        System.out.println(b.wheels);

        System.out.println(c.mod);
        System.out.println(c.wheels);
    }

}
