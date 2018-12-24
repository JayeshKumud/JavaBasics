package library;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Basics {

    public void Arrat1DExample(){
        int[] aa1D = new int[4];
        int arr1[] = new int[5];
        Object[] arr2 = new Object[5];
        for(Object o : arr2){
            o = 1;
        }

        System.out.println(arr2.length);

        for (Object o : arr2){
            System.out.println(o);
        }
    }

    public void Arr2DExample(){

        int[][] arr2D = new int[2][3];
        System.out.println(arr2D.length); // number of rows
        System.out.println(arr2D[0].length); // number of columns

        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;

        arr2D[1][0] = 4;
        arr2D[1][1] = 5;
        arr2D[1][2] = 6;

        arr2D[2][0] = 7;
        arr2D[2][1] = 8;
        arr2D[2][2] = 9;

        for(int[] i : arr2D){
            for (int j : i){
                System.out.println(j);
            }
        }

        for (int i=0; i<arr2D.length; i++){
            for (int j=0; j<arr2D[i].length; j++){
                System.out.println(i + "," + j + " : " + arr2D[i][j]);
            }
        }

    }
}
