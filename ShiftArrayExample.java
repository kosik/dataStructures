package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author skosoy@gmail.com
 */
public class ShiftArrayExample {

    public static void main(String[] argv) throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6};
        ShiftArrayExample example = new ShiftArrayExample();
        
        array = example.shift(array, 2);
        System.out.println(Arrays.toString(array));
        
        System.out.println("\nGood look");

    }
    
    /**
     * Recursive shifting of an array
     * @param array 
     * @param shiftAmount
     * @return 
     */
    private final int[] shift(int[] array, int shiftAmount){
        if(shiftAmount > 1){
            shiftAmount--;
            array = shift(array, shiftAmount);
        }
        
        int value = array[array.length-1];
        System.arraycopy(array, 0, 
                array, 1, array.length-1);
        array[0] = value;
        return array;
    }
    
}
