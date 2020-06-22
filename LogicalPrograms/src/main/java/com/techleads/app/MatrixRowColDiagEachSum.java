package com.techleads.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MatrixRowColDiagEachSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no. of rows of matrix");
		int row = scanner.nextInt();
		System.out.println("enter no. of coloums of matrix");
		int column = scanner.nextInt();

		int[][] a = new int[row][column];
		for(int r=0;r<row;r++) {
			for(int c=0;c<column;c++) {
				System.out.println(String.format("Enter element for  [%d][%d] " , r,c));
				a[r][c]=scanner.nextInt();
			}
		}
		scanner.close();
		
		for(int r=0;r<row;r++) {
			for(int c=0;c<column;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
			
		}
	System.out.println("Sum of each row");
	int rowSum=0;
	int colSum=0;
	int sumOfPrincipalDiagonal=0;
	int sumOfSecondaryDiagonal=0;
	
	List<Integer> rowSums=new ArrayList<>();
	List<Integer> colSums=new ArrayList<>();
	
	
	for (int r = 0; r < row; r++) {

		for (int c = 0; c < column; c++) {
			rowSum=rowSum+a[r][c];
			colSum=colSum +a[c][r];
		}
		System.out.println("Row sum: "+rowSum);
		rowSums.add(rowSum);
		colSums.add(colSum);
		System.out.println("column sum: "+colSum);
		rowSum=0;
		colSum=0;

	}
	
	
	for (int r = 0; r < row; r++) {

		for (int c = 0; c < column; c++) {
			
			if(r==c) {
				sumOfPrincipalDiagonal=sumOfPrincipalDiagonal+a[r][c];
			}
			
			if((r+c)==(row-1)) {
				sumOfSecondaryDiagonal=sumOfSecondaryDiagonal+a[r][c];
			}
			
		}
		

	}
		
	Integer maxRowSum = Collections.max(rowSums);
	Integer maxColSum = Collections.max(colSums);
	System.out.println("maxRowSum "+maxRowSum);
	System.out.println("maxColSum "+maxColSum);
	
	System.out.println("==============");
	
	System.out.println("sumOfPrincipalDiagonal "+sumOfPrincipalDiagonal);
	System.out.println("sumOfSecondaryDiagonal "+sumOfSecondaryDiagonal);
	
	
	

	}

}
