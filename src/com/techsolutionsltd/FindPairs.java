package com.techsolutionsltd;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 	Array = [1, 2, 5, 1, 8, 1, 2]	Size = 7
 *  
 *  Pairs = [1, 1, 1], [2, 2], [5], [8]
 *  	  
 *  	  = [1, 1], [2, 2], [1, 5, 8]-->ODD
 *  
 *   	  = 2
 *
 */

public class FindPairs {
	private static int ODDS = 0;

	private static int findPairsOf(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		int pairs = 0;
		
		for(int i=0; i<arr.length; i++) {
//			If that element is not present then add the element.
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			} 
//			Else remove the element as is preset already, Hence it's a PAIR.
			else {
				pairs++;
				set.remove(arr[i]);
			}
		}
		ODDS = set.size();
		return pairs;
	}
	
//	Find Odds 
	private static int findOddsOf(int[] arr) {
		findPairsOf(arr);
		return ODDS;
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
//			Input : Array Size
			System.out.print("Enter Array Size : ");
			int arrSize = sc.nextInt();
			System.out.println();
			
//			Declare Array & Taking Inputs
			int[] arr = new int[arrSize];
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("Enter "+ (i+1) + " th Element : ");
				arr[i] = sc.nextInt();
				System.out.println();
			}
			
//			Print Array
			System.out.print("Array : ");
			for(int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
			
//			Print Sorted Array
			System.out.print("\nSorted Array : ");
			Arrays.sort(arr);
			for(int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
			
//			Find Pairs
			System.out.println("\nPairs : " + findPairsOf(arr));
			
//			FInd Odds
			System.out.println("\nOdds : " + findOddsOf(arr));
		}
		
	}

}
