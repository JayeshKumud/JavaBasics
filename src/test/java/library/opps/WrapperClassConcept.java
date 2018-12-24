package library.opps;

public class WrapperClassConcept {

    public static void main(String args){

        String intNumber = "100";
        System.out.println(intNumber + 10);
        System.out.println(Integer.parseInt(intNumber) + 10);

        String doubleNumber = "100.25";
        System.out.println(Double.parseDouble(doubleNumber) + .75);

        String flag = "true";
        System.out.println(Boolean.parseBoolean(flag));

        int stringNumber = 200;
        System.out.println(String.valueOf(stringNumber) + 20);

    }

}
