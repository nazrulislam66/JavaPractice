package com.javapractice.numberpyramid;

public class PyramidNumber3 {

	public static void main(String[] args) {
		
		for (int i = 0; i <9; i++){
			for (int j = 9; j > i; j--){
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++){
				System.out.print(k + 1);
			}
			System.out.println();
		}
		
	}

}
