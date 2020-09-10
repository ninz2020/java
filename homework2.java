package lesson2;
import java.util.Arrays;
public class homework2 {


    public static void main(String[] args){

        int[]array={1,1,0,0,1,0,1,1,0,0};

        for(int i=0;i<array.length;i++) {
            if (array[i] == 1) {
                array[i] = 0;
        }
        else {
            array[i]=1;
        }
        }

        System.out.println(Arrays.toString(array));

    }

   public static void main(String [] args) {
        int[] array = new int[8];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            j +=3;
        }
        System.out.println(Arrays.toString(array));
    }

   public static void main(String [] args) {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            if (j < 6) {
                array [i] = j * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String [] args) {
        int[][] array = new int[4][4];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array [i][i] = array [i][lastIndex -i] = 1;
            {

        for (int[]) intArray : array) {
            System.out.println(Arrays.toString(intArray));
        }
    }

}