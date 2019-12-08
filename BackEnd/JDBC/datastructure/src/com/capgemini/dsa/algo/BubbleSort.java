package com.capgemini.dsa.algo;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
	 static void bubblesort( int[] arr) {
			int n=arr.length;
			int temp=0;
			
			for(int i=0;i<n;i++) {
				for(int j=1;j<(n-i);j++) {
					if(arr[j-1]>arr[j]) {
						temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			}
			public static void main(String[] args) {
				int arr[]= {20,80,65,43};
				System.out.println("before sorting");
				for(int i=0;i<arr.length;i++) {
					
					System.out.println(arr[i]+"");
			}
				System.out.println();
				bubblesort(arr);
				System.out.println("after sorting");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]+"");
					countingDuration2();
				}
		}
			public static long addUptoQuick(Long number) {
				return number * (number + 1) / 2;
			}
			public static void countingDuration2() {
				long number = 99999999L;
				Instant start = Instant.now();
				System.out.println("addUpto: " + addUptoQuick(number));
				Instant end = Instant.now();
				long duration = Duration.between(start, end).toMillis();
				double seconds = duration / 1000.0;
				System.out.println("addUpto time: " + seconds + " seconds");
			}


}
