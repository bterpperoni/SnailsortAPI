package com.snail.sort.SnailsortAPI.service;

import com.snail.sort.SnailsortAPI.model.SnailArrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// This class provides comportment & methods with specials services instead of set a 2d array to test algorithm & then the method
// which return the array elements arranged from outermost elements to the middle element, traveling clockwise.
@Component
public class SnailService {

    // Var to dump a value in tab[][]
    public static final int DUMP = -1;

    // This is for the testSnailArrays() test method
    public static SnailArrays getSnailArray(){
        SnailArrays sa = new SnailArrays();
        return sa;
    }

     public static int[][] setArray(SnailArrays ar) {
         // Get the length of the current tab[]
         int[] array = ar.getTabTort();
         // Declare array for convert to
         int[][] toSnArray = new int[][]{{}};
         int ra = array.length;
         if (isPoweroftwo(ra)) {
             // If ok for square Array, set the number of n ( for tab[n][n] )
             int wh = (int) Math.sqrt(ra);
             // First for set to add all height values of tab[] in tab[][]
             // Second for set to add all width values of tab[] in tab[][]
             for (int p = 0; p < ra; p++) {
                 for (int u = 0; u < wh; u++) {
                     toSnArray[p][u] = array[ra];
                     ra--;
                 }
             }
         }
         return toSnArray;
     }

    // function to snail sort tab[][], return a tab[] int
    public static int[] Sort(SnailArrays ar){
        int[][] array = ar.getTortTab();
        int sizeTab = array.length;
        int sizeOfFirstLine = array[0].length;
        int isValidArray = sizeOfFirstLine * sizeTab;

        if(isPoweroftwo(isValidArray)){
            // Print tab[][] like a matrices
            for(int[] number:array){
                System.out.println(Arrays.toString(number));    }

            // result[] will have a length equals to the size (tab[][])²
            int[] result = new int[(int) Math.pow(sizeTab, 2)];
            // Value to move right & left in the tab[][]
            int x = 0;
            int tx = 1;
            // Value to move up & down in the tab[][]
            int y = 0;
            int ty = 0;

            // Iterations n² length for result[]
            for(int i = 0;i<result.length;++i){
                // add width & height attribute to move to tab[][] efficiency
                // Assign first element to result[]
                result[i] = array[y][x];
                // then dump value
                array[y][x] = DUMP;
                y += ty;    // 1) y = 0 & ty = 0 | ..
                x += tx;    // 1) x = 1 & tx = 1 | ..

                // Ex. of size 3x3 : Next value --> tab[ y = 0 ][ x = 1 ] .. to tab[0][3], then
                // we decrement x (tab[0][2]) to become in range tab & we increment y to get the value
                // in the next sub array (tab[1][2]) ..
                if(tx != 0 && (x>=sizeTab || x<0 || array[y][x] == DUMP)){
                    x -= tx;
                    y += tx;
                    ty = tx;
                    tx = 0;
                }else if(ty != 0 && (y>=sizeTab || y<0 || array[y][x] == DUMP)){
                    x -= ty;
                    y -= ty;
                    tx = -ty;
                    ty = 0;
                }
            }
            return result;
        }
        return null;
    }

    // function to determine if the given tab[n²] size allow to construct a square tab[n][n]
    public static boolean isPoweroftwo(int size){
        if((size & -(size)) == size){
            return true;
        }
        return false;
    }
}
