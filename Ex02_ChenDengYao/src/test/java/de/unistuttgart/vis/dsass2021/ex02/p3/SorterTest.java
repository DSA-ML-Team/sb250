package de.unistuttgart.vis.dsass2021.ex02.p3;

import static org.junit.Assert.*;

import org.junit.Test;

import de.unistuttgart.vis.dsass2021.ex02.p3.ISimpleList;
import de.unistuttgart.vis.dsass2021.ex02.p3.Sorter;


public class SorterTest {
	
	@Test	
	public void testSorter1() {
	
		int[] expected_list = {5,4,3,2,1};
		int[] origin_list = {3,5,4,2,1};
	
	
		ISimpleList simList = new SimpleList();
		ISimpleList expList = new SimpleList();
	
		for( int i=0 ; i< 5; i++   ) {
			simList.append(origin_list[i] );
			expList.append(expected_list[i] );
		}
		Sorter.selectionSort(simList);
	
		
		for(int i = 0; i< simList.size(); i++) {
		assertEquals( expList.get(i), simList.get(i)   );
		}
	}



	@Test	
	public void testSorter2() {
	
		int[] expected_list = {5,4,3,2,1};
		int[] origin_list = {3,5,4,2,1};
	
	
		ISimpleList simList = new SimpleList();
		ISimpleList expList = new SimpleList();
	
		for( int i=0 ; i< 5; i++   ) {
			simList.append(origin_list[i] );
			expList.append(expected_list[i] );
		}
		Sorter.insertionSort(simList);
	
		
		for(int i = 0; i< simList.size(); i++) {
		assertEquals( expList.get(i), simList.get(i)   );
		}
	}
	
	@Test	
	public void testSorter3() {
	
		int[] expected_list = {5,4,3,2,1};
		int[] origin_list = {3,5,4,2,1};
	
	
		ISimpleList simList = new SimpleList();
		ISimpleList expList = new SimpleList();
	
		for( int i=0 ; i< 5; i++   ) {
			simList.append(origin_list[i] );
			expList.append(expected_list[i] );
		}
		Sorter.bubbleSort(simList);
	
		
		for(int i = 0; i< simList.size(); i++) {
		assertEquals( expList.get(i), simList.get(i)   );
		}
	}

    
}
