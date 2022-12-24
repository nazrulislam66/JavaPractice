package com.java.search;

public class LinearSearchExample {

	//Linear search or sequential search is a method for finding a particular value in a list, that consists of 
	//checking every one of its elements, one at a time and in sequence, until the desired one is found.
	public static void main(String[] args) {
		int[] arr= {23,45,21,55,234,1,34,90};
        int key = 34;
        
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
            	System.out.println("Key "+key+" found at index: "+ i);
            }
        }

	}
	
	public static int linerSearch(int[] arr, int key){
        
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

}
