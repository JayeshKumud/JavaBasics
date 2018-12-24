package library.opps;

public class CallByValueCallByReference {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    CallByValueCallByReference(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args){

        CallByValueCallByReference obj = new CallByValueCallByReference(10, 20);
        int x = obj.a;
        int y = obj.b;
        obj.Sum(x,y); // Copy of input or call by value

        System.out.println("value of varibale before swap program.");
        System.out.println("value of a : " + obj.a + ", and b : " + obj.b + " using reference");
        System.out.println("value of a : " + obj.getA() + ", and b : " + obj.getB() + " using getter");
        obj.swap(obj); // Call by reference
        System.out.println("value of varibale after swap program.");
        System.out.println("value of a : " + obj.a + ", and b : " + obj.b + " using reference");
        System.out.println("value of a : " + obj.getA() + ", and b : " + obj.getB() + " using getter");
    }



    private int Sum(int a, int b){
        return a + b;
    }

    private void swap(CallByValueCallByReference o){
        int temp = o.b;
        o.b = o.a;
        o.a = temp;
    }

}
