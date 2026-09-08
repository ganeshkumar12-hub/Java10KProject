package com.coders.arrays;
//A 2D array is an array of arrays used to store data in the form of rows and columns, like a table or matrix.
public class array3d {

	public static void main(String[] args) {
		int[][] arr = {
	            {10, 20, 30},
	            {40, 50, 60},
	            {70, 80, 90}
	        };

	        for (int i = 0; i < 3; i++) {

	            for (int j = 0; j < 3; j++) {

	                System.out.print(arr[i][j] + " ");
	            }

	            System.out.println();
	        }
	}

}
