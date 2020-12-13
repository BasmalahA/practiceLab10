/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
<<<<<<< HEAD
		testPositive();
		testNegative();
=======
		testMixed();
		testDuplicates();
>>>>>>> test2
	}

    public testSelectionSort() {
    }
<<<<<<< HEAD
=======
		public void testMixed(){

			 /** Test data contains with both positive, negative and zeros **/
		 assertArrayEquals(new int[] {-2,-1,0,1,2},new SelectionSort().basicSelectionSort(new int[] {-1,0,2,-2,1}));
	 }

	 public void testDuplicates(){
>>>>>>> test2

			 /** Test data contains duplicates **/
		 assertArrayEquals(new int[] {-1,-1,0,2,2},new SelectionSort().basicSelectionSort(new int[] {-1,0,2,-1,2}));
	 }

	    public void testPositive(){
	        int[] arr = new int[5];
	        arr[0] = 8;
	        arr[1] = 9;
	        arr[2] = 7;
	        arr[3] = 10;
	        arr[4] = 2;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = 2;
	        Sortedarr[1] = 7;
	        Sortedarr[2] = 8;
	        Sortedarr[3] = 9;
	        Sortedarr[4] = 10;

	        SelectionSort temp=new SelectionSort();
	        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));

	        /** add tests to check for this unit test **/
	    }

	    public void testNegative(){

	        /** Test data contains negative values only **/
	    	assertArrayEquals(new int[] {-10,-8,-7,-5,-1},new SelectionSort().basicSelectionSort(new int[] {-1,-8,-10,-7,-5}));
	    }

}
