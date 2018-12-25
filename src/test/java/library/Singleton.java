package library;

public class Singleton {

    private String value;
    private static Singleton singleton;

    private Singleton() {
        value = "Test Singleton Class Test";
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public static void main(String[] args){
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.value = x.value.toUpperCase();

        System.out.println(x.value);
        System.out.println(y.value);
        System.out.println(z.value);
    }
}
