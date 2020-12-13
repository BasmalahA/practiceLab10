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
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
		public void testMixed(){

			 /** Test data contains with both positive, negative and zeros **/
		 assertArrayEquals(new int[] {-2,-1,0,1,2},new SelectionSort().basicSelectionSort(new int[] {-1,0,2,-2,1}));
	 }

	 public void testDuplicates(){

			 /** Test data contains duplicates **/
		 assertArrayEquals(new int[] {-1,-1,0,2,2},new SelectionSort().basicSelectionSort(new int[] {-1,0,2,-1,2}));
	 }

}
