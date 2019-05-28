package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
 public static void main(String args[]){

     int[]  arrayOne = new int[10];
     int[]  arrayTwo = Arrays.copyOf(arrayOne,12);
     for( int element :arrayTwo )
         System.out.println(element);
     ArrayList[] a;
 }
}
